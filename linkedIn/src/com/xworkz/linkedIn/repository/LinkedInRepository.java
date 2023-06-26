package com.xworkz.linkedIn.repository;

import com.xworkz.linkedIn.dto.LinkedInDto;

public interface LinkedInRepository {
	
	boolean save(LinkedInDto dto);

	boolean updateByEmail(String name,String email);

	boolean read(String email);

	boolean readAll();

	boolean deletedByIdAndEmail(int id, String email);

	void readByIdAndEmail(int id, String email);

}
