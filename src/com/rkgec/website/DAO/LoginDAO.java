package com.rkgec.website.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rkgec.website.DAO.CommonDAO;
import com.rkgec.website.DTO.LoginDTO;

public class LoginDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	boolean isFound = false;

	public boolean isUserExist(LoginDTO loginDTO) throws SQLException, ClassNotFoundException {
		try {
			con = CommonDAO.getConnection();
			if (con != null) {
				System.out.println("con. created..");
			} else {
				System.out.println("no con. created");
			}
			pstmt = con.prepareStatement("select name,password from registration_mst where name=? and password=?");
			pstmt.setString(1, loginDTO.getUserid());
			pstmt.setString(2, loginDTO.getPassword());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				isFound = true;
				System.out.println("found in db");
			} else {
				System.out.println("not found in db");
				isFound = false;
			}
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return isFound;
	}

}
