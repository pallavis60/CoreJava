package com.xworkz.linkedIn.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.linkedIn.dto.LinkedInDto;
import com.xworkz.linkedIn.repository.LinkedInRepository;
import com.xworkz.linkedIn.repository.LinkedInRepositoryImpl;

public class LinkedInServiceImpl implements LinkedInService {
	
	LinkedInRepository repo = new LinkedInRepositoryImpl();

	@Override
	public boolean save(LinkedInDto dto) {
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
	 Validator validator=	factory.getValidator();
	     Set<ConstraintViolation<LinkedInDto>> validation = validator.validate(dto);
	     if(validation.isEmpty()) {
	    	 boolean save =repo.save(dto);
				System.out.println(save);
				return true;
	    	
	     }else {
	    	 System.out.println(validation);
	     }
		return false;
		
		
	}

	@Override
	public boolean updateByEmail(String name,String email) {
		if(email!=null) {
		boolean update =repo.updateByEmail(name,email);
		System.out.println(update);
			return true;
		}
		System.out.println("email is null");
		return false;
	}

	@Override
	public boolean readByEmail(String email) {
		if(email!=null) {
			repo.read(email);
			return true;
		}
		System.out.println("email is not valid");
		return false;
	}

	@Override
	public boolean readAll() {
		repo.readAll();
		return false;
	}

	@Override
	public boolean deletedByIdAndEmail(int id, String email) {
		if(id>0) {
			if(email!=null) {
				boolean dlt =repo.deletedByIdAndEmail(id,email);
				System.out.println(dlt);
				return true;
			}
		}
		return false;
	}

	@Override
	public void readByIdAndEmail(int id, String email) {
		if(id>0) {
			if(email!=null) {
				System.out.println("Data is validated");
				repo.readByIdAndEmail(id, email);
				
			}
		}
		
	}

}
