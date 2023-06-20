package com.xworkz.indeed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/indeed", "root",
					"Xworkzodc@123");
			System.out.println(connect);
			System.out.println("Driver is Connected");

			String quary = "Select * from indeed_info";

			Statement statment = connect.createStatement();
			ResultSet set = statment.executeQuery(quary);

			if (set != null) {
				while (set.next()) {
					System.out.println(
							set.getInt(1) + "  " + set.getString(2) + "   " + set.getString(3) + "  " + set.getLong(4)
									+ "  " + set.getString(5) + "  " + set.getString(6) + "  " + set.getString(7) + "  "
									+ set.getInt(8) + "  " + set.getString(9) + "  " + set.getString(10));

				}
			}
			connect.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
