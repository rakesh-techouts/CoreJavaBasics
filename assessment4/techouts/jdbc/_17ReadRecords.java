package com.techouts.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class _17ReadRecords {
	public static void main(String[] args) {
		try (Connection con = _15Connect.getConnection(); Statement smt = con.createStatement()) {
			String str = "SELECT *FROM employee ORDER BY id";
			ResultSet rst = smt.executeQuery(str);
			while (rst.next()) {
				System.out.print("ID: " + rst.getInt(1));
				System.out.print("---> Name: " + rst.getString(2));
				System.out.print("---> Salary: " + rst.getFloat(3));
				System.out.println();
			}
		} catch (Exception e) {
			System.err.println("Something went wrong: " + e);
		}
	}
}
