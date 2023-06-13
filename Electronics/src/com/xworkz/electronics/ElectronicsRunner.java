package com.xworkz.electronics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.electronics.dto.ElectronicsDto;
import com.xworkz.electronics.utill.DateComparator;
import com.xworkz.electronics.utill.PriceComparator;
import com.xworkz.electronics.utill.WarrantyComparator;

public class ElectronicsRunner {

	public static void main(String[] args) {

		List<ElectronicsDto> list = new ArrayList<ElectronicsDto>();

		ElectronicsDto dto1 = new ElectronicsDto("LedTv", 32000, 29, 4.2f, 2025, false);
		ElectronicsDto dto2 = new ElectronicsDto("LenovoLaptop", 29000, 21, 3.2f, 2030, true);
		ElectronicsDto dto3 = new ElectronicsDto("Pureit", 25000, 6, 2.2f, 2023, false);
		ElectronicsDto dto4 = new ElectronicsDto("SalaryBox", 8000, 12, 3.3f, 2026, true);
		ElectronicsDto dto5 = new ElectronicsDto("AppleWatch", 31000, 31, 4.0f, 2027, true);
		ElectronicsDto dto6 = new ElectronicsDto("AirCooler", 980, 7, 2.4f, 2031, false);
		ElectronicsDto dto7 = new ElectronicsDto("Refrigerator", 14000, 22, 4.6f, 2029, false);
		ElectronicsDto dto8 = new ElectronicsDto("EchoDot", 4499, 5, 1.5f, 2028, true);
		ElectronicsDto dto9 = new ElectronicsDto("HeadPhone", 2000, 11, 3.3f, 2022, true);
		ElectronicsDto dto10 = new ElectronicsDto("OnePlusMobile", 56000, 15, 2.2f, 2028, false);

		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		list.add(dto6);
		list.add(dto7);
		list.add(dto8);
		list.add(dto9);
		list.add(dto10);

		PriceComparator obj = new PriceComparator();

		DateComparator obj2 = new DateComparator();

		WarrantyComparator obj3 = new WarrantyComparator();

		Collections.sort(list, obj);
		Collections.sort(list, obj2);
		Collections.sort(list, obj3);

		for (ElectronicsDto dto : list) {
			System.out.println(dto);
		}

	}

}
