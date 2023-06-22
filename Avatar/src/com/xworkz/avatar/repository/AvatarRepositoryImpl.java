package com.xworkz.avatar.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.avatar.dto.AvatarDto;

public class AvatarRepositoryImpl implements AvatarRepository {

	@Override
	public boolean save(AvatarDto dto) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
	    Connection connect 	=	DriverManager.getConnection("jdbc:mysql://localhost:3306/avatar", "root", "Xworkzodc@123");
		System.out.println(connect);
		System.out.println("DataBase is connected");
		
		String quary = "insert into  avatar_info values(?,?,?,?,?,?,?,?,?,?)";
		
		   PreparedStatement statment =connect.prepareStatement(quary);
		   System.out.println("inserted into :" +statment);
		
	      statment.setInt(1, dto.getId());
	      statment.setString(2, dto.getAvatar_actors());
	      statment.setInt(3,dto.getAge());
	      statment.setString(4, dto.getDateOfBirth());
	      statment.setString(5,dto.getNationality());
	      statment.setBoolean(6, dto.isMarriageStatus());
	      statment.setInt(7,dto.getTotalMovies());
	      statment.setString(8, dto.getFirstMovie());
	      statment.setString(9, dto.getLastMovie());
	      statment.setString(10, dto.getCharecterName());
	      
	      
	      int i = statment.executeUpdate();
	      System.out.println("insert into :"+ statment);
	      
	      if(i>0) {
	    	  System.out.println("Inserted");
	      }else {
	    	  System.out.println("not inserted");
	      }
	      
	      statment.close();
	      
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	@Override
	public boolean update(AvatarDto dto, int id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
	    Connection connect	=	DriverManager.getConnection("jdbc:mysql://localhost:3306/avatar", "root", "Xworkzodc@123");
		System.out.println(connect);
		System.out.println("DataBase is conne cted");
		
		String quary = "update avatar_info set avatar_actors=?,age=?,dateOfBirth=?,Nationality=?,MarriageStatus=?,TotalMovies=?,firstMovie=?,lastMovie=?,CharecterName=? where id=?";
	PreparedStatement statment= connect.prepareStatement(quary);
	
	
     statment.setString(1, dto.getAvatar_actors());
     statment.setInt(2,dto.getAge());
     statment.setString(3, dto.getDateOfBirth());
     statment.setString(4,dto.getNationality());
     statment.setBoolean(5, dto.isMarriageStatus());
     statment.setInt(6,dto.getTotalMovies());
     statment.setString(7, dto.getFirstMovie());
     statment.setString(8, dto.getLastMovie());
     statment.setString(9, dto.getCharecterName());
     statment.setInt(10, dto.getId());
     
     int i = statment.executeUpdate();
     if(i>0) {
    	 System.out.println("record updated");
     }else {
    	System.out.println("record is not updated");
     }
     
     statment.close();
     
	
   
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return false;
	}

}
