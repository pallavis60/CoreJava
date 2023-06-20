package com.xworkz.biscuit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BiscuitRunner {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Biscuit Project");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			Connection connect =DriverManager.getConnection("jdbc:mysql://localhost:3306/accountnumbers", "root","Xworkzodc@123");
			System.out.println(connect);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
