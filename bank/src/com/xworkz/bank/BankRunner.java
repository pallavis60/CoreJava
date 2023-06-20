package com.xworkz.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class BankRunner {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection connector = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","Xworkzodc@123");
		    System.out.println(connector);	
		    
		    String quary = "insert into bank_info values(20,'CSBBank' ,' Darvada','Darvada', '11.30Am' , '6.30PM', '31',  31000,'9867564534' , 'dcs7867')";
		    
		    Statement statment = connector.createStatement();
		    
		    int value = statment.executeUpdate(quary);
		    
		    System.out.println("Effected row:"+ value);
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
