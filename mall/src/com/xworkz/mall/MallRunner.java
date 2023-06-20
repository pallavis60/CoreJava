package com.xworkz.mall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MallRunner {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Mall Project");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		try {
			Connection	connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mall_info", "root","Xworkzodc@123");
			System.out.println(connect);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
