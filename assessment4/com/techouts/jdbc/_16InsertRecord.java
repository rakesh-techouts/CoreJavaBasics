package com.techouts.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class _16InsertRecord {
	public static void insertRecord() {
		String str= "INSERT INTO employee(id,name,salary) VALUES(?,?,?)";
		try(Connection con = _15Connect.getConnection();
				PreparedStatement pst = con.prepareStatement(str);
				Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter Id: ");
			int id= sc.nextInt();
			System.out.println("Enter Salary: ");
			double salary= sc.nextDouble();
			System.out.println("Enter Name: ");
			String name = sc.next();
			System.out.println();
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setDouble(3, salary);
			int r = pst.executeUpdate();
			if(r>0) {
				System.out.println(r+" Recored(S) Inserted");
			}else {
				System.err.println("Failed to insert the Records");
			}
		} catch (Exception e) {
			System.err.println("Something went worng: "+e);
		}
	}
	public static void main(String[] args) {
		insertRecord();
	}
}
