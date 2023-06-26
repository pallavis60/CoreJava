package com.xworkz.hotel.service;

import com.xworkz.hotel.dto.HotelDto;

public interface HotelService {
	
	public boolean save(Integer id , HotelDto dto);
	
	public HotelDto findByKey(Integer key);

}
