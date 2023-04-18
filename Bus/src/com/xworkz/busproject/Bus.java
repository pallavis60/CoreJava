 package com.xworkz.busproject;

import com.xworkz.bus.constants.Type;

public class Bus {
	
	
	//static varibales
    public static String name = "BMTC" ;
	protected String busNo = "355J";
    private  int price = 200000000;
	static String colour = "Blue";
	
	
	//Non static varibales
	public String timing;
	protected  String route;
	private int seats;
	String weight;
	String speed;
	//Enum
    public Type types;
	
	
    public Bus(){
		
	}
	
	//Constructor for public instancevariables and enum
	public Bus(String timing,int price,String busNo,int seats,String weight,String speed) {
		  this.timing= timing;
		  this.types = types;
		  this.price = price;
		  this.busNo = busNo ;
		  this.seats = seats;
		  this.weight = weight;
		 this.speed = speed;
		
	  }

	
	
	
	//public method and calling  private method and variables
	public static void saferThanIndividualVehicle() {
		System.out.println("Method from public modifiers");
	}
	
	// public method
    public static void helpsTheEconomy() {
    	System.out.println("Method from public specifiers");
		
	}
    
	// protected method 
	protected static void requiresLessMaintenance() {
	System.out.println("Method from protected modifiers");
		
	}
	
	//default method
	 static void helpsToTravelToPeople() {
		 Bus obj2 = new Bus();
		 System.out.println(obj2.weight);
		 System.out.println(Bus.colour);
		
	}
	 
	// private method
	private static void helpsToTransferLuggages() {
		Bus obj = new Bus();
		System.out.println(obj.seats);
		System.out.println(obj.price);
		
	}
}