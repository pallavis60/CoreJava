package com.xworkz.car;

import com.xworkz.car.custom.ArrayOutOfBoundException;
import com.xworkz.car.custom.DtoIsNullException;
import com.xworkz.car.custom.ModelIsNullException;
import com.xworkz.car.custom.NameIsNullException;
import com.xworkz.car.custom.PriceIsNotValidException;
import com.xworkz.car.dao.CarDao;
import com.xworkz.car.dao.CarImpl;
import com.xworkz.car.dto.CarDto;

public class CarRunner {
	
	public static void main(String[] args) {
		
		CarDto obj = new CarDto("Skoda",10000000,"Skoda Kodiaq","Black",5);
		CarDto obj1= new CarDto("BMW",50000000,"BMW X1","White",6);
		CarDto obj2 = new CarDto("MarutiWagon",6000000,"Wagon R","Red",5);
		
		
		CarDao object = new CarImpl();
		try {
			object.save(obj);
			object.save(obj2);
			object.updateByTwoFields("Skoda","Skoda Kodiaq","White");
			CarDto find =object.findByTwoFields("Skoda", "Skoda Kodiaq");
			System.out.println(find);
			
			CarDto finding=object.find("Skoda");
			System.out.println(finding);
			object.update("Skoda", 300000);
			
			
		}
		catch(ArrayOutOfBoundException e) {
			e.printStackTrace();
		}
		catch(DtoIsNullException e) {
			e.printStackTrace();
		}
		
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(NameIsNullException e) {
			e.printStackTrace();
		}
		catch(PriceIsNotValidException e) {
			e.printStackTrace();
		}
		catch(ModelIsNullException e) {
			e.printStackTrace();
		}
		
		
		CarDto[] reading = object.read();
		for(int i=0;i<reading.length;i++) {
			if(reading[i]!=null) {
				System.out.println(reading[i]);
			}
		}
			
		}
			
	
	
}
