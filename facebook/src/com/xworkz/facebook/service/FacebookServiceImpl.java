package com.xworkz.facebook.service;

import java.sql.SQLException;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import com.xworkz.facebook.dto.FacebookDto;

import com.xworkz.facebook.repository.FacebookRepositoryImpl;

public class FacebookServiceImpl implements FacebookService {

	FacebookRepositoryImpl repo = new FacebookRepositoryImpl();

	@Override
	public boolean save(FacebookDto dto) throws ClassNotFoundException, SQLException {

		if (dto.getPhoneNo() > 0 && dto.getPhoneNo() <= 10) {

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			javax.validation.Validator validate = factory.getValidator();
			Set<ConstraintViolation<FacebookDto>> violation = validate.validate(dto);

			if (violation.isEmpty()) {

				boolean save = repo.save(dto);
				System.out.println(save);
				return true;

			}

			else {
				System.out.println(violation);
			}
		} else {
			System.out.println("phoneNo is not valid");
		}

		return false;
	}

	@Override
	public boolean update(FacebookDto dto) throws ClassNotFoundException, SQLException {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validate = factory.getValidator();
		Set<ConstraintViolation<FacebookDto>> violation = validate.validate(dto);

		if (violation.isEmpty()) {

			boolean update = repo.update(dto);
			System.out.println(update);

			return true;
		} else {
			System.out.println(violation);
		}
		return false;

	}

	@Override
	public void read() throws ClassNotFoundException, SQLException {
		repo.read();

	}

	@Override
	public boolean delete(int id) throws ClassNotFoundException, SQLException {

		if (id > 0) {
			repo.delete(id);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateByEmail(String name, String email) throws ClassNotFoundException, SQLException {
		repo.updateByEmail(name, email);
		return false;
	}

	@Override
	public boolean deleteByEmail(String email) throws ClassNotFoundException, SQLException {
		if (email != null) {
			repo.deleteByEmail(email);

		}
		return false;
	}

	}
