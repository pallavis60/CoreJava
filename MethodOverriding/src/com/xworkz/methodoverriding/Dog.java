package com.xworkz.methodoverriding;

public class Dog extends Animal {
	
	public void totalAnimal(int a, int b) {
		int lossOfDog = b-a;
		System.out.println("Loss Of Animals From Dog Class");
		System.out.println(lossOfDog);
	}

}
