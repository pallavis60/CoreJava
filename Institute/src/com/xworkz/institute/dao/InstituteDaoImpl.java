package com.xworkz.institute.dao;

import java.util.LinkedList;

import com.xworkz.institute.dto.InstituteDto;

public class InstituteDaoImpl implements InstituteDao {

	LinkedList<InstituteDto> list = new LinkedList<InstituteDto>();

	@Override
	public boolean save(InstituteDto dto) {
		if (dto != null) {
			list.add(dto);
			System.out.println("dto is saved");
			return true;
		}
		System.out.println("Dto is not saved");
		return false;
	}

	@Override
	public LinkedList<InstituteDto> read() {

		return list;
	}

	@Override
	public LinkedList<InstituteDto> find(String name) {
		if (name != null) {
			for (InstituteDto arry : list) {
				if (arry.getName().equals(name)) {
					System.out.println("Name is found");
					return list;
				}
			}
		}

		System.out.println("Name is not found");
		return null;
	}

	public boolean update(int fees, String location) {
		if (Integer.valueOf(fees) != null && location != null) {
			for (InstituteDto refer : list) {
				if (refer.getFees() == fees) {
					refer.setLocation(location);
					System.out.println("Location is updated");
					return true;

				}
			}
		}
		System.out.println("Location is not update");
		return false;
	}

	public boolean delete(String name) {
		if (name != null) {
			for (InstituteDto ref : list) {
				if (ref.getName().equals(name)) {
					list.remove(ref);
					System.out.println("Name is deleted");
					return true;
				}

			}
		}
		System.out.println("Name is not deleted");
		return false;

	}

}
