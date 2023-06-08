package com.xworkz.comparator;

import java.util.ArrayList;

import java.util.Comparator;

public class City {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Bangalore");
		list.add("Hubballi");
		list.add("Mysore");
		list.add("Kalaburgi");
		list.add("Mangalore");
		list.add("Belgum");
		list.add("Ballary");
		list.add("Bidar");
		list.add("Udupi");
		list.add("Hasana");
		list.add("Kolar");
		list.add("Mandya");
		list.add("Gadag");
		list.add("Gangavati");
		list.add("Bagalkot");
		list.add("Hospet");
		list.add("Raichr");
		list.add("Tumkur");
		list.add("Mangalore");
		list.add("Shivamogga");
		list.add("Davangere");
		list.add("Haveri");

		Comparator<String> obj = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() > o2.length()) {
					return 1;
				}
				return -1;
			}

		};

		Comparator<String> obj2 = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.charAt(0) > o2.charAt(0)) {
					return 1;
				}
				return -1;
			}

		};

		// list.sort(obj);
		list.sort(obj2);
		for (String ref : list) {
			System.out.println(ref);
		}
	}

}