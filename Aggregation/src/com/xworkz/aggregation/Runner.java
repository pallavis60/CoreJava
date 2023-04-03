package com.xworkz.aggregation;

public class Runner {
	
	public static void main(String[] args) {
		
		Doctors doct = new Doctors("Nikitha",25,"HeartSpecialist",5,300000);
		Paitient pait = new Paitient("NilithaNainar","6-11-2001",'B',"Female",9234567789L);
		Employee emp = new Employee("Nikki",98458754455L,"Marketing","ClientServices","Gastown 2013");
	    Treatment treat = new Treatment("Cancer Treatment",40,8.5f,3,5);
	    
	    
	    Hospital hosp = new Hospital(doct,pait,emp,treat);
	    hosp.doctors=doct;
		hosp.paitient=pait;
		hosp.emloyee=emp;
		hosp.treatment=treat;
		
		System.out.println(doct.name);
		System.out.println(doct.age);
		System.out.println(doct.speciality);
		System.out.println(doct.experience);  
		System.out.println(doct.salary);
		
	//	System.out.println(hosp.paitient);
		//System.out.println(hosp.emloyee);
		//System.out.println(hosp.treatment);
		
		
		
	
	

}
}
