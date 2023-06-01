package com.xworkz.institute.dao;

import java.util.LinkedList;

import com.xworkz.institute.dto.InstituteDto;

public interface InstituteDao {

	public boolean save(InstituteDto dto);

	public LinkedList<InstituteDto> read();

	public InstituteDto find(String name);

	public boolean update(int fees, String location);

	public boolean delete(String name);

}
