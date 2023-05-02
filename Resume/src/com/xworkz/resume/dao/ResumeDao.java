package com.xworkz.resume.dao;

import com.xworkz.resume.dto.ResumeDto;

public class ResumeDao {

	ResumeDto[] details = new ResumeDto[20];

//Save method
	public boolean save(ResumeDto dto) {
		if (dto != null) {
			System.out.println("The given dto is not null");

			if (dto.getName() != null && dto.getFatherName() != null & dto.getEmail() != null) {
				if (dto.getName().length() >= 3 && dto.getFatherName().length() >= 3) {
					System.out.println("The name & father name & email is valid");

					for (int i = 0; i < details.length; i++) {
						if (details[i] == null) {
							details[i] = dto;
							System.out.println("The name is added");
							return true;
						}

					}
					System.out.println("The name is not added");
					return false;

				}
				System.out.println("The given name or fathername length is invalid");
				return false;

			}
			System.out.println("The given name or father name or email is null check the values");
			return false;

		}
		System.out.println("The given dto is null");
		return false;
	}

	// ReadAll method

	public ResumeDto[] readAll() {
		return details;
	}

	// findByName method

	public ResumeDto findByName(String name) {
		if (name != null) {
			if (name.length() > 3) {

				for (int i = 0; i < details.length; i++) {
					if (details[i] != null) {
						if (details[i].getName().equals(name)) {
							System.out.println("The name is found");
							return details[i];

						}

					}
					System.out.println("The index is null");

				}
				System.out.println("The name is not found");
				return null;

			}
			System.out.println("The given name length is not valid");
			return null;

		}
		System.out.println("The given name is null");
		return null;

	}

	// findByemail method

	public ResumeDto findByemail(String mail) {
		if (mail != null) {
			for (int i = 0; i < details.length; i++) {
				if (details[i] != null) {
					if (details[i].getEmail().equals(mail)) {
						System.out.println("The email is found");
						return details[i];
					}
				}
				System.out.println("The index is null i++");
			}
			System.out.println("The email is not found");
			return null;
		}
		System.out.println("The email is null");
		return null;
	}

//updateDegreeByName method
	public boolean updateDegreeByName(String name, String degree) {
		if (name != null && name.length() > 3) {
			System.out.println("The name is valid");
			if (degree != null && degree.length() >= 2) {
				System.out.println("The given Degree is Valid");
				for (int i = 0; i < details.length; i++) {
					if (details[i] != null) {
						details[i].getName().equals(name);
						details[i].setDegree(degree);
						System.out.println("The Degree is updated succsfully");
						return true;
					}
					System.out.println("The index does't have space");
				}

				System.out.println("The Degree is not updated");
				return false;

			}
			System.out.println("The given Degree Is not Valid");
			return false;
		}
		System.out.println("The given  name is not valid");
		return false;
	}

	// UpdatePhoneNumberByEmail

	public ResumeDto updatePhoneNumberByEmail(String email, long phoneNo) {
		if (email != null && email.length() > 10) {
			System.out.println("Email is valid");
			if (phoneNo >= 10) {
				System.out.println("The phoneNumber is valid");

				for (int i = 0; i < details.length; i++) {

					if (details[i] != null) {
						if (details[i].getEmail().equals(email)) {
							details[i].setPhoneNo(phoneNo);
							System.out.println("The PhoneNumber is updated sucessfully");
							return details[i];

						}

					}

				}
				System.out.println("The phoneNumber is not updated");
				return null;

			}
			System.out.println("The given phone number is not valid in length");
			return null;

		}
		System.out.println("The given email is not valid");
		return null;
	}

	// DeletedByName

	public boolean deleteByName(String name) {
		if (name != null && name.length() > 3) {
			for (int i = 0; i < details.length; i++) {
				if (details[i] != null) {
					if (details[i].getName().equals(name)) {
						details[i] = null;
						System.out.println(" The Name " + name + "  Deleted successfully");
						return true;

					}
				}

			}
			System.out.println("The Name " + name + "Is not deleted");
			return false;

		}
		System.out.println("The given name is null or it is not valid in length");
		return false;

	}
}
