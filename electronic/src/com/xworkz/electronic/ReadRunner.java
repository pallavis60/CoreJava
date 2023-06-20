package com.xworkz.electronic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			// connection

			String quary = "Select * from electronics_items ";
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic", "root",
					"Xworkzodc@123");
			System.out.println(connect);

			Statement statment = connect.createStatement();

			ResultSet result = statment.executeQuery(quary);

			if (result != null) {
				while (result.next()) {
					System.out.println(result.getInt(1) + "   " + result.getString(2) + "   " + result.getInt(3) + "    "
							+ result.getString(4) + "   " + result.getString(5) + "   " + result.getString(6) + "   "
							+ result.getString(7) + "   " + result.getInt(8) + "   " + result.getInt(9) + "    "
							+ result.getString(10));
				}
			}
			
			connect.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
