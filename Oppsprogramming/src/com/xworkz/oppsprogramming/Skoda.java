package com.xworkz.oppsprogramming;

public class Skoda extends Car{
	int seats ;
	float mileage ;
	 
	public Skoda(int seats, float mileage) {
		this.seats = seats;
		this. mileage= mileage;
		
			
		
	}
	
	public void automatictransmission() {
		System.out.println("First Method In Child Third");
	}
	
	public void digitalClock() {
		System.out.println("Second Method In Child Third");
	}

}
