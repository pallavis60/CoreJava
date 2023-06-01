package com.xworkz.college;

import java.util.ArrayList;

public class CollegeRunner {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		// add() method
		list.add("IIM College");
		list.add("Chanakya");
		list.add("Christ University");
		list.add("SJC bangalore");
		list.add("NIT Surathkal");
		list.add("Ramaiah Medical College");
		list.add("St.Aloysius College");
		list.add("Jyothi Nivas College");
		list.add("Oxford College");
		list.add("JSS Academy Of Higher Education");
		list.add("Dayanand Sagar College");
		list.add("Vivekananda College");
		list.add("Jawaharlal Nehru Medical College");
		list.add("Maratha Mandal College");
		list.add("Seshadripuram College");
		list.add("Siddaganga Institute");
		list.add("Aj Aviation Academy");
		list.add("WeSchool");
		list.add("SDM Law College");
		list.add("IIFA Lancaster Degree College");
		list.add("AD Biligowda First Grade College");
		list.add("krupanidhi Group Of Institute");

		// remove() method
		list.remove(0);
		list.remove(1);
		list.remove(2);
		list.remove(3);
		list.remove(4);

		// add() method by index
		list.add(0, "IIM College");
		list.add(1, "Chanakya");
		list.add(2, "Christ University");
		list.add(3, "SJC bangalore");
		list.add(4, "NIT Surathkal");

		// indexOf() method

		System.out.println(list.indexOf("IIM College"));
		System.out.println(list.indexOf("SDM Law College"));
		System.out.println(list.indexOf("Vivekananda College"));

		// set() method

		System.out.println(list.set(7, "Rajiv Gandi Univercity"));
		System.out.println(list.set(8, "Cental Univercity"));
		System.out.println(list.set(9, "Visvesvaraya Technology"));
		
		
		
		System.out.println("------------------------------------------------------");

		// toArray() method
		
	     Object[] array =	list.toArray();
	    
	     
	     for(String arry: list) {
	    	 System.out.println(arry);
     }

	     
	     System.out.println("--------------------------------------------------");
		
		// get() method

		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		System.out.println(list.get(6));
		System.out.println(list.get(7));
		System.out.println(list.get(8));
		System.out.println(list.get(9));
		System.out.println(list.get(10));

	}
}
