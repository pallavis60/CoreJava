package com.xworkz.linkedIn;

import java.sql.Date;

import com.xworkz.linkedIn.dto.LinkedInDto;
import com.xworkz.linkedIn.service.LinkedInService;
import com.xworkz.linkedIn.service.LinkedInServiceImpl;

public class Runner {

	public static void main(String[] args) {

		LinkedInDto dto = new LinkedInDto();
		String str = "2015-03-31";
		Date date = Date.valueOf(str);
		dto.setId(7);
		dto.setName("Shree");
		dto.setQualification("BE"); 
		dto.setAge(24);
		dto.setDateOfBirth("6-6-1998");
		dto.setPassOutYear(2020);
		dto.setPercent("90%");
		dto.setSkills("R");
		dto.setUnivercity("Kalburgi");
		dto.setPhoneNo(5678987656l);
		dto.setEmail("sheela@gmail.com");
		dto.setPassword("jhhdh877788");
		dto.setExtraCourse("FullStackDevelopment");
		dto.setDate(date);

		LinkedInService service = new LinkedInServiceImpl();
		service.save(dto);

		//service.updateByEmail("Ashwini", "gowri@gmail.com");
		//service.readByEmail("gowri@gmail.com");

		//service.deletedByIdAndEmail(1, "nikki@gmail.com");

		//service.readAll();
	//	service.readByIdAndEmail(3, "sheela@gmail.com");

	}

}
