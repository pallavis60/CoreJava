package com.xworkz.methodoverloading;

public class Calculator {
	
	
		
		
		
		public  static  int  add(int a, int b) {
			int value = a+b;
			System.out.println("The added Value From FirstMethod");	
			System.out.println(value);
			return value;
			
		}
		
		public static int add(int a, int b, int c) {
			int addedValue =a+b+c;
			System.out.println("The Added Value From Second Method");
			System.out.println(addedValue);
			return addedValue;
		}
		
		public static int add(int a, int b, int c,int d) {
			int sum = a+b+c+d;
			System.out.println("the adeed value from third method");
			System.out.println(sum);
			return sum;
		}
		
		public static void main(String[] args) {
			
			add(10,20);
			add(10,20,30);
			add(10,20,30,40);
			
		}
	}


