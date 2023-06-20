package com.xworkz.television.service;

import java.util.HashMap;

import com.xworkz.television.dao.TelevisionDao;
import com.xworkz.television.dao.TelevisionDaoImpl;
import com.xworkz.television.dto.TelevisionDto;

public class TelevisionServiceImpl implements TelevisionService {

	
	TelevisionDao dao = new TelevisionDaoImpl();

	@Override
	public boolean save(Integer key, TelevisionDto dto) {
		if(key!=null) {
			if(dto!=null) {
				if(dto.getBrand()!=null && dto.getBrand().length()>3) {
					if(dto.getPrice()>5000) {
						System.out.println("Data is validated");
						return dao.save(key,dto);
					}
					System.out.println("Price is not valid");
					return false;
				}
				System.out.println("brand is not valid");
				return false;
			}
			System.out.println("dto is null");
			return false;
		}
		System.out.println("Given Key is null" );
		return false;
	}

	@Override
	public HashMap<Integer, TelevisionDto> read() {
			return dao.read();
	}

	@Override
	public TelevisionDto findByBrand(String brand) {
		if(brand!=null) {
			if(brand.length()>3) {
				return dao.findByBrand(brand);
			}
			System.out.println("Name Length Is not valid");
			return null;
		}
		System.out.println("Name is null");
		return null;
	}

	
	@Override
	public boolean updateByPrice(int price, int newPrice) {
		if(price>5000 && price<1000000) {
			if(newPrice>5000 && newPrice<1000000) {
				System.out.println("price is validate");
				dao.updateByPrice(price, newPrice);
				return true;
			}
			System.out.println("Given New Price is not valid");
			return false;
			
		}
		System.out.println("Given price is not valid");
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		if(brand!=null && brand.length()>3) {
			System.out.println("brand is validated");
			dao.deleteByBrand(brand);
			return true;
			
		}
		System.out.println("Brand is not valid");
		return false;
	}

	
}
