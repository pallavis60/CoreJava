package com.xworkz.oppsprogramming;

public class Mahindra extends Car {
	int airbags ;
	int gncapRating ;
	
	
	 public Mahindra (int airbags, int gncapRating) {
		this.airbags = airbags;
		this.gncapRating=gncapRating;
		
		
		
		
		
	}
	
	
	public void haveAnchorPointsForChildSeat() {
		System.out.println("FirstMethodFromChildSecond");
	}
	
	public void speedSensingDoorLock() {
		System.out.println("SecondMethodFromChildSecond");
	}

}
