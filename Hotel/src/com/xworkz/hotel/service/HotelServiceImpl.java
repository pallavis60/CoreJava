package com.xworkz.hotel.service;

import java.util.HashMap;

import com.xworkz.hotel.dao.HotelDao;
import com.xworkz.hotel.dao.HotelDaoImpl;
import com.xworkz.hotel.dto.HotelDto;

public class HotelServiceImpl implements HotelService {

	HotelDao obj = new HotelDaoImpl();

	@Override
	public boolean save(Integer id, HotelDto dto) {
		if (dto != null) {
			if (id != 0) {
				if (dto.getName() != null && dto.getLocation() != null) {
					if (dto.getName().length() > 3 && dto.getLocation().length() > 3) {
						if (dto.getRate() < 50000) {
							if (dto.getNoOfRooms() != 0) {
								System.out.println("Data is Valid");
								obj.save(id, dto);
								return true;

							}
							System.out.println("Room Number is 0 Not valid");
							return false;
						}
						System.out.println("Rate is not Valid");
						return false;
					}
					System.out.println("Given Name or Location length is not valid");
					return false;
				}
				System.out.println("Given Name or Location is null");
				return false;
			}
			System.out.println("Given id is 0");
			return false;
		}
		System.out.println("Given dto is null");
		return false;
	}

	@Override
	public HotelDto findByKey(Integer key) {
		if (key != 0) {
			System.out.println("Key is valid");
			return obj.findByKey(key);
		}
		System.out.println("Key is 0");
		return null;
	}

	@Override
	public boolean update(Integer key, String name) {
		if (key != 0) {
			if (name != null) {
				System.out.println("Data is valid");
				obj.update(key, name);
				return true;
			}

			System.out.println("Given Name is Null");
			return false;
		}
		System.out.println("Key is 0");
		return false;
	}

	@Override
	public boolean delete(Integer key) {
		if (key != 0) {
			System.out.println("Key is valid");
			obj.delete(key);
			return true;
		}
		System.out.println("Key is 0");
		return false;
	}

	@Override
	public HashMap<Integer, HotelDto> read() {
		
		return obj.read(); 
	}

}
