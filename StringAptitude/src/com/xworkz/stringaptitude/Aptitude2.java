package com.xworkz.stringaptitude;

public class Aptitude2 {

	public static void main(String[] args) {
		
		String value = " new Programming";
		char[] b = value.toCharArray();
		
		for(char val : b) {
			if(val=='a'||val=='i'|| val=='e'|| val=='o') {
				System.out.print(val);
			}
			else {
				System.out.println(" ");
			}
			
			
		}
	}

}
