package com.xworkz.hotel.dao;

import java.util.HashMap;

import com.xworkz.hotel.dto.HotelDto;

public class HotelDaoImpl implements HotelDao {

	HashMap<Integer, HotelDto> map = new HashMap<Integer, HotelDto>();

	@Override
	public boolean save(Integer id, HotelDto dto) {
		map.put(id, dto);
		System.out.println("Data is Saved");
		return true;
	}

	@Override
	public HotelDto findByKey(Integer key) {
		return map.get(key);

	}

	@Override
	public boolean update(Integer key, String name) {
		HotelDto reff = map.get(key);
		reff.setName(name);
		System.out.println(map.get(key));
		return true;
	}

	@Override
	public boolean delete(Integer key) {
		map.remove(key);
		System.out.println("Key is deleted");
		System.out.println(map.get(key));
		return true;
	}

}
