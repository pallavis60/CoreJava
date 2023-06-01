package com.xworkz.institute.dao;

import java.util.Iterator;
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
	public InstituteDto find(String name) {
		if (name != null) {
			for (InstituteDto arry : list) {
				if (arry.getName().equals(name)) {
					System.out.println("Name is found");
					return arry;
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
			Iterator<InstituteDto> itr = list.iterator();
			while (itr.hasNext()) {
				InstituteDto refer = (InstituteDto) itr.next();
				if (refer.getName().equals(name)) {
					itr.remove();
					System.out.println("Value is deleted");
					return true;
				}
				System.out.println("Name is not found");
			}
		}
		System.out.println("Value is not deleted");
		return false;
	}
}
