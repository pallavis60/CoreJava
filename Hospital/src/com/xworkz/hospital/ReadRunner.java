package com.xworkz.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			// connection
			
		//	String quary = "select * from  hospital_info where name='manipal' ";
			String quary = "select * from hospital_info ";
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root",
					"Xworkzodc@123");
			
			Statement statment =connect.createStatement();
			
			ResultSet result =statment.executeQuery(quary);
			System.out.println(result);
			if(result!=null) {
				while(result.next()) {
					//System.out.println("Selected");
					System.out.println(result.getInt(1) +" "+ result.getString(2)+ " "+result.getString(3)+" "+result.getInt(4) + " "+result.getString(5)+ " "+result.getInt(6)+ " "+result.getInt(7)+ " "+result.getInt(8)+" "+result.getInt(9)+ " "+ result.getInt(10));
				
					
				}
			}
			connect.close();
				

	}catch(Exception e) {
		
		e.printStackTrace();
	}
		
	}

}

//Read operation for all the yesterday's project

//create new project called Indeed
//create 10 columns
//