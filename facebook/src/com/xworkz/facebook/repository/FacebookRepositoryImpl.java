package com.xworkz.facebook.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.facebook.dto.FacebookDto;

public class FacebookRepositoryImpl implements FacebookRepository {

	public boolean save(FacebookDto dto) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook ", "root",
				"Xworkzodc@123");
		System.out.println(connection);
		System.out.println("database is connected");

		String quary = "insert into facebook_info values(?,?,?,?,?,?,?,?)";

		PreparedStatement statment = connection.prepareStatement(quary);
		statment.setInt(1, dto.getId());
		statment.setString(2, dto.getFirstName());
		statment.setString(3, dto.getLastName());
		statment.setDate(4, dto.getDOB());
		statment.setString(5, dto.getEmail());
		statment.setLong(6, dto.getPhoneNo());
		statment.setString(7, dto.getGender());
		statment.setString(8, dto.getPassword());

		int i = statment.executeUpdate();
		System.out.println(i);

		connection.close();

		return true;
	}

	public boolean update(FacebookDto dto) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook ", "root",
				"Xworkzodc@123");
		System.out.println(connection);
		System.out.println("database is connected");

		String quary = "update facebook_info set firstName=?,lastName=?,DOB=?,email=?,phoneNo=?,gender=?,password=? where id=?";

		PreparedStatement statment = connection.prepareStatement(quary);

		statment.setString(1, dto.getFirstName());
		statment.setString(2, dto.getLastName());
		statment.setDate(3, dto.getDOB());
		statment.setString(4, dto.getEmail());
		statment.setLong(5, dto.getPhoneNo());
		statment.setString(6, dto.getGender());
		statment.setString(7, dto.getPassword());
		statment.setInt(8, dto.getId());

		int i = statment.executeUpdate();
		System.out.println(i);

		connection.close();

		return false;
	}

	public void read() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook ", "root",
				"Xworkzodc@123");
		System.out.println(connection);
		System.out.println("database is connected");

		String quary = "Select* from facebook_info";

		PreparedStatement statment = connection.prepareStatement(quary);

		ResultSet set = statment.executeQuery();

		if (set != null) {
			while (set.next()) {
				System.out.println(set.getInt(1) + "  " + set.getString(2) + "   " + set.getString(3) + "  "
						+ set.getDate(4) + "   " + set.getString(5) + "  " + set.getLong(6) + "  " + set.getString(7)
						+ "  " + set.getString(8));
			}

			connection.close();
		}

	}

	@Override
	public boolean delete(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook ", "root",
				"Xworkzodc@123");
		System.out.println(connection);
		System.out.println("database is connected");

		String quary = "Delete from facebook_info where id=?";

		PreparedStatement statment = connection.prepareStatement(quary);
		statment.setInt(1, id);

		int i = statment.executeUpdate();
		System.out.println(i);
		return false;

	}

	@Override
	public boolean updateByEmail(String name, String email) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook ", "root",
				"Xworkzodc@123");
		System.out.println(connection);
		System.out.println("database is connected");

		String quary = "Update facebook_info set firstName=? where email=?";

		PreparedStatement statment = connection.prepareStatement(quary);
		statment.setString(1, name);
		statment.setString(2, email);

		int i = statment.executeUpdate();
		System.out.println(i);

		return false;
	}

	public boolean deleteByEmail(String email) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook ", "root",
				"Xworkzodc@123");
		System.out.println(connection);
		System.out.println("database is connected");

		String quary = "delete from facebook_info where email=?";

		PreparedStatement statment = connection.prepareStatement(quary);

		statment.setString(1, email);

		int i = statment.executeUpdate();
		System.out.println(i);

		connection.close();

		return false;
		// TODO Auto-generated method stub

	}

}
