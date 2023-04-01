package com.xworkz.inheritancefour;

public class Car extends Vehicle {
	
	String brand="Skoda";
	String carNo="KA4567";
	
	
	public void affordableToPurchase() {
		System.out.println("First Method From Child");
	}
	
	public void attractive() {
		System.out.println("Second Method From Child");
	}
}
