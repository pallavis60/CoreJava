package com.xworkz.institute;

import java.util.LinkedList;

import com.xworkz.institute.dao.InstituteDao;
import com.xworkz.institute.dao.InstituteDaoImpl;
import com.xworkz.institute.dto.InstituteDto;

public class InstituteRunner {

	public static void main(String[] args) {

		InstituteDto obj = new InstituteDto("XWorkz", "BTM", 30000, 2, "FullStack");
		InstituteDto obj1 = new InstituteDto("JSpiders", "Basavanagudi", 50000, 10, "Java");
		InstituteDto obj2 = new InstituteDto("QSpiders", "Rajajinagar", 40000, 5, "Testing");
		InstituteDto obj3 = new InstituteDto("PSpiders", "JPNagarr", 35000, 3, "Python");

		InstituteDao object = new InstituteDaoImpl();

		System.out.println(
				"------------------------------ Save() method------------------------------------------------------------------");

		object.save(obj);
		object.save(obj1);
		object.save(obj2);
		object.save(obj3);

		System.out.println(
				"------------------------------finde() method-----------------------------------------------------------------");

		InstituteDto finding = object.find("XWorkz");
		System.out.println(finding);

		System.out
				.println("-------------------------------update() method---------------------------------------------");
		boolean updated = object.update(30000, "Rajajinagar");
		System.out.println(updated);

		System.out.println(
				"---------------------------delete() method----------------------------------------------------------------------------");

		boolean dlt = object.delete("PSpiders");
		System.out.println(dlt);

		System.out.println(
				"-----------------------------read() method-----------------------------------------------------------------");
		LinkedList<InstituteDto> reading = object.read();
		for (InstituteDto readed : reading) {
			System.out.println(readed.toString());
		}

	}
}
