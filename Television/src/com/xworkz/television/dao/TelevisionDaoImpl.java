package com.xworkz.television.dao;

import java.util.HashMap;
import java.util.Set;


import com.xworkz.television.dto.TelevisionDto;

public class TelevisionDaoImpl implements TelevisionDao {
	
	HashMap<Integer, TelevisionDto> map = new HashMap<Integer, TelevisionDto>();

	@Override
	public boolean save(Integer key, TelevisionDto dto) {
		
		map.put(key, dto);
		System.out.println(" Data is Saved");
		
		return true;
	}

	@Override
	public HashMap<Integer, TelevisionDto> read() {
		
		return map;
	}

	@Override
	public TelevisionDto findByBrand(String brand) {
		 Set<Integer> key =map.keySet();
		 
		 for(Integer keys:key) {
			 TelevisionDto dto = map.get(keys);
			 if(dto.getBrand().equals(brand)) {
				 return dto;
			 }
			
		 }
		return null;
	
	}

	@Override
	public boolean updateByPrice(int price, int newPrice) {
	
		Set<Integer> key = map.keySet();
		for(Integer keys : key ) {
			TelevisionDto dto = map.get(keys);
			if(dto.getPrice()==price) {
				dto.setPrice(newPrice);
				System.out.println("Price is updated");
				return true;
			}
			
		}
		System.out.println("Price is not updated");
		return false;
		
		
	}

	@Override
	public boolean deleteByBrand(String brand) {
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			TelevisionDto dto = map.get(key);
			if(dto.getBrand().equals(brand)) {
				keys.remove(key);
				System.out.println("Brand dto is deleted");
				return true;
				
			}
			
		}
		System.out.println("Dto is not deleted");
		return false;
	}
	
	

}
