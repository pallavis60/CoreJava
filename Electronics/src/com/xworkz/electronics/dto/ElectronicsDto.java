package com.xworkz.electronics.dto;

public class ElectronicsDto {
	private String name;
	private int price;
	private int date;
	private float rating;
	private int warranty;
	private boolean isEmiAvailable;

	public ElectronicsDto(String name, int price, int date, float rating, int warranty, boolean isEmiAvailable) {
		super();
		this.name = name;
		this.price = price;
		this.date = date;
		this.rating = rating;
		this.warranty = warranty;
		this.isEmiAvailable = isEmiAvailable;
	}

	@Override
	public String toString() {
		return "ElectronicsDto [name=" + name + ", price=" + price + ", date=" + date + ", rating=" + rating
				+ ", warranty=" + warranty + ", isEmiAvailable=" + isEmiAvailable + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public boolean isEmiAvailable() {
		return isEmiAvailable;
	}

	public void setEmiAvailable(boolean isEmiAvailable) {
		this.isEmiAvailable = isEmiAvailable;
	}

}
