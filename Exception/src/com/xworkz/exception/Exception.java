package com.xworkz.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception {

	public static void main(String[] args) {

		try {

			FileInputStream file = new FileInputStream("C:\\Users\\HP\\Documents\\Custom Office Templates");
			System.out.println("The file is found");
			Class.forName("abcdel");
			System.out.println("Class is Found");

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("FileNotFoundException is catched");

		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("ClassNotFoundException Catched");
		}

		System.out.println("Execution Continue");

	}

}
