package com.xworkz.hashmap;

import java.util.HashMap;
import java.util.Set;

public class College {

	public static void main(String[] args) {
		
	HashMap<Integer, String> obj = new HashMap<Integer, String>();
	
	obj.put(1, "Kgfgc");
	obj.put(2, "Reva");
	obj.put(3, "LB College");
	obj.put(4, "Sayyadri College");
	obj.put(5,"Thunga College");
	
	Set<Integer> obj1 = obj.keySet();
	
	for(Integer obj3 : obj1) {
		System.out.println(obj.get(obj3));
	}
		
	}

}
