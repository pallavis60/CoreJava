package com.xworkz.hirarchicalinheritance;

public class Grapes extends Fruit{
	float weight = 3.5f;
	
	
	
	public static  void richInSweet() {
		System.out.println("Method from Child Grapes Class");
	}
	
	
	
	public static void main(String[]args) {
		
		Grapes obj = new Grapes();
		obj.giveProtiens();
		
		
		
	}

}
