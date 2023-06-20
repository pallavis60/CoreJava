package com.xworkz.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			// connection
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root",
					"Xworkzodc@123");
			System.out.println(connect.getSchema());

			// Writing query
			String quary = "insert into hospital_info values(20,'GreenCityHospital','Banglore',656676,'Akash',2021,18,16,19,12)";

			// create statment object
			Statement statment = connect.createStatement();

			int exec = statment.executeUpdate(quary);

			System.out.println("effected rows :" + exec);

			// close the connection
			connect.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
