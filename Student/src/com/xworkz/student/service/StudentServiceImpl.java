package com.xworkz.student.service;

import java.util.HashMap;

import com.xworkz.student.dao.StudentDao;
import com.xworkz.student.dao.StudentDaoImpl;
import com.xworkz.student.dto.StudentDto;

public class StudentServiceImpl implements StudentService {

	StudentDao dao = new StudentDaoImpl();

	@Override
	public boolean save(Integer key, StudentDto dto) {
		if (dto != null) {
			if (dto.getName() != null && dto.getQualification() != null) {
				if (dto.getName().length() > 3 && dto.getQualification().length() >= 3) {
					System.out.println("Data is validated");
					dao.save(key, dto);
					return true;
				}
				System.out.println("Name Or qualification length is not valid");
				return false;
			}
			System.out.println("Name or Qualification is null");
			return false;
		}
		System.out.println("Dto is null");

		return false;
	}

	@Override
	public StudentDto find(Integer key) {
		if(key!=0) {
			System.out.println("Key is validated");
			
			return dao.fine(key);
			
		}
		System.out.println("Key is 0");
		return null;
	}

	@Override
	public HashMap<Integer, StudentDto> read() {
		
		return dao.read();
	}

	@Override
	public boolean read(Integer key) {
		if(key!=0) {
			System.out.println("Key is validated");
			dao.remove(key);
			return true;
			
		}
		System.out.println("Key is 0");
		return false;
		
	}

	@Override
	public boolean remove(Integer key) {
		if(key!=0) {
			System.out.println("Key is validated");
			dao.remove(key);
			return true;
		}
		System.out.println("Key is 0");
		return false;

}
}