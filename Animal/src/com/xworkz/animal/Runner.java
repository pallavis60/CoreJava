package com.xworkz.animal;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Runner {

	public static void main(String[] args) {
		
		HashSet<String> name = new HashSet<String>();
		
		name.add("Dog");
		name.add("Cat");
		name.add("Cow");
		name.add("Donkey");
		name.add("Horse");
		name.add("Rabbit");
		
		for(String ref:name) {
			System.out.println(ref);
		}
		
		
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		
		names.add("Lion");
		names.add("Tiger");
		names.add("Deer");
		names.add("Elephant");
		names.add("Giraffee");
		
		for(String arry : names) {
			System.out.println(arry);
		}

	}

}
