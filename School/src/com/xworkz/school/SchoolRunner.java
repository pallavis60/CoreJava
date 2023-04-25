package com.xworkz.school;

import com.xworkz.school.dao.SchoolDao;

public class SchoolRunner {
    
	public static void main(String[] args) {
		
		SchoolDao dao = new SchoolDao();
	
	     dao.saveString("Gowri");
	     dao.saveString("nikitha");
	     dao.saveString("mahalakshmi");
	     dao.saveString("sheela");
	     dao.saveString("ashwini");
	    
	     
	
	     dao.read();
		
	}
    
    
}
