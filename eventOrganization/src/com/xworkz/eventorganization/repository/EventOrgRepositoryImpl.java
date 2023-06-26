package com.xworkz.eventorganization.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.eventorganization.dto.EventOrg;

public class EventOrgRepositoryImpl implements EventOrgRepository {

	@Override
	public boolean save(EventOrg dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventorganization", "root",
					"Xworkzodc@123");
			System.out.println(conn);
			System.out.println("Database is Connected");

			String quary = "insert into event_info values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement statment = conn.prepareStatement(quary);

			statment.setInt(1, dto.getId());
			statment.setString(2, dto.getEvent_name());
			statment.setString(3, dto.getOrganizedBy());
			statment.setString(4, dto.getConductedBy());
			statment.setString(5, dto.getLocation());
			statment.setString(6, dto.getDate());
			statment.setString(7, dto.getTime());
			statment.setString(8, dto.getSpl_guest());
			statment.setInt(9, dto.getExpectedPeople());
			statment.setInt(10, dto.getTotal_people());
			statment.setInt(11, dto.getEvent_price());
			statment.setString(12, dto.getEmailId());
			statment.setLong(13, dto.getPhoneNo());
			statment.setInt(14, dto.getTotal_event());
			statment.setString(15, dto.getDuration());

			int value = statment.executeUpdate();
			System.out.println(statment);
			if (value > 0) {
				System.out.println("Value is inserted :" + value);
			} else {
				System.out.println("Value is not inserted :" + value);
			}

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean update(String time, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventorganization", "root",
					"Xworkzodc@123");
			System.out.println(conn);
			System.out.println("Database is Connected");

			String quary = "update event_info set time=? where id=?";

			PreparedStatement statment = conn.prepareStatement(quary);

			statment.setString(1, time);
			statment.setInt(2, id);

			int value = statment.executeUpdate();
			System.out.println(statment);
			System.out.println(value);
			if (value > 0) {
				System.out.println("Value is updated :" + value);
			} else {
				System.out.println("Value is not updated :" + value);
			}

			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return true;

	}

	@Override
	public boolean updatingName(String name) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventorganization", "root",
					"Xworkzodc@123");
			System.out.println(conn);
			System.out.println("Database is Connected");

			String quary = "update event_info set event_name=? where id=2";

			PreparedStatement statment = conn.prepareStatement(quary);

			statment.setString(1, name);
			

			int value = statment.executeUpdate();
			System.out.println(statment);
			System.out.println(value);
			if (value > 0) {
				System.out.println("Value is updated :" + value);
			} else {
				System.out.println("Value is not updated :" + value);
			}

			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean updatingDto(EventOrg dto, int id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventorganization", "root",
					"Xworkzodc@123");
			System.out.println(conn);
			System.out.println("Database is Connected");

			String quary = "update event_info set event_name=?,organizedBy=?,ConductedBy=?,location=?,date=?,time=?,spl_guest=?,expectedPeople=?,total_people=?,event_price=?,emaiId=?,phoneNo=?,total_event=?,duration=? where id=?";

			PreparedStatement statment = conn.prepareStatement(quary);
			
			
			statment.setString(1, dto.getEvent_name());
			statment.setString(2, dto.getOrganizedBy());
			statment.setString(3, dto.getConductedBy());
			statment.setString(4, dto.getLocation());
			statment.setString(5, dto.getDate());
			statment.setString(6, dto.getTime());
			statment.setString(7, dto.getSpl_guest());
			statment.setInt(8, dto.getExpectedPeople());
			statment.setInt(9, dto.getTotal_people());
			statment.setInt(10, dto.getEvent_price());
			statment.setString(11, dto.getEmailId());
			statment.setLong(12, dto.getPhoneNo());
			statment.setInt(13, dto.getTotal_event());
			statment.setString(14, dto.getDuration());
			statment.setInt(15, id);
			
			

			int value = statment.executeUpdate();
			System.out.println(statment);
			System.out.println(value);
			if (value > 0) {
				System.out.println("Value is updated :" + value);
			} else {
				System.out.println("Value is not updated :" + value);
			}
			//conn.commit();
			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
		
		return false;
	}

	@Override
	public boolean updatingEmailId(String emailId) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventorganization", "root",
					"Xworkzodc@123");
			System.out.println(conn);
			System.out.println("Database is Connected");

			String quary = "update event_info set emaiId=? where id=2";

			PreparedStatement statment = conn.prepareStatement(quary);

			statment.setString(1, emailId);
			
			int value = statment.executeUpdate();
			System.out.println(statment);
			System.out.println(value);
			if (value > 0) {
				System.out.println("Value is updated :" + value);
			} else {
				System.out.println("Value is not updated :" + value);
			}

			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}	
		
		return false;
	}

	@Override
	public boolean updateByName(String location, String date, String time, long phoneNo, String duration) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventorganization", "root",
					"Xworkzodc@123");
			System.out.println(conn);
			System.out.println("Database is Connected");

			String quary = "update event_info set location=?,date=?,time=?,phoneNo=?,duration=? where event_name='NamingCeremony' ";

			PreparedStatement statment = conn.prepareStatement(quary);

			statment.setString(1, location);
			statment.setString(2, date);
			statment.setString(3, time);
			statment.setLong(4, phoneNo);
			statment.setString(5,duration);
			
			
			int value = statment.executeUpdate();
			System.out.println(statment);
			System.out.println(value);
			if (value > 0) {
				System.out.println("Value is updated :" + value);
			} else {
				System.out.println("Value is not updated :" + value);
			}

			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}
}
