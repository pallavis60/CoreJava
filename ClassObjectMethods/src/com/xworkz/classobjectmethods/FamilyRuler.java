package com.xworkz.classobjectmethods;

import com.xworkz.classobjectmethods.family.Family;

public class FamilyRuler {

	
	public static void main(String[] args) {
		
		//Creating 5 instance
		Family obj = new Family("Patel" , 4 , "Shivamogga" , 2 , 400000);
		
		Family obj1 = new Family("Patel",4,"Hosanagara",2,600000);
		
		Family obj2 = new Family("Patel",4,"Sagara",2,40000);
		
		Family obj3 = new Family("Havyak", 5,"sagara",2,900000);
		
		Family obj4 = new Family("Singh",3,"HOsanagar",1,890000);
		
		//Printing the objects		
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		System.out.println(obj4.toString());
		
		
		//checking threeParameters is equal or not 
		System.out.println(obj.equals(obj1));
		//System.out.println(obj1.equals(obj2));
		//System.out.println(obj1.equals(obj4));
	}
}