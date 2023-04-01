package com.xworkz.inheritancefive;

public class Runner {
	
	public static  void main(String[] args) {
	Lion obj3 = new Lion("Animal",5,"Lion",10,"ReddishBrown",200);
		
		obj3.eat();
		obj3.walk();
		obj3.shouts();
		obj3.sensoryOrgans();
		obj3.power();
		obj3.compactBodies();
		
		
		System.out.println(obj3.divisionName);
		System.out.println(obj3.noOfDivision);
		System.out.println(obj3.nameOfAnimal);
		System.out.println(obj3.noOfDivision);
		System.out.println(obj3.age);
		System.out.println(obj3.colour);
		System.out.println(obj3.weight);
	}

}