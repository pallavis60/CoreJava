package com.xworkz.hierarchicalinheritancetwo;

public class Car extends Vehicle {
   String colour;
	int seat;
	
	
	
	public Car(String name,int price,String colour,int seat) {
		this.name=name;
		this.price=price;
		this.colour=colour;
		this.seat=seat;
		
		
	}
	
	public void giveSafty() {
		System.out.println("It Give Safe Journey");
	}
	
	public void attractive() {
		System.out.println("It is Attractive");
	}

}
