package com.xworkz.vegetables.dao;

import com.xworkz.vegetables.dto.VegetablesDto;

public class VegetablesDao {

	VegetablesDto[] vegetable = new VegetablesDto[21];

	public boolean save(VegetablesDto dto) {

		for (int i = 0; i < vegetable.length; i++) {
			if (vegetable[i] == null) {
				vegetable[i] = dto;
				return true;
			}

		}
		return false;

	}

	public VegetablesDto[] readAll() {
		return vegetable;
	}

	public VegetablesDto findByName(String name) {
		for (int i = 0; i < vegetable.length; i++) {
			if (vegetable[i] != null) {
				vegetable[i].getName().equals(name);
				return vegetable[i];
			}
		}

		return null;
	}

	public boolean deleteByName(String name) {
		for (int i = 0; i < vegetable.length; i++) {
			if (vegetable[i].getName().equals(name)) {
				vegetable[i] = null;
				return true;
			}
		}
		return false;
	}
}
