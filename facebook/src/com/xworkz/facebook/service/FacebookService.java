package com.xworkz.facebook.service;

import java.sql.SQLException;

import com.xworkz.facebook.dto.FacebookDto;

public interface FacebookService {
	
	boolean save(FacebookDto dto) throws ClassNotFoundException, SQLException;
	
	boolean update(FacebookDto dto) throws ClassNotFoundException, SQLException;
	
	void read() throws ClassNotFoundException, SQLException;
	
	boolean delete(int id) throws ClassNotFoundException, SQLException; 
	
	boolean updateByEmail(String name, String email) throws ClassNotFoundException, SQLException;
	
	boolean deleteByEmail(String email) throws ClassNotFoundException, SQLException;
	

}
