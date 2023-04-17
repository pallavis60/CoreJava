package com.xworkz.accessspecifierstwo;

public class College {
	private static String name = "KGFGC";
    private static 	int noOfStudents;
   private static String univercity = "Kuvempu";
	private static int fee = 10000;
	
	
	
	
	public static String naming() {
		System.out.println(name);
		return name;
		
	}
	
	public static int value(int noOfStudents) {
		System.out.println(noOfStudents);
		return noOfStudents;
	}
	
	public static String calling() {
		System.out.println(univercity);
					return univercity;
					
	}
	
public static int no() {
	System.out.println(fee);
	return fee;
}
																		
}
