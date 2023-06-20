package com.xworkz.television;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Set;

import com.xworkz.television.dto.TelevisionDto;
import com.xworkz.television.service.TelevisionService;
import com.xworkz.television.service.TelevisionServiceImpl;



public class Runner {
	
	 
	
	public static void main(String[] args) {
		
		 LocalDate date = LocalDate.parse("2023-06-14");
		 LocalDate date1 = LocalDate.parse("2022-05-13");
		 LocalDate date2= LocalDate.parse("2021-04-12");
		 LocalDate date3 = LocalDate.parse("2020-03-11");
		 LocalDate date4 = LocalDate.parse("2019-02-10");
		 LocalDate date5 = LocalDate.parse("2018-01-09");
		// Date dates= new Date(new LocaleData(null));
		 
		
		TelevisionDto dto = new TelevisionDto("LgTv",20000,"Black",3.5f,"1Year",date);
		TelevisionDto dto1 = new TelevisionDto("OnePlus",25000,"Silver",4.5f,"3Year",date2);
		TelevisionDto dto2 = new TelevisionDto("Acer",12000,"Black",2.5f,"2Year",date3);
		TelevisionDto dto3 = new TelevisionDto("MiSmartTv",19000,"Black",3.3f,"4Year",date4);
		TelevisionDto dto4 = new TelevisionDto("TCLSmartTv",18000,"Silver",4.2f,"1.5Year",date5);
		TelevisionDto dto5 = new TelevisionDto("Dyanora",8400,"Silver",3.9f,"6 months",date1);
		
		TelevisionService service = new TelevisionServiceImpl();
		//save()
		service.save(1, dto);
		service.save(2, dto1);
		service.save(3, dto2);
		service.save(4, dto3);
		service.save(5, dto4);
		service.save(6, dto5);
		
		System.out.println("--------findMethod()----------------------------");
		TelevisionDto finding =service.findByBrand("Dyanora");
		System.out.println(finding);
		
		System.out.println("================update()Method====");
		boolean updating = service.updateByPrice(12000, 21000);
		System.out.println(updating);
		
		System.out.println("==================delete()");
		boolean dlt = service.deleteByBrand("TCLSmartTv");
		System.out.println(dlt);
		
		
		System.out.println("------------------------------------------");
		//read() method
		 
		HashMap<Integer, TelevisionDto> reading = service.read();
		Set<Integer> keys =  reading.keySet();
		
		for(Integer key : keys) {
			System.out.println(reading.get(key));
		}
		
	}

}
