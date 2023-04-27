package com.xworkz.groceries.dao;

public class GroceriesDao {

	String[] GroceriesName = new String[5];

	public String addGrocery(String grocery) {
		if (grocery != null && grocery.length() >= 3) {

			System.out.println("Given Grocery Name Is Valid");

			for (int i = 0; i < GroceriesName.length; i++) {
				if (GroceriesName[i] == null) {
					GroceriesName[i] = grocery;
					System.out.println("Grocery name is added =  " + GroceriesName[i]);
					return grocery;
				}
			}
			{
				System.out.println("Grocery name  " + grocery + "  is not added");
			}

		}
		{
			System.out.println("Grocery name  " + grocery + "  is not valid");
			return grocery;
		}
	}

	public String[] read() {
		return GroceriesName;
	}

	public boolean updateGroceryByIndex(String groceryName, int index) {
		if (groceryName != null) {
			if (groceryName.length() >= 3) {

				GroceriesName[index] = groceryName;
				System.out.println("The given Grocery name " + groceryName + " is updated");
				return true;

			}

			{
				System.out.println("given grocery name is not valid in length");
			}
		}
		{
			System.out.println("Given Grocery Name is null");
		}
		return false;
	}

	public String updateByGroceryName(String presentGrocery, String updatingGrocery) {
		if (presentGrocery != null) {
			if (updatingGrocery != null) {
				if (updatingGrocery.length() >= 3) {
					System.out.println("The Given Grocery Name  " + updatingGrocery + "  Is Valid");
					for (int i = 0; i < GroceriesName.length; i++) {
						if (GroceriesName[i] != null) {

							if (GroceriesName[i].equals(presentGrocery)) {
								System.out.println("Given Previous Name " + presentGrocery + " is valid");
								GroceriesName[i] = updatingGrocery;
								System.out.println("The GroceryName " + updatingGrocery + "  is updated");
								return updatingGrocery;

							}
						}
						{
							System.out.println("Previous Name is not Found");
						}

					}

					{
						System.out.println("The ArrayIndex is null");
					}

					{
						System.out.println("Given updating grocery length is not valid");
					}

				}
				{
					System.out.println("updating name is null");
				}

			}
			{
				System.out.println("Previous name is null");
			}

		}
		return updatingGrocery;
	}

	public boolean deleteByIndex(int index) {
		if (index >= 0) {
			if (index < GroceriesName.length) {
				GroceriesName[index] = null;
				System.out.println("Deleted Successfully");
				return true;
			}
			{
				System.out.println("Index Length is not valid");

			}
		}
		{
			System.out.println("Negetive Index Is given");
		}
		return false;
	}

	public boolean DeleteByName(String dltName) {
		if (dltName != null) {
			for (int i = 0; i < GroceriesName.length; i++) {
				if (dltName.equals(GroceriesName[i])) {
					GroceriesName[i] = null;
					System.out.println("Deleted successfully");
					return true;
				}
			}
			{
				System.out.println("The length of the name is not valid");

			}
		}
		{
			System.out.println("The dltName Is null");
			return false;
		}
	}

	public boolean search(String GroceryName) {
		if (GroceryName != null) {
			if (GroceryName.length() > 3) {
				for (int i = 0; i < GroceriesName.length; i++) {
					if (GroceriesName[i] != null) {
						if (GroceriesName[i].equals(GroceryName)) {
							System.out.println("Name is found");
							return true;
						}

						{
							System.out.println("Given name " + GroceryName + "  is not found");
							return false;
						}
					}
				}
				{

					return false;
				}

			}
			{
				System.out.println("givenGroceryName " + GroceryName + "length is not valid");
				return false;
			}

		}
		{
			System.out.println("givenGrocery Name " + GroceryName + "is null");
			return false;
		}
	}
}
