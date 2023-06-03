package com.xworkz.leetcode;

import java.util.ArrayList;

public class MyHashSet {
	
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		public boolean add(int value) {
	//	if(list.contains(value)) {
				list.add(value);
				System.out.println("Value is added");
				return true;
		//	}
		//	System.out.println("Value is not added");
		//return false;	
	}
		
		public boolean remove(int value) {
			if(list.contains(value)) {
				list.remove(list.indexOf(value));
				System.out.println("Value is already exist removed");
				return true;
					
				
			}
			System.out.println("Value is not exist,dose't removed the value");
			return true;
			
		}
		
		public boolean conatins(int value) {
			return list.contains(value);
		}
		
		public static void main(String[] args) {
			MyHashSet obj = new MyHashSet();
			obj.add(1);
			obj.add(2);
		boolean res =	obj.conatins(2);
		System.out.println(res);
		obj.remove(1);
		

			
		}
		
}
