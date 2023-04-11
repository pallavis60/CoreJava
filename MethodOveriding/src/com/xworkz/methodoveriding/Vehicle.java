
package com.xworkz.methodoveriding;

public class Vehicle {
	
	public  void ride(int a,int b) {
		int totalAmount=a+b;
		System.out.println("Total Amout To Ride");
		System.out.println(totalAmount);
	}
	
	public  void travel(String name, int no) {
		System.out.println("Travelled by");
		System.out.println(name);
		System.out.println(no);
	}
	
	public  void consume(int a , int b) {
		int totalPetrolConsume = a+b;
		System.out.println("Total Petrol Consuming");
		System.out.println(totalPetrolConsume);
	}

}
