package com.xworkz.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.comparable.dto.BusDto;

public class BusRunner {

	public static void main(String[] args) {

		List<BusDto> object = new ArrayList<BusDto>();

		BusDto obj = new BusDto("KSRTC", 2515, 45, "8.30Pm");
		BusDto obj2 = new BusDto("RaajHamsa", 6777, 50, "9.30Am");
		BusDto obj3 = new BusDto("Durgamba", 1344, 30, "10AM");
		BusDto obj4 = new BusDto("Hanuman", 4999, 20, "5Pm");

		object.add(obj);
		object.add(obj2);
		object.add(obj3);
		object.add(obj4);

		Collections.sort(object);

		for (BusDto dto : object) {
			System.out.println(dto);
		}

	}

}
