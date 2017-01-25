package com.rkgec.website.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonDAO {
	private CommonDAO() {
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String driverClassName = "com.mysql.jdbc.Driver";
		Class.forName(driverClassName);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp2db", "root", "shivam");
		return con;
	}
}
