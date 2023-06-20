package com.xworkz.maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Runner {

	public static void main(String[] args) {
		System.out.println("New Project");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("New project");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	try {
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/inst_info","root","Xworkzodc@123");
		System.out.println(con);
	} catch (SQLException e) {
		
		e.printStackTrace();
	}  
		
		
	}

}
