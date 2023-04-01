package com.xworkz.inheritancefive;

public class Lion extends Animal {
	
	String colour;
	int weight;
	
	public Lion(String divisionName,int noOfDivision,String nameOfAnimal,int age,String colour,int weight) {
		this.colour=colour;
		this.weight=weight;
		this.nameOfAnimal=nameOfAnimal;
		this.age = age;
		this.noOfDivision=noOfDivision; 
		this.divisionName=divisionName;

	}


	public void power() {
		System.out.println("Lions have more power");
	}
	
	public void compactBodies() {
		System.out.println("Lions have Compactbodies");
	}

}
