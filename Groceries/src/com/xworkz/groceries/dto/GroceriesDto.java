package com.xworkz.groceries.dto;

public class GroceriesDto {

	private String groceryShopName;
	private String address;
	private int totalWorkers;
	private int totalGroceryItem;
	private boolean isOnlineDeliveryAvailable;
	private long customerServiceNo;

	public String getGroceryShopName() {
		return groceryShopName;
	}

	public void setgroceryShopName(String groceryShopName) {
		this.groceryShopName = groceryShopName;
	}

	public String getAddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public int getTotalWorkers() {
		return totalWorkers;
	}

	public void setTotalWorkers(int totalWorkers) {
		this.totalWorkers = totalWorkers;
	}

	public int getTotalGroceryItem() {
		return totalGroceryItem;
	}

	public void setTotalGroceryItem(int totalGroceryItem) {
		this.totalGroceryItem = totalGroceryItem;
	}

	public boolean isOnlineDeliveryAvailable() {
		return isOnlineDeliveryAvailable;
	}

	public void setOnlineDeliveryAvailable(boolean isOnlineDeliveryAvailable) {
		this.isOnlineDeliveryAvailable = isOnlineDeliveryAvailable;
	}

	public long getCustomerServiceNo() {
		return customerServiceNo;
	}

	public void setCustomerServiceNo(long customerServiceNo) {
		this.customerServiceNo = customerServiceNo;
	}

}
