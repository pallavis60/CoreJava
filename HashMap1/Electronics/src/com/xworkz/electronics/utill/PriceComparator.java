package com.xworkz.electronics.utill;

import java.util.Comparator;

import com.xworkz.electronics.dto.ElectronicsDto;

public class PriceComparator implements Comparator<ElectronicsDto> {

	@Override
	public int compare(ElectronicsDto o1, ElectronicsDto o2) {
		if (o1.getPrice() > o2.getPrice()) {
			return 1;
		}
		return -1;
	}

}
