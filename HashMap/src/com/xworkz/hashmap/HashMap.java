package com.xworkz.hashmap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMap {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(1, "Google");
		map.put(2, "GooGleMaps");
		map.put(3, "GoogleDrive");
		map.put(4, "WhatsApp");
		map.put(5, "YouTube");

//Clone() Method
		System.out.println(map.clone());

//putIfAbsent() method

		String obj = map.putIfAbsent(1, "Google");
		System.out.println(obj);

//replace() method		
		map.replace(2, "GooGleMaps", "Map");
		System.out.println(map.get(2));

//containsKey() method
		boolean result = map.containsKey(1);
		System.out.println(result);

//size() method
		System.out.println(map.size());

		TreeMap<Integer, String> map2 = new TreeMap<Integer, String>();

		map2.put(10, "Spotify");
		map2.put(9, "EasyShare");
		map2.put(8, "Email");
		map2.put(7, "GPay");
		map2.put(6, "Hotstar");

//clone() method
		System.out.println(map2.clone());

//descendingKeySet() method
		System.out.println(map2.descendingKeySet());

//descendingMap() method
		System.out.println(map2.descendingMap());

//ceilingKey() method
		System.out.println(map2.ceilingKey(1));

//pollFirstEntry() method	

		System.out.println(map2.pollFirstEntry());

	}

}
