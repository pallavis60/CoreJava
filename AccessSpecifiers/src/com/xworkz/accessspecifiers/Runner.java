package com.xworkz.accessspecifiers;

public class Runner {
	
	public static void main(String[] args){
		//Calling private variable
		Institute.call();
		
		//Calling public varibales;
		Institute obj = new Institute();
		obj.noOfStudents =10;
		System.out.println(Institute.name);
		System.out.println(obj.noOfStudents);
		
		//Calling Default variables
		Institute.coding = "Java";
	    obj.duration="6 months";
	    System.out.println(Institute.coding);
	    System.out.println(obj.duration);
	    
	    
	    
	    //calling protected variables;
	    System.out.println(Institute.location);
	   System.out.println(obj.branches);
	    
	    
	    
	    
		
		
		
	
		
	
	}

}
