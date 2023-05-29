package com.xworkz.car.dao;

import com.xworkz.car.custom.ArrayOutOfBoundException;
import com.xworkz.car.custom.DtoIsNullException;
import com.xworkz.car.custom.ModelIsNullException;
import com.xworkz.car.custom.NameIsNullException;
import com.xworkz.car.custom.PriceIsNotValidException;
import com.xworkz.car.dto.CarDto;

public class CarImpl implements CarDao {

	CarDto[] info = new CarDto[10];

	public boolean save(CarDto dto) throws DtoIsNullException, ArrayOutOfBoundException {

		if (dto != null) {
			if (dto.getName() != null & dto.getModel() != null) {
				if (dto.getName().length() > 3 & dto.getPrice() > 50000) {
					for (int i = 0; i < info.length; i++) {
						if (info[i] == null) {
							info[i] = dto;
							System.out.println("The dto is save");
							return true;
						}

					}
					throw new ArrayOutOfBoundException("Array Is Dont Have Enough Sapce");

				}
				System.out.println("The name or price is not valid");
				return false;
			}
			System.out.println("Given Name or model is null");
			return false;
		}
		throw new DtoIsNullException("Dto Is Null");

	}

	public CarDto[] read() {
		return info;
	}

	public CarDto find(String name) throws NameIsNullException, NullPointerException {
		if (name != null) {
			if (name.length() > 3) {
				for (int i = 0; i < info.length; i++) {
					if (info[i] != null) {
						if (info[i].getName().equals(name)) {
							System.out.println("Name is Found");
							return info[i];
						}
						System.out.println("Name is not found In " + i + " th index ");
					}

				}
				throw new NullPointerException("Array Is Null");

			}
			System.out.println("Name length is not valid");
			return null;

		}
		throw new NameIsNullException("Name Is Null");
	}

	public boolean update(String name, Integer price)
			throws NameIsNullException, NullPointerException, PriceIsNotValidException {
		if (name != null) {
			if (name.length() >= 3) {
				if (price.intValue() < 1000000) {
					for (int i = 0; i < info.length; i++) {
						if (info[i] != null) {
							if (info[i].getName().equals(name)) {
								info[i].setPrice(price);
								System.out.println("Price Is Updated");
								return true;
							}
						}

					}
					throw new NullPointerException("Array index is null");
				}

				throw new PriceIsNotValidException("Price Is Not Valid");
			}
			System.out.println("The Given Name Length is not vlaid");
			return false;
		}
		throw new NameIsNullException("Name is Null");

	}

	public boolean delete(String name) throws NameIsNullException, NullPointerException {
		if (name != null) {
			if (name.length() > 3) {
				for (int i = 0; i < info.length; i++) {
					if (info[i] != null) {
						if (info[i].getName().equals(name)) {
							info[i] = null;
							System.out.println("The name is deleted");
							return true;
						}
					}
				}
				throw new NullPointerException();

			}
			System.out.println("The name length is not valid");
			return false;

		}
		throw new NameIsNullException("The Name is Null");

	}

	public boolean updateByTwoFields(String name, String model, String colour)
			throws NameIsNullException, ModelIsNullException {
		if (name != null) {
			if (model != null) {
				for (int i = 0; i < info.length; i++) {
					if (info[i] != null) {
						if (info[i].getName().equals(name)) {
							if (info[i].getModel().equals(model)) {
								info[i].setColour(colour);
								System.out.println("Colour is updated");
								return true;

							}
						}
					}
				}
				throw new NullPointerException("Array Index Is null");
			}
			throw new ModelIsNullException("Model Is Null");
		}
		throw new NameIsNullException("Name Is Null");
	}

	public CarDto findByTwoFields(String name1, String model1)
			throws NameIsNullException, ModelIsNullException, NullPointerException {
		if (name1 != null) {
			if (model1 != null) {
				for (int i = 0; i < info.length; i++) {
					if (info[i] != null) {
						if (info[i].getName().equals(name1)) {
							if (info[i].getModel().equals(model1)) {
								System.out.println("Name is Found");
								return info[i];
							}
						}
					}
				}
				throw new NullPointerException("Array Is Null");
			}
			throw new ModelIsNullException("Model Is Null");
		}
		throw new NameIsNullException("Name Is Null");

	}

}
