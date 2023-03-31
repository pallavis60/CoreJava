package com.xworkz.oppsprogramming;

public class Car {
	String name;
	int price;
	String carNo;
	String colour;
	float weight;
	
	public Car() {
		System.out.println("Default constructor");
	}
	
	
	public Car(String name,int price,String carNo,String colour,float weight) {
		this.name=name;
		this.price=price;
		this.carNo=carNo;
		this.colour=colour;
		this.weight=weight;
		
		
		
		
	}
	 
	
	
	public  void giveComfort() {
		System.out.println("Firstmethodinparentclass");
	}
	
	public void affordableToPurchase() {
		System.out.println("Secondmethodinparentclass");
	}
	public void attractive() {
		System.out.println("Thirdmethodinparentclass");
	}
	

}
