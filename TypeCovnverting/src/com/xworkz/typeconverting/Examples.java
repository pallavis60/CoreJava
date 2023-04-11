package com.xworkz.typeconverting;

public class Examples {
	public static void main(String[] args) {
		
		byte marks = 100;
		int totalMarks = 500;
	//byte type converting
	    totalMarks = marks;
        System.out.println(marks);
    // byte typeCasting
          marks =(byte) totalMarks;
           System.out.println(marks);
           
           
           
         short noOfBooks = 7;
         int totalPages = 40000;
     // short typeConverting
         totalPages = noOfBooks;
         System.out.println(totalPages);
     //short typeCasting
         noOfBooks =(short) totalPages;
         System.out.println(totalPages);
         
           
           
          int populationInBTM = 80265;
          long populationInBangaluru = 13608000L;
   // int type converting;
          populationInBangaluru = populationInBTM;
          System.out.println(populationInBTM);
   // int type casting
          populationInBTM =(int) populationInBangaluru;
          System.out.println(populationInBangaluru);
          
          
           long phoneNo = 8618075534L;
           int pinCode = 577425;
       // long type converting    
           phoneNo = pinCode;
           System.out.println(pinCode);
       //long type Casting    
           pinCode = (int)phoneNo;
           System.out.println(pinCode);
           
                 
           
       //Type converting int to float    
           float per = 78.99F;
           int no = 8792;
           per = no;
           System.out.println(per);
           
           
           float perc = 57.88F;
           double val = 7464D;
       //Type converting float to double    
           val = perc;
       // Type casting double to float    
           System.out.println(val);
           perc = (float)val;
           System.out.println(perc);
     
           
           
       //Type Converting int to double 
           double piValue=3.144D;
           int value = 6733;
           piValue = value;
           value =(int)piValue;
           System.out.println(value);
           System.out.println(piValue);
           
           
      //type Casting long to double 
           long number = 9845835213L;
           double percentage = 984569.09383377F;
           percentage =(long)number;
           System.out.println(percentage);
           
           
           
           
		
	}

}