package com.xworkz.vegetables.dto;

import com.xworkz.vegetables.constant.Categories;

public class VegetablesDto {

	private String name;
	private int price;
	private String colour;
	private Categories category;
	private ClassificationDto classification;

	public VegetablesDto() {
		System.out.println("No_arg constructor");
	}

	public VegetablesDto(String name, int price, String colour, Categories category, ClassificationDto classification) {
		super();
		this.name = name;
		this.price = price;
		this.colour = colour;
		this.category = category;
		this.classification = classification;
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

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}

	public ClassificationDto getClassification() {
		return classification;
	}

	public void setClassificationDto(ClassificationDto classification) {
		this.classification = classification;
	}

	public String toString() {
		return "VegetablesDto [name=" + name + ", price=" + price + ", colour=" + colour + ", category=" + category
				+ ", classification=" + classification + "]";
	}

}
