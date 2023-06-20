package com.xworkz.television.dao;

import java.util.HashMap;

import com.xworkz.television.dto.TelevisionDto;

public interface TelevisionDao {

	boolean save(Integer key, TelevisionDto dto);

	HashMap<Integer, TelevisionDto> read();

	TelevisionDto findByBrand(String brand);

	boolean updateByPrice(int price, int newPrice);

	boolean deleteByBrand(String brand);

}
