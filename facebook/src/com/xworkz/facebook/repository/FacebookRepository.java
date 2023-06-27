package com.xworkz.facebook.repository;

import java.sql.SQLException;

import com.xworkz.facebook.dto.FacebookDto;

public interface FacebookRepository {
	
	public boolean save(FacebookDto dto) throws ClassNotFoundException, SQLException;
	
	
	public boolean update(FacebookDto dto) throws ClassNotFoundException, SQLException;
	
	boolean delete( int id) throws ClassNotFoundException, SQLException;
	
	boolean updateByEmail(String name, String email) throws ClassNotFoundException, SQLException;
	
	public boolean deleteByEmail(String email) throws SQLException, ClassNotFoundException;
	
	
	
	

}
