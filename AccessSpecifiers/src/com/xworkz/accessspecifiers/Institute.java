package com.xworkz.accessspecifiers;

public class Institute {
	
	public  static String name =  "Xworkz";
	private  static int fee = 30000;
	protected static String location = "BTM";
    static String coding;
	public  int noOfStudents = 10;
    private  String timing = "9 am to 8 pm";
	protected int branches = 2;
	 String duration;
	 
	 
	 
	 public static void call() {
		 doing(); 
		 
		  }
	 
	private static void doing() {
		int fee;
		 String timing;
		 Institute obj2 = new Institute();
		 
		System.out.println(Institute.fee);
		System.out.println(obj2.timing);
		
	}
	

}
