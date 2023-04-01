package com.xworkz.inheritancetwo;

public class Karnataka extends State {
	
	String capitalName ;
	int noDistricts ;
	
	
	public Karnataka(String name,int population,String capitalName, int noDistricts) {
		this.name = name;
		this.population=population;
		this.capitalName=capitalName;
		this.noDistricts=noDistricts;
	}
	
	
	public void famousForItsMagicalHillStations() {
		System.out.println("First Method From Child");
	}
	
	public void oldestRegions() {
		System.out.println("Second Method From Child");
	}
	
	
	public static void main(String[] args) {
		Karnataka obj = new Karnataka("Karnataka",66165886,"Bangaluru",31);
		
		obj.history();
		obj.haveCapital();
		obj.famousForItsMagicalHillStations();
		obj.oldestRegions();
		
		
		System.out.println(obj.name);
		System.out.println(obj.population);
		System.out.println(obj.capitalName);
		System.out.println(obj.noDistricts);
		
		
	}

}
