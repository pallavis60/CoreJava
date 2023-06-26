package com.xworkz.electronic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Runner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Connection connector = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic", "root",
					"Xworkzodc@123");
			System.out.println(connector);

			String quary = "insert into electronics_items values(20,'DishWasher',11500,'3years','23 april','silver','6kg',4000,119,'8709878788')";

			Statement statment = connector.createStatement();

			int value = statment.executeUpdate(quary);

			System.out.println("Effected row:" + value);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
