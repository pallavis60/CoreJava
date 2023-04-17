package com.xworks.radious;

public class Expression {
	
	double radious;
	double pi ;
	int constant;

	public  Expression (double radious,double pi,	int constant){
          this. radious = radious;
          this.pi = pi;
          this.constant =constant;
	}
	 
	public static void main(String[] args){
		Expression rad = new Expression(7.5,3.14,2);
	
		
		
	    double perimeter =rad. constant *rad.pi*rad.radious ;
		double  area =rad. pi*rad.radious*rad.radious;
		
		System.out.println("perimeter of circle"   +   perimeter);
		System.out.println("Area of the circle"    +     area);
		
	}

}
