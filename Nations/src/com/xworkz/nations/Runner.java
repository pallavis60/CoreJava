package com.xworkz.nations;

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
		Connection connect =	DriverManager.getConnection("jdbc:mysql://localhost:3306/nation", "root","Xworkzodc@123");
		System.out.println(connect);
		
		
		String quary = "insert into nation_info values(10,'Korea','Seoul ','The magpie','tiger','The mugunghwa','Aegukege','The Taegeukgi','5.17 crores','Yoon Suk Yeol')" ;
		
		Statement statment = connect.createStatement();
		
		int value =statment.executeUpdate(quary);
		System.out.println("effected row:"+ value);
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}

}
