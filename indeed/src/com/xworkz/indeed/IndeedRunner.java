package com.xworkz.indeed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class IndeedRunner {

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
			System.out.println("Database is connected");

			String quary = "insert into indeed_info values(10,'Ashwini','ashu@gmail.com',9856748989,'Hosanagara','Msc','Ruby',23,'26-12-2001',2022)";

			Statement statment = connect.createStatement();

			int value = statment.executeUpdate(quary);
			System.out.println("effected row: " + value);

			connect.close();

			System.out.println("Connection closed");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
