package com.rkgec.website.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rkgec.website.DTO.RegistrationDTO;

public class RegistrationDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	boolean isFound = false;

	public boolean isRegistered(RegistrationDTO registrationDTO) throws SQLException, ClassNotFoundException {
		boolean isUpdated = false;
		try {
			con = CommonDAO.getConnection();
			if (con != null) {
				System.out.println("con. created..");
			} else {
				System.out.println("no con. created");
			}
			pstmt = con.prepareStatement("insert into registration_mst VALUES (?,?,?,?,?,?,?,?,?,?);");
			
			pstmt.setString(1, registrationDTO.getName());
			pstmt.setString(2, registrationDTO.getEmail());
			pstmt.setString(3, registrationDTO.getPassword());
			pstmt.setString(4, registrationDTO.getGender());
			pstmt.setString(5, registrationDTO.getDOB());
			pstmt.setString(6, registrationDTO.getAddress());
			pstmt.setString(7, registrationDTO.getCity());
			pstmt.setString(8, registrationDTO.getState());
			pstmt.setString(9, registrationDTO.getCountry());
			pstmt.setString(10, registrationDTO.getContact());
			int recordEffected = pstmt.executeUpdate();
			if (recordEffected > 0) {
				isUpdated = true;
				return isUpdated;
			} else {

				return isUpdated;
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
	}

}
