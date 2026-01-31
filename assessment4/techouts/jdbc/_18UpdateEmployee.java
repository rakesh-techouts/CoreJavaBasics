package com.techouts.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class _18UpdateEmployee {
	public static void main(String[] args) throws SQLException {
		String str="UPDATE employee SET salary=? WHERE id=?";
		try(Connection con =_15Connect.getConnection();
				PreparedStatement pst = con.prepareStatement(str);
				Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the Employee ID: ");
			int id=sc.nextInt();
			System.out.println("Enter the Slary: ");
			float salary =sc.nextFloat();
			
			pst.setFloat(1,salary);
			pst.setInt(2,id);
			
			int i=pst.executeUpdate();
			if(i>0) {
				System.out.println(i+ "Record(s) Updated");
			}else {
				System.out.println("Id Not Found");
			}
		}catch(Exception e) {
			System.out.println("Something went Worng: "+e);
		}
	}
}
