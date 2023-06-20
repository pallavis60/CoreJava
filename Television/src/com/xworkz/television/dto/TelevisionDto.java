package com.xworkz.television.dto;

import java.time.LocalDate;


public class TelevisionDto {
	
	private String brand;
	private int price;
	private String color;
	private float rating;
	private String warranty;
	private LocalDate maifacture;
	
	
	
	

	public TelevisionDto(String brand, int price, String color, float rating, String warranty,LocalDate date) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.rating = rating;
		this.warranty = warranty;
		this.maifacture=date;
		
		
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public LocalDate getMaifacture() {
		return maifacture;
	}

	public void setMaifacture(LocalDate maifacture) {
		this.maifacture = maifacture;
	}

	@Override
	public String toString() {
		return "TelevisionDto [brand=" + brand + ", price=" + price + ", color=" + color + ", rating=" + rating
				+ ", warranty=" + warranty + ",maifacture="+ maifacture +"]";
	}
	
//	private static void createDate() {
//		 Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2023-09-21");
//	 }
//	

}
  