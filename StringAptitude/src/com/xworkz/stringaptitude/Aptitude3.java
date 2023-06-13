package com.xworkz.stringaptitude;

public class Aptitude3 {

	public static void main(String[] args) {
		
		String name="Java Programming";
		 char[] val2 = name.toCharArray();
		 
	   for(char val : val2) {
		   if( val=='J'|| val=='v'|| val=='P'|| val=='r' || val=='g' ||val=='n'||val=='m') {
			   System.out.print(val); 
		   }
	   }
			 
	}

}
