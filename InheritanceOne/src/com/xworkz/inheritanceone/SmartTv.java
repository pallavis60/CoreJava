package com.xworkz.inheritanceone;

public class SmartTv extends Telivision {
	
	
	String colour;
	float size;
	
	
	public SmartTv( String name, int price,String colour,float size) {
		this.name = name;
		this.price=price;
		this.colour = colour;
		this.size = size;
	}
	
	public void playSongs() {
		System.out.println("First method from SmartTv");
	}
	
	public void givesGoodClarity() {
		System.out.println("Second method from SmartTv");
	}
	
	public static void main(String[] args) {
		SmartTv obj = new SmartTv("LED TV", 340000,"Black",6.7F);
		
		obj.giveEntertainment();
		obj.giveInformation();
		obj.playSongs();
		obj.givesGoodClarity();
		
		System.out.println(obj.name);
		System.out.println(obj.price);
		System.out.println(obj.colour);
		System.out.println(obj.size);
	}
}
	
