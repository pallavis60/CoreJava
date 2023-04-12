package com.xworkzarrayandloop;

public class Elements {

	public static void main(String[] args) {
		
		//Creating ArrayUsing literals
		int[] marks = {70,30,45,67,24,90,46,37,98,50};
		String[] names= {"Pallavi","Nikitha","Gowri","Sheela","Mahalakshmi","Ashwini","Bhagya"};
		char[] vitamin = {'A', 'B', 'C', 'D' };
		float[] percentage = {45.5F, 67.9F, 67.9F, 45.8F, 78.9F};
		double[] intrest = {34.77D, 67.22D, 23.22D, 4.55D};
		int[] integer = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		//Creating Array Using NewKeyword
		
		int[] noOfStudents = new int[10];
		String[] mobileNames = new String[20];
		float[] percentOfStudents = new float[11];
		char[] vitamins = new char[15];
		int[] evenNo = new int[50];
		
		
		for(int i=0; i<=marks.length-1; i++) {
		  System.out.println(marks[i]);
		  i++;
		
		}
		
		System.out.println("----------------------------------------------------");
		
		for(int i=marks.length-1; i>0 ;i--){
	
				
			System.out.println(marks[i]);
				i--;
		
			
		}
		
		System.out.println("----------------------------------------------------");
		for(int i=0; i<=integer.length-1; i++) {
			if(integer[i]%2==0) {
				System.out.println(integer[i]);
			}
		}
		
	}
}
