package com.xworkz.methodoverriding;

public class Runner {
	public static void main(String[] args) {
		Animal obj = new Animal();
		obj.totalAnimal(100,200);
		
		Dog obj2 = new Dog();
		obj2.totalAnimal(100, 200);
		
	}

}
