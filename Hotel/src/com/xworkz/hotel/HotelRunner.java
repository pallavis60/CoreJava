package com.xworkz.hotel;

import com.xworkz.hotel.dto.HotelDto;
import com.xworkz.hotel.service.HotelService;
import com.xworkz.hotel.service.HotelServiceImpl;

public class HotelRunner {

	public static void main(String[] args) {

		HotelDto info = new HotelDto("RoyalOrchild", "Shivamogga", 200, "White", 3000);
		HotelDto info1 = new HotelDto("Marvella", "Bangalore", 1000, "Red", 5000);
		HotelDto info2 = new HotelDto("BlueCrystal", "Chikkamangaluru", 300, "Blue", 2500);
		HotelDto info3 = new HotelDto("SterlingsMac", "Bangalore", 1500, "White", 8000);
		HotelDto info4 = new HotelDto("DC Comforts", "Chikkamangaluru", 600, "Rd", 6000);

		HotelService object = new HotelServiceImpl();

		System.out.println("--------------------------save()method-----------------------");

		object.save(1, info);
		object.save(2, info1);
		object.save(3, info2);
		object.save(4, info3);
		object.save(5, info4);

		System.out.println("------------findBYKey()----------------------------------------------");

		HotelDto finding = object.findByKey(3);
		System.out.println(finding);

		System.out.println("------------update() method------------------------------------------------");
		boolean res = object.update(1, "Vivanta");
		System.out.println(res);

		System.out.println("-------------delete() method------------------------------------------");

		boolean result = object.delete(4);
		System.out.println(result);

	}
}
