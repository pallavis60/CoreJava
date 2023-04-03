package com.xworkz.hierarchicalinheritancetwo;

public class Bike extends Vehicle{
	
	
	int wheel;
	float weight;
	
	public Bike(int wheel,float weight) {
		this.wheel=wheel;
		this.weight=weight;
	}
	
	public void affordableToPurchase() {
		System.out.println("It is affordable to purchase");
	}
	
	public void helpsToOffRoadRiding() {
		System.out.println("It Helps To OffRiding");
	}
	
	public static void main(String[] args) {
	
		Car obj = new Car("Car",70000,"Red",5);
		Bike obj1 = new Bike(2,400.45F);
		obj.helpsToTransport();
		obj.giveComfortJourney();
		obj.giveSafty();
		obj.attractive();
		obj1.affordableToPurchase();
		obj1.helpsToOffRoadRiding();
		
		
		System.out.println(obj.name);
		System.out.println(obj.colour);
		System.out.println(obj1.wheel);
	}

}
