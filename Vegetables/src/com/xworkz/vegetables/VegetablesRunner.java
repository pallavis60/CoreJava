package com.xworkz.vegetables;

import com.xworkz.vegetables.constant.Categories;
import com.xworkz.vegetables.dao.VegetablesDao;
import com.xworkz.vegetables.dto.ClassificationDto;
import com.xworkz.vegetables.dto.VegetablesDto;

public class VegetablesRunner {
	public static void main(String[] args) {

		VegetablesDao daoObj = new VegetablesDao();

		ClassificationDto classificationObj = new ClassificationDto("RootVegetables", "Carrot", "Parsnip",
				"wellDrainedSoil");
		VegetablesDto dtoObj = new VegetablesDto("potato", 60, "Brown", Categories.lentils, classificationObj);

		ClassificationDto classificationObj2 = new ClassificationDto("Bulb Vegetables", "Garlic", "Ridged",
				"SandyLoam");
		VegetablesDto dtoObj2 = new VegetablesDto("BitterGround", 70, "Green", Categories.darkGreen,
				classificationObj2);

//Calling save method
		boolean saving = daoObj.save(dtoObj);
		System.out.println(saving);

		boolean saving2 = daoObj.save(dtoObj2);
		System.out.println(saving2);

		System.out.println("----------------------------------------------------------------------------");
//Calling findByName method
		VegetablesDto finding = daoObj.findByName("Potato");
		System.out.println(finding);

		System.out.println("------------------------------------------------------------------");
//Calling deleteByName method
		boolean result = daoObj.deleteByName("BitterGround");
		System.out.println(result);
		System.out.println("---------------------------------------------------------------------");
//Calling readMethod;

		VegetablesDto[] read = daoObj.readAll();
		for (int i = 0; i < read.length; i++) {
			System.out.println(read[i]);
		}

	}

}
