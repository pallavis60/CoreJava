package com.xworkz.constructorchaining;

public class Student {
	
	public Student() {
		this("Pallavi");
		System.out.println("No_arg constructor");
	}
	public Student(String studentname) {
		this("Pallavi",115);
		System.out.println("Paramrterized Constructor");
	}
	public Student(String studentname, int rollNo) {
		this("Pallavi",115,9845835213L);
		System.out.println("Parameterized Constructor two");
	}
	public Student(String studentName, int rollNo,long mblNo) {
    System.out.println("Parameterizrd constructo three");
	}
	
	  public static void main(String[]args){
		Student obj = new Student();
	}
    
    
	
	

}
