package com.xworkz.inheritancethree;

public class SmartPhone extends KeypadMobile {
	
	int Storage;
	int displaySize;
	
	
	public SmartPhone(String name , int price,int size,String simName,int Storage,int displaySize){
		 this.name = name;
    	 this.price = price;
    	 this.size=size;
   	     this.simName=simName;
   	     this.Storage = Storage;
		 this.displaySize=displaySize;
	}
	
	public static void main(String[] args) {
		SmartPhone obj = new SmartPhone("Landline", 5000,6,"BSNL",64,9);
		obj.doCall();
		obj.actAsPowerSource();
		obj.message();
		obj.doGames();
		obj.goodClarity();
		obj.giveInformation();
		
		
		System.out.println(obj.name);
		System.out.println(obj.price);
		System.out.println(obj.size);
		System.out.println(obj.simName);
		System.out.println(obj.Storage);
		System.out.println(obj.displaySize);	
		
	}
	
	public void goodClarity() {
		System.out.println("Have Good Clarity");
	}
	public void giveInformation() {
		System.out.println("Give Information Through Internet");
	}
	
	

}
