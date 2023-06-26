package com.xworkz.linkedIn.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.linkedIn.dto.LinkedInDto;

public class LinkedInRepositoryImpl implements LinkedInRepository {

	@Override
	public boolean save(LinkedInDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");
			System.out.println(conn);
			System.out.println("Database is Connected");

			String quary = "insert into  linked_info values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement statment = conn.prepareStatement(quary);

			statment.setInt(1, dto.getId());
			statment.setString(2, dto.getName());
			statment.setString(3, dto.getQualification());
			statment.setInt(4, dto.getAge());
			statment.setString(5, dto.getDateOfBirth());
			statment.setInt(6, dto.getPassOutYear());
			statment.setString(7, dto.getPercent());
			statment.setString(8, dto.getSkills());
			statment.setString(9, dto.getExperiance());
			statment.setString(10, dto.getUnivercity());
			statment.setLong(11, dto.getPhoneNo());
			statment.setString(12, dto.getEmail());
			statment.setString(13, dto.getPassword());
			statment.setString(14, dto.getExtraCourse());
			statment.setDate(15, dto.getDate());

			int value = statment.executeUpdate();
			System.out.println(statment);
			if (value > 0) {
				System.out.println("Value is inserted :" + value);
			} else {
				System.out.println("Value is not inserted :" + value);
			}
			statment.close();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updateByEmail(String name, String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");
			System.out.println(conn);
			System.out.println("Database is Connected");

			String quary = "update linked_info set name=? where email=? ";

			PreparedStatement statment = conn.prepareStatement(quary);

			statment.setString(1, name);
			statment.setString(2, email);

			int value = statment.executeUpdate();
			System.out.println(statment);
			if (value > 0) {
				System.out.println("Value is updated :" + value);
			} else {
				System.out.println("Value is not updated :" + value);
			}

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean read(String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");
			System.out.println(conn);
			System.out.println("Database is Connected");

			String quary = "select*from linked_info where email=? ";

			PreparedStatement statment = conn.prepareStatement(quary);
			statment.setString(1, email);

			ResultSet read = statment.executeQuery();
			if (read != null) {
				while (read.next()) {
					System.out.println(read.getInt(1) + "  " + read.getString(2) + "  " + read.getString(3) + "  "
							+ read.getInt(4) + "  " + read.getString(5) + "  " + read.getInt(6) + "  "
							+ read.getString(7) + " " + read.getString(8) + "  " + read.getString(9) + "  "
							+ read.getString(10) + "  " + read.getLong(11) + " " + read.getString(12) + "  "
							+ read.getString(13) + "  " + read.getString(14) + "  " + read.getDate(15));
				}

			}
			statment.close();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public boolean readAll() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");
			System.out.println(conn);
			System.out.println("Database is Connected");

			String quary = "select*from linked_info ";

			PreparedStatement statment = conn.prepareStatement(quary);
			

			ResultSet read = statment.executeQuery();
			if (read != null) {
				while (read.next()) {
					System.out.println(read.getInt(1) + "  " + read.getString(2) + "  " + read.getString(3) + "  "
							+ read.getInt(4) + "  " + read.getString(5) + "  " + read.getInt(6) + "  "
							+ read.getString(7) + " " + read.getString(8) + "  " + read.getString(9) + "  "
							+ read.getString(10) + "  " + read.getLong(11) + " " + read.getString(12) + "  "
							+ read.getString(13) + "  " + read.getString(14) + "  " + read.getDate(15));
				}

			}
			statment.close();
			conn.close();
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean deletedByIdAndEmail(int id, String email) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");
			System.out.println(conn);
			System.out.println("Database is Connected");

			String quary = "Delete from linked_info where id=? and email=? ";

			PreparedStatement statment = conn.prepareStatement(quary);

			statment.setInt(1, id);
			statment.setString(2, email);

			int value = statment.executeUpdate();
			System.out.println(statment);
			if (value > 0) {
				System.out.println("Value is deleted :" + value);
			} else {
				System.out.println("Value is not deleted :" + value);
			}
			
			statment.close();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return false;
	}

	@Override
	public void readByIdAndEmail(int id, String email) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");
			System.out.println(conn);
			System.out.println("Database is Connected");

			String quary = "select*from linked_info where id=? and email=? ";


			PreparedStatement statment = conn.prepareStatement(quary);
			
			statment.setInt(1, id);
			statment.setString(2, email);

			ResultSet read = statment.executeQuery();
			if (read != null) {
				while (read.next()) {
					System.out.println(read.getInt(1) + "  " + read.getString(2) + "  " + read.getString(3) + "  "
							+ read.getInt(4) + "  " + read.getString(5) + "  " + read.getInt(6) + "  "
							+ read.getString(7) + " " + read.getString(8) + "  " + read.getString(9) + "  "
							+ read.getString(10) + "  " + read.getLong(11) + " " + read.getString(12) + "  "
							+ read.getString(13) + "  " + read.getString(14) + "  " + read.getDate(15));
				}

			}
			
			statment.close();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
	}
}