package com.xworkz.methodoveriding;

public class Car extends Vehicle {
	
	public  void ride(int a,int b) {
		int netAmout=a+b;
		System.out.println("Total Amout To Ride by Car Is ");
		System.out.println(netAmout);
	}
	
	public  void travel(String name, int no) {
		System.out.println("Travelled by The Car Of Following Details");
		System.out.println(name);
		System.out.println(no);
	}
	
	public  void consume(int a , int b) {
		int totalPetrolConsume = a*b;
		System.out.println("Total Petrol Consuming By this Car Is");
		System.out.println(totalPetrolConsume);
	}


}