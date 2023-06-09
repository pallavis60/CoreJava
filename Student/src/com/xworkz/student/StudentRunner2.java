package com.xworkz.student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import com.xworkz.student.dto.StudentDto;

public class StudentRunner2 {

	public static void main(String[] args) {
		
		
		List<StudentDto> dtos = new ArrayList<StudentDto>();
		 Comparator<StudentDto> obj = new Comparator<StudentDto>() {

			@Override
			public int compare(StudentDto o1, StudentDto o2) {
				if(o1.getName().length()>o2.getName().length()) {
					return 1;
				}
				return -1;
			}
		};
		
		
		StudentDto dto1 = new StudentDto("Nikitha", 101, 22, "bsc", "Shivamogga");
		StudentDto dto2 = new StudentDto("Sheela", 102, 23, "MBBS", "Kalburgi");
		StudentDto dto3 = new StudentDto("Gowri", 103, 24, "bca", "Bagalkote");
		StudentDto dto4 = new StudentDto("Ashwini", 104, 25, "bsc", "Bengalore");
		
		dtos.add(dto1);
		dtos.add(dto2);
		
		dtos.add(dto3);
		
		dtos.add(dto4);
		
	Collections.sort(dtos);
	
	
	
	for (StudentDto dt : dtos) {
		System.out.println(dt);
	}
	
	System.out.println("---------------------------");
	
	Collections.sort(dtos, obj);
	for(StudentDto dt1 : dtos) {
		System.out.println(dt1);
	}
	
	
	
	

		
		
	}

}
