package com.xworkz.hierarchicalinheritance;

public class Grapes extends Fruit {
	
	int species;
    int calories;
	
	public Grapes( String name,char vitamin,int species,int calories) {
		this.name = name;
		this.vitamin=vitamin;
		this.species=species;
		this.calories=calories;
		
	}
	
	
	public void goodSourcesOfVitamin() {
		System.out.println("They Contains vitamin c");
	}
	
	public void juicyAndSweet() {
		System.out.println("They are Juicy and Sweet");
	}
	
	public static void main(String[] args) {
		Grapes grap = new Grapes("Grape",'C',60,3);
		Apple app= new Apple("Apple",'C',"Sperical",1.5F);
		grap.goodSourcesOfVitamin();
		grap.juicyAndSweet();
		grap.provideVitamin();
		grap.goodTaste();
		app.goodForWeightLoss();
		app.decreasesTheRiskOfDiabetes();
		
		System.out.println(grap.name);
		System.out.println(app.vitamin);
		System.out.println(grap.species);
		System.out.println(grap.calories);
		System.out.println(app.shape);
		System.out.println(app.weight);
		
	}
     
	
	
	
}
