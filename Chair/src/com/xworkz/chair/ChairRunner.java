package com.xworkz.chair;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ChairRunner {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			//connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chair", "root","Xworkzodc@123");  
			System.out.println(con.getSchema());
			
			String query ="insert into chair_info values(4,'plastic',1000)";
			Statement  statment = con.createStatement();
			
//			boolean insert =statment.execute(query);
//			System.out.println(insert);
			
			int i =statment.executeUpdate(query);
			System.out.println(i);
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Create 5 diffrent project of your choice
	
	//write runner class for each and in table it should have 10 cols
	//insert 20 record each

}
