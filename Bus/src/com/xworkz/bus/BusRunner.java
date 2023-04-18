package com.xworkz.bus;

import com.xworkz.bus.constants.Type;
import com.xworkz.busproject.Bus;


public class BusRunner extends Bus {
	
	//Constructor for protected instance variables
	
	protected BusRunner( String route) {
		this.route = route;
		}
	

	public static void main (String[] args) {
		
		//calling the public method
		Bus.saferThanIndividualVehicle();
		Bus.helpsTheEconomy();
	    Bus.requiresLessMaintenance();
	    System.out.println(Type.MiniBus.typeOf);
	    
	    
	    //Calling the public static variable
	    System.out.println(Bus.name);
	    
	    //Calling the public non static variables and enum
	    Bus obj4 = new Bus("9pm to 8 am",3000000,"355J",30,"4000Kg","76km/hr") ;
	    
	    System.out.println(obj4.timing);
	    System.out.println(obj4.types);
	
	//calling the static and non static variables of protected specifiers;
	BusRunner obj3 = new BusRunner("banashankari to koramngala");
	
	System.out.println(obj3.route);
	System.out.println(obj3.busNo);
	
	
	}
}
