package com.xworkz.onlineShopping;

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
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_shopping", "root","Xworkzodc@123");
			System.out.println(connect);
			
			String quary = "insert into shopping_info values(20,'Bhavya','8134567388','bhavya@gmail.com','Shivamogga',783546,'15-8-23','WaterBottel',75,'30%')";
			
			Statement statment = connect.createStatement();
			
			int value = statment.executeUpdate(quary);
			System.out.println("Effected row:" + value);
			
			connect.close();
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
