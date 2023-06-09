package com.xworkz.student.dao;

import java.util.HashMap;

import com.xworkz.student.dto.StudentDto;

public class StudentDaoImpl implements StudentDao  {
	
	HashMap<Integer, StudentDto> map = new HashMap<Integer, StudentDto>();

	@Override
	public boolean save(Integer key , StudentDto dto) {
		
		map.put(key, dto);
		System.out.println("Data is Save");
		
		return true;
	}

	@Override
	public StudentDto fine(Integer key) {
	System.out.println("key is found");
		return map.get(key);
	}

	@Override
	public HashMap<Integer, StudentDto> read() {
		
		return map;
	}

	@Override
	public boolean remove(Integer key) {
		map.remove(key);
		System.out.println("Data is deleted");
		return true;
	}
	
}
