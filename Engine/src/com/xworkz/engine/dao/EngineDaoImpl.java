package com.xworkz.engine.dao;

import com.xworkz.engine.custom.ArrayOutOfBoundException;
import com.xworkz.engine.custom.DtoIsNullException;
import com.xworkz.engine.custom.PriceIsNotValidException;
import com.xworkz.engine.custom.NullPointerException;
import com.xworkz.engine.custom.TypeIsNullException;
import com.xworkz.engine.dto.EngineDto;

public class EngineDaoImpl implements EngineDao {

	EngineDto[] info = new EngineDto[11];

	public boolean save(EngineDto dto) throws ArrayOutOfBoundException, DtoIsNullException {
		if (dto != null) {
			if (dto.getType() != null && dto.getCapacity() != null) {
				if (dto.getPrice() > 5000 && dto.getNoOfCylinders() >= 5) {
					for (int i = 0; i < info.length; i++) {
						if (info[i] == null) {
							info[i] = dto;
							System.out.println("The dto Is Saved");
							return true;
						}
						System.out.println("The Index " + i + " Is Not Null Moving To Next Index i++");
					}
					throw new ArrayOutOfBoundException("Array Dont Have Enough Sapce");
				}
				System.out.println("Given price or noOfCylinders is not valid");
				return false;
			}
			System.out.println("Give Type or Capacity Is Null");
			return false;
		}
		throw new DtoIsNullException("Dto Is Null");
	}

	public EngineDto[] read() {
		return info;

	}

	public boolean update(String type, int price)
			throws NullPointerException, PriceIsNotValidException, TypeIsNullException {
		if (type != null) {
			if (type.length() > 5) {
				if (price >= 5000 && price < 50000) {
					for (int i = 0; i < info.length; i++) {
						if (info[i] != null) {
							if (info[i].getType().equals(type)) {
								info[i].setPrice(price);
								System.out.println("Price Is Updated");
								return true;
							}
							System.out.println("type is not found in " + i + " th indext moving to next one");
						}

					}
					throw new NullPointerException(" Array Index Is Null");

				}
				throw new PriceIsNotValidException("Price Is Not valid");
			}

			System.out.println("The Given type Length is not valid");
			return false;

		}
		throw new TypeIsNullException("Type Is Null");

	}

	public boolean delete(String type) throws NullPointerException, TypeIsNullException {
		if (type != null) {
			if (type.length() > 3) {
				for (int i = 0; i < info.length; i++) {
					if (info[i] != null) {
						if (info[i].getType().equals(type)) {
							info[i] = null;
							System.out.println("The type Is deleted");
							return true;
						}
						System.out.println("type is not found in" + i + " th index");
					}
				}
				throw new NullPointerException("Array Index Is Null");
			}
			System.out.println("The type length is not valid");
			return false;
		}

		throw new TypeIsNullException("Type Is Null");

	}

}
