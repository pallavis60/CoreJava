package com.xworkz.resume;

import com.xworkz.resume.dao.ResumeDao;
import com.xworkz.resume.dto.AddressDto;
import com.xworkz.resume.dto.ResumeDto;

public class ResumeRunner {

	public static void main(String[] args) {
		ResumeDao obj = new ResumeDao();

		AddressDto obj2 = new AddressDto(105, "BTM", "Banglore", "Karnataka");
		ResumeDto obj3 = new ResumeDto("Aliya", "aliya123@gmail.com", "BSC", 9845835213L, "23/2/1990", "Mahesh", obj2);

		AddressDto obj5 = new AddressDto(106, "JPNagara", "Mysuru", "Karnataka");
		ResumeDto obj4 = new ResumeDto("Akshatha", "akshatha123@gmail.com", "BCOM", 8618075534L, "25/5/1997",
				"Manjunath", obj5);

		// calling Save method;
		obj.save(obj3);
		obj.save(obj4);
		obj.save(null);

		System.out.println("-------------------------------------------------------------------");

		// Calling findByName method;
		ResumeDto dtl = obj.findByName("Aliya");
		System.out.println(dtl);
		obj.findByName(null);
		obj.findByName("al");

		System.out.println("--------------------------------------------------------------------");

		// calling findByemail method;
		ResumeDto find = obj.findByemail("aliya123@gmail.com");
		System.out.println(find);
		obj.findByemail(null);

		System.out.println("-------------------------------------------------------------------");

		// calling updateDegreeByName method;
		obj.updateDegreeByName("Aliya", "MBBS");
		obj.updateDegreeByName("al", "BSC");
		obj.updateDegreeByName("Aliya", null);

		System.out.println("-----------------------------------------------------------------");

		// calling updatePhoneNumberByEmail method;
		ResumeDto result = obj.updatePhoneNumberByEmail("akshatha123@gmail.com", 9148960790l);
		System.out.println(result);
		obj.updatePhoneNumberByEmail("gshwghssh@123", 9856785463l);
		obj.updatePhoneNumberByEmail(null, 0);

		System.out.println("------------------------------------------------------------");

		// Calling deleteByName method;
		boolean ans = obj.deleteByName("Akshatha");
		System.out.println(ans);
		obj.deleteByName(null);
		obj.deleteByName("AL");

		System.out.println("----------------------------------------------------------");

		// calling readAll method
		ResumeDto[] array = obj.readAll();
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				System.out.println(array[i]);
			}
		}
	}
}
