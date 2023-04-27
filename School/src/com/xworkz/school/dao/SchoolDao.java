package com.xworkz.school.dao;

public class SchoolDao {

	String[] studentName = new String[5];
	
	
	public String[] saveString(String str) {
		
		if(str!=null & str.length()<=7) {
			System.out.println("name is valid ");
			
			    
			for(int i=0; i<studentName.length; i++) {
				if(studentName[i]==null) {
				
					studentName[i]=str;
				System.out.println("Student name is "+studentName[i]);
				return studentName;
				}
			
			}
		}	 
				
			System.out.println("StudentName is Not Valid");
			return studentName;
		}
			
	
	public void read() {
		for(int i=0; i<studentName.length; i++) {
			System.out.println(studentName[i]);
			
			}
	}
	
}