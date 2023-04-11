package com.xworkz.methodoveriding;

public class Bus extends Vehicle  {
	
	public  void ride(int a,int b) {
		int netKilometers=a+b;
		System.out.println("The Total Ride ");
		System.out.println(netKilometers);
	}
	
	public  void travel(String name, int no) {
		System.out.println("Travelled by The Bus ");
		System.out.println(name);
		System.out.println(no);
	}
	
	public  void consume(int a , int b) {
		int totalPetrolConsume = a*b;
		System.out.println("Total Petrol Consuming By The Bus Is");
		System.out.println(totalPetrolConsume);
	}


}
