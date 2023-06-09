package com.xworkz.student;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

import com.xworkz.student.dto.StudentDto;
import com.xworkz.student.service.StudentService;
import com.xworkz.student.service.StudentServiceImpl;

public class StudentRunner {

	public static void main(String[] args) {
		
		StudentService object = new StudentServiceImpl();
		
		StudentDto dto1 = new StudentDto("Nikitha", 101, 22, "bsc", "Shivamogga");
		StudentDto dto2 = new StudentDto("Sheela", 102, 23, "MBBS", "Kalburgi");
		StudentDto dto3 = new StudentDto("Gowri", 103, 24, "bca", "Bagalkote");
		StudentDto dto4 = new StudentDto("Ashwini", 104, 25, "bsc", "Bengalore");
		
		object.save(1, dto1);
		object.save(2, dto2);
		object.save(3, dto3);
		object.save(4, dto4);
		
		System.out.println("================================");
		
		StudentDto found =object.find(1);
		System.out.println(found);
		
		
		
		System.out.println("==================================");
		
		boolean result = object.remove(4);
		System.out.println(result);
		
System.out.println("==================================");
		
		HashMap<Integer, StudentDto> reading = object.read();
		
		Set<Integer> ref = reading.keySet();
		for(Integer integ : ref) {
			System.out.println(reading.get(integ));
		}
		
		System.out.println("=================================");
		
		
	}
}
