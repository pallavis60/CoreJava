package com.xworkz.student.service;

import java.util.HashMap;

import com.xworkz.student.dto.StudentDto;

public interface StudentService {
	
	public boolean save(Integer key , StudentDto dto);
	
	public StudentDto find(Integer key);
	
	public HashMap<Integer, StudentDto> read();
	
	public boolean read(Integer key);
	
	public boolean remove(Integer key);

}
