package com.xworkz.computer.dto;

public class ComputerDto {
	private String brand;
	private String model;
	private String colour;
	private int price;
	private Type type;
	private ProcessorDto processor;
	
	
	public ComputerDto(String brand, String model, String colour, int price, Type type, ProcessorDto processor) {
		super();
		this.brand = brand;
		this.model = model;
		this.colour = colour;
		this.price = price;
		this.type = type;
		this.processor = processor;
	}


	@Override
	public String toString() {
		return "ComputerDto [brand=" + brand + ", model=" + model + ", colour=" + colour + ", price=" + price
				+ ", type=" + type + ", processor=" + processor + "]";
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public ProcessorDto getProcessor() {
		return processor;
	}


	public void setProcessor(ProcessorDto processor) {
		this.processor = processor;
	}
	
	
	

}
