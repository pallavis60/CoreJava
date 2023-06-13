package com.xworkz.studenthashmap;

import java.util.HashMap;
import java.util.Set;


public class Student {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Nikitha");
		map.put(2, "Sheela");
		map.put(3, "Gowri");
		map.put(4, "Ashwini");
		map.put(5, "Amulya");
		map.put(6, "Amritha");
		map.put(7,"Anaga");
		map.put(8, "Adithi");
		map.put(9,"Anannya");
		map.put(10, "Mohitha");
		
		
		Set<Integer> set = map.keySet();
		
		for(Integer values :set) {
			System.out.println(map.get(values));
		}
		
	}

}
