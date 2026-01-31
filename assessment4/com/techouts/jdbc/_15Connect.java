package com.techouts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _15Connect {
	public static void main(String[] args) throws SQLException {
		Connection con = getConnection();
		if(con!=null) {
			System.out.println("Connected");
		}else {
			System.out.println("Something went Wrong");
		}
	}
	private final static String url="jdbc:postgresql://localhost:5432/techouts";
	private final static String user="postgres";
	private final static String passWord="admin";
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("Error! ClassNotFound "+e);
		}
		return DriverManager.getConnection(url,user,passWord);
	}
}
