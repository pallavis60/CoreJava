package com.xworks.radious;

public class Convert {
	
	static  int f = 212;
	static int con = 32; 
    static  int no = 5;
    static  int num = 9;
    static double inch = 1000;
    static double oneInch = 0.0254;
    
	
	
	public static void main(String[] args) {

		
		double celsius = (f-con)*no/num;
		double meter = inch*oneInch;
		
		System.out.println(celsius + "C");
		System.out.println("1000.0 inch is "+ meter +"meters" );
	}
}


//(F-32)*5/9=c