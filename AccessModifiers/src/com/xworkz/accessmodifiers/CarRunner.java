package com.xworkz.accessmodifiers;

import com.xworkz.accessmodifierstwo.Car;

public class CarRunner extends Car {
	
	public static void main(String[] args) {
		System.out.println(Car.name);
		
		
		CarRunner obj = new CarRunner();
		System.out.println(obj.seats);
		
		System.out.println(Car.colour);
		System.out.println(Car.price));
		
	}

}
