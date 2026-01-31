package com.techouts.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class _19DeleteEmployee {
	public static void main(String[] args) throws SQLException {
		String str="DELETE FROM employee WHERE id=?";
		try(Connection con =_15Connect.getConnection();
				PreparedStatement pst = con.prepareStatement(str);
				Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the Employee ID: ");
			int id=sc.nextInt();
			pst.setInt(1,id);
			int r=pst.executeUpdate();
			if(r>0) {
				System.out.println(r+" Record(s) Deleted");
			}else {
				System.out.println("Id Not Found");
			}
		}catch(Exception e) {
			System.out.println("Something went Wrong: "+e);
		}
	}
}
