package com.xworkz.methodoverridingtwo;

public class Dog extends Animal {
	
	public void totalAnimal(int a, int b) {
		int animalLoss = b-a;
		System.out.println("LossOfAnimalFrom Child Method");
		System.out.println(animalLoss);
	}

}
