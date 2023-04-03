package com.xworkz.hierarchicalinheritance;

public class Apple extends Fruit {
	String shape;
	float weight;
	
	public Apple(String name,char vitamin,String shape,float weight) {
		this.name = name;
		this.vitamin=vitamin;
		this.shape=shape;
		this.weight=weight;
		
	}
	
	
	
	public void goodForWeightLoss() {
		System.out.println("helps to loss Weight");
	}
	
	
	public void decreasesTheRiskOfDiabetes() {
		System.out.println("Helps to decreases the risk of diabetes");
	}

}
