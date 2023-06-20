package com.xworkz.television.service;

import java.util.HashMap;

import com.xworkz.television.dto.TelevisionDto;

public interface TelevisionService {
	
	public boolean save(Integer key,TelevisionDto dto);
	
	public HashMap<Integer, TelevisionDto> read();
	
	
	public TelevisionDto findByBrand(String brand);
	
	public boolean updateByPrice(int price,int newPrice);
	
	public boolean deleteByBrand(String brand);
	
	

}
