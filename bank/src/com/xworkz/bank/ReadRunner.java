package com.xworkz.bank;

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
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Xworkzodc@123");
			System.out.println(con);

			String quary = "Select * from bank_info";

			Statement statment = con.createStatement();

			ResultSet set = statment.executeQuery(quary);
			if (set != null) {
				while (set.next()) {
					System.out.println(set.getInt(1) + "  " + set.getString(2) + "  " + set.getString(3) + "    "
							+ set.getString(4) + "   " + set.getString(5) + "   " + set.getString(6) + "   "
							+ set.getInt(7) + "   " + set.getInt(8) + "   " + set.getString(9) + "    "
							+ set.getString(10));
				}
			}

			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
