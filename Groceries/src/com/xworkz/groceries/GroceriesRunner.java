package com.xworkz.groceries;

import com.xworkz.groceries.dao.GroceriesDao;
import com.xworkz.groceries.dto.GroceriesDto;

public class GroceriesRunner {

	public static void main(String[] args) {
		GroceriesDto obj = new GroceriesDto();
		GroceriesDao obj2 = new GroceriesDao();
		obj.setgroceryShopName("Quick Fare Foods");
		obj.setaddress("Bangalore");
		obj.setTotalWorkers(30);
		obj.setTotalGroceryItem(100);
		obj.setOnlineDeliveryAvailable(true);
		obj.setCustomerServiceNo(984583521);

		System.out.println(obj.getGroceryShopName());
		System.out.println(obj.getAddress());
		System.out.println(obj.getTotalWorkers());
		System.out.println(obj.getTotalGroceryItem());
		System.out.println(obj.isOnlineDeliveryAvailable());
		System.out.println(obj.getCustomerServiceNo());

		// Calling addGrocery method
		obj2.addGrocery("Green Matar");
		obj2.addGrocery("Gr");
		obj2.addGrocery("Chilli Powder");
		obj2.addGrocery(null);
		obj2.addGrocery("Chana Dal");

//Calling updatedbyIndexMethod
		obj2.updateGroceryByIndex("CHILLI POWER", 2);
		obj2.updateByGroceryName("Green Matar", "Maida");

		// Calling deleteBy Index Method
		obj2.deleteByIndex(1);

//Calling DeletedByName Method
		obj2.DeleteByName("Chilli Powder");

		obj2.read();
	}
}
