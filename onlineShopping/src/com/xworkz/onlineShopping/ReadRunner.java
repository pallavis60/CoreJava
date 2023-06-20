package com.xworkz.onlineShopping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadRunner {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/online_shopping", "root", "Xworkzodc@123");
			System.out.println(con);
			
			
			String quary = "Select * from shopping_info";
			
			 Statement statment =con.createStatement();
			 
			ResultSet result = statment.executeQuery(quary);
			if(result!=null) {
				while(result.next()) {
					System.out.println(result.getInt(1)+"  "+result.getString(2)+"  "+result.getString(3)+"  "+result.getString(4)+"  "+result.getString(5)+"  "+result.getInt(6)+"  "+result.getString(7)+"  "+result.getString(8)+"  "+result.getInt(9)+"  "+result.getString(10));
				
				
				}
				
			}
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
