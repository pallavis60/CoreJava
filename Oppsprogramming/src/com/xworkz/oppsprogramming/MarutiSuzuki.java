 package com.xworkz.oppsprogramming;

public class MarutiSuzuki extends Car {
	int availableModel;
	int hatchbacks;
	
	
	public MarutiSuzuki(int availableModel, int hatchbacks) {
		this.availableModel=availableModel;
		this.hatchbacks= hatchbacks;
		
	}
	public void goodFuelEfficient() {
		System.out.println("First Method From Child One");
	}
	
	public void havingMachineAlloyWheels() {
		System.out.println("Second Method From Child One");
	}

}