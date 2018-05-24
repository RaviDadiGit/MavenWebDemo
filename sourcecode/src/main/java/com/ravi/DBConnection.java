package com.ravi;

import java.sql.*;

public class DBConnection {
	public static Connection getDbConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://suryadb.clonjakyct3l.us-east-2.rds.amazonaws.com:3306/SuryaDB", "surya", "L0vely1!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		return con;
	}
}
