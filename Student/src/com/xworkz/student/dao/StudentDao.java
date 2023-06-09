package com.xworkz.student.dao;

import java.util.HashMap;

import com.xworkz.student.dto.StudentDto;

public interface StudentDao {
	
	public boolean save(Integer key , StudentDto dto);
	
	public StudentDto fine(Integer key);
	
	public HashMap<Integer, StudentDto> read();
	
	public boolean remove(Integer key);

}
