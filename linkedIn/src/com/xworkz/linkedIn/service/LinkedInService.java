package com.xworkz.linkedIn.service;

import com.xworkz.linkedIn.dto.LinkedInDto;

public interface LinkedInService {
	
	boolean save(LinkedInDto dto);
	boolean updateByEmail(String name,String email);
	boolean readByEmail(String email);
	boolean readAll();
	boolean deletedByIdAndEmail(int id, String email);
	void readByIdAndEmail(int id, String email);

}
