package com.xworkz.methodoveriding;

public class Taxi extends Vehicle {
	
	public  void ride(int a,int b) {
		int members=a+b;
		System.out.println("The Total People Travelled ");
		System.out.println(members);
	}
	
	public  void travel(String name, int no) {
		System.out.println("Travelled by The Taxi ");
		System.out.println(name);
		System.out.println(no);
	}
	
	public  void consume(int a , int b) {
		int totalPetrolConsume = a*b;
		System.out.println("Total Petrol Consuming By The Taxi Is");
		System.out.println(totalPetrolConsume);
	}


}
