package com.techouts.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class _20HandlingResourceClosing {
	public static void main(String[] args) {
		String str="SELECT *FROM employee WHERE id=?";
		/*
		 * When we loading the Driver there is chance of ClassNotFoundException(Checked)
		 * must handled but i handled it in _15Connect.getConnection() method so no need to 
		 * handle here and when we execute the query in database
		 * SQLExceptions may Occurs so to handle we write respective catch block for that
		 */
		try(Connection con = _15Connect.getConnection();
				PreparedStatement ps = con.prepareStatement(str);
				Scanner sc = new Scanner(System.in)){
			/*
			 * Here we are dont want to close the ps, con and sc references
			 * of Connection and PreparedStatement Interfaces and Scanner class
			 * This is the advantage of try with resources if we
			 * not use try with resource them we close all connections manually 
			 * in finally block. the connections will close after the complection of try block
			 * or else when occurance of the Exception
			 */
		}catch(SQLException e) {
			System.out.println("Something went Wrong: "+e);
		}
	}
}
