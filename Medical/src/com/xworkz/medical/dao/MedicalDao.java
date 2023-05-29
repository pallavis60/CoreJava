package com.xworkz.medical.dao;

import com.xworkz.medical.custom.NameIsNullException;
import com.xworkz.medical.custom.arrayIsNullException;
import com.xworkz.medical.custom.dtoIsNullException;
import com.xworkz.medical.custom.locationIsNotValidException;
import com.xworkz.medical.custom.nameIsNotValidException;
import com.xworkz.medical.dto.MedicalDto;

public class MedicalDao {

	MedicalDto[] details = new MedicalDto[10];

	public boolean save(MedicalDto dto) throws dtoIsNullException {
		if (dto != null) {
			if (dto.getName() != null && dto.getLocation() != null) {
				for (int i = 0; i < details.length; i++) {
					if (details[i] == null) {
						details[i] = dto;
						System.out.println("The Dto is saved");
						return true;
					}

				}
			
			}
			System.out.println("The given name is not valid");
			return false;
		}

		throw new dtoIsNullException("Dto is null");
	}

	public MedicalDto[] read() throws arrayIsNullException {
		if (details != null) {
			return details;
		}
		throw new arrayIsNullException();
	}

	public boolean update(String name, String location) throws NameIsNullException, locationIsNotValidException {
		if (name != null && name.length() > 3) {
			if (location != null && location.length() > 3) {
				for (int i = 0; i < details.length; i++) {
					if (details[i] != null) {
						details[i].getName().equals(name);
						details[i].setLocation(location);
						System.out.println("The location is updated");
						return true;

					}

				}
				System.out.println("The Location is not updated");
				return false;

			}
			throw new locationIsNotValidException("location is not valid");
		}
		throw new NameIsNullException("Name is null");

	}

	public boolean delete(String name) throws nameIsNotValidException {
		if (name != null && name.length() > 3) {
			for (int i = 0; i < details.length; i++) {
				if (details[i] != null) {
					details[i].getName().equals(name);
					details[i] = null;
					System.out.println("Deleted Successfully");
					return true;
				}
				System.out.println("Name is not deleted");
			}
		}
		throw new nameIsNotValidException("name is not valid");
	}
}
