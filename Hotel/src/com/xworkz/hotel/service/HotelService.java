package com.xworkz.hotel.service;

import java.util.HashMap;

import com.xworkz.hotel.dto.HotelDto;

public interface HotelService {

	public boolean save(Integer id, HotelDto dto);

	public HotelDto findByKey(Integer key);

	public boolean update(Integer key, String name);

	public boolean delete(Integer key);
	
	public HashMap<Integer,HotelDto> read();

}
