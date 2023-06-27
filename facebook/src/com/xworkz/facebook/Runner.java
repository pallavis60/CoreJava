package com.xworkz.facebook;

import java.sql.Date;
import java.sql.SQLException;

import com.xworkz.facebook.dto.FacebookDto;
import com.xworkz.facebook.service.FacebookService;
import com.xworkz.facebook.service.FacebookServiceImpl;

public class Runner {
	
	static Date date = new Date(2003,3,5);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		FacebookDto dto = new FacebookDto();
		dto.setId(5);
		dto.setFirstName("Arohi");
		dto.setLastName("AR");
		dto.setDOB(date);
		dto.setEmail("ar@gmail.com");
		dto.setPhoneNo(766L);
		dto.setGender("female");
		dto.setPassword("99977hhhhhhhh");
		
		FacebookService service = new FacebookServiceImpl();
		service.save(dto);
		//service.update(dto);
		//service.delete(2);
		//service.deleteByEmail("ar@gmail.com");
		//service.updateByEmail("Ashwini", "nikki@gmail.com");
		service.read();
		
		
	}

}
