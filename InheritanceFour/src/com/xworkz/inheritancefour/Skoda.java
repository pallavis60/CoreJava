package com.xworkz.inheritancefour;

public class Skoda extends Car {
	int seats =5;
	float mileage=7.8f;
	
	public Skoda() {
		System.out.println("Default Constructor");
	}
				
	
	public void automatictransmission() {
		System.out.println("First Method In Child Third");
	}
	
	public void digitalClock() {
		System.out.println("Second Method In Child Third");
	}
	
	
	public static void main(String[] args) {
		
		Skoda car = new Skoda();
		
		car.helpsToTransport();
		car.giveComfortJourney();
		car.affordableToPurchase();
		car.attractive();
		car.automatictransmission();
		car.digitalClock();
		
		
		
		System.out.println(car.brand);
		System.out.println(car.carNo);
		System.out.println(car.name);
		System.out.println(car.price);
		System.out.println(car.seats);
		System.out.println(car.mileage);
		
	}

}
