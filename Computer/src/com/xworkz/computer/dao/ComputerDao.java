package com.xworkz.computer.dao;

import com.xworkz.computer.dto.ComputerDto;
import com.xworkz.computer.dto.ProcessorDto;

public class ComputerDao {

	ComputerDto[] details = new ComputerDto[21];

	public boolean save(ComputerDto dto) {
		if (dto != null) {
			System.out.println("The dto is not null");
			if (dto.getBrand() != null && dto.getColour() != null) {
				if (dto.getBrand().length() > 1 && dto.getColour().length() > 2) {
					System.out.println("The Given brand and colour is valid");

					for (int i = 0; i < details.length; i++) {
						if (details[i] == null) {
							details[i] = dto;
							System.out.println("The name is saved");
							return true;
						}
					}
					System.out.println("The name is not saved");
					return false;
				}
				System.out.println("The brand or colour is not valid in length ");
				return false;
			}
			System.out.println("The brand  or colour is null");
			return false;
		}
		System.out.println("The dto is null");
		return false;
	}

	public ComputerDto[] readAll() {
		return details;
	}

	public ComputerDto findByBrand(String brand) {
		if (brand != null) {
			System.out.println("The brand is not null");
			if (brand.length() > 1) {
				System.out.println("The brand is valid in length");

				for (int i = 0; i < details.length; i++) {
					if (details[i] != null) {
						if (details[i].getBrand().equals(brand)) {
							System.out.println("The brand is found");
							return details[i];
						}
					}
				}
				System.out.println("The brand is not found");
				return null;
			}
			System.out.println("The brand length is not valid ");
			return null;
		}
		System.out.println("The brand is null");
		return null;
	}

	public ComputerDto findByModel(String mod) {
		if (mod != null) {
			System.out.println("The mod is not null");
			if (mod.length() >= 2) {
				System.out.println("The mod length is valid");
				for (int i = 0; i < details.length; i++) {
					if (details[i] != null) {
						if (details[i].getModel().equals(mod)) {
							System.out.println("The mod is found");
							return details[i];
						}
					}
				}
				System.out.println("The mod is not found");
				return null;
			}
			System.out.println("The mod length is not valid");
			return null;

		}
		System.out.println("The mod is null");
		return null;
	}

	public boolean updateModelByBrand(String brandName, String modelName) {
		if (brandName != null) {
			if (modelName != null) {

				for (int i = 0; i < details.length; i++) {
					if (details[i] != null) {
						if (details[i].getBrand().equals(brandName)) {
							details[i].setModel(modelName);
							System.out.println("The model is updated");
							return true;
						}
					}
				}
				System.out.println("The model is not updated");
			}
			System.out.println("The modelName Is null");
			return false;
		}
		System.out.println("The brandName is null");
		return false;
	}

	public boolean deleteByColour(String colour) {
		if (colour != null) {

			for (int i = 0; i < details.length; i++) {
				if (details[i] != null) {
					if (details[i].getColour().equals(colour)) {
						details[i] = null;
						System.out.println("The Colour is deleted");
						return true;
					}
				}
			}
			System.out.println("The colour is not deleted");
			return false;
		}
		System.out.println("The given colour is null");
		return false;

	}

	public boolean updateProcessorByBrand(String brand, ProcessorDto obj5) {
		if (brand != null) {
			if (obj5 != null) {

				for (int i = 0; i < details.length; i++) {
					if (details[i] != null) {
						if (details[i].getBrand().equals(brand)) {
							details[i].setProcessor(obj5);
							System.out.println("The processor is updated");
							return true;

						}
					}
				}
				System.out.println("The processor is not updated");
				return false;

			}
			System.out.println("The obj5 is null");
			return false;
		}
		System.out.println("The brand is null");
		return false;

	}

	public boolean deleteByBrand(String dltBrand) {
		if (dltBrand != null) {
			for (int i = 0; i < details.length; i++) {
				if (details[i] != null) {
					if (details[i].getBrand().equals(dltBrand)) {
						details[i] = null;
						System.out.println("The brand is deleted");
						return true;
					}
				}
			}
			System.out.println("The Brand is not deleted");
			return false;
		}
		System.out.println("The dltBrand is null");
		return false;
	}

}
