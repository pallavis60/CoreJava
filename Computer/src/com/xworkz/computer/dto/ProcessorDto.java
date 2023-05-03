package com.xworkz.computer.dto;

public class ProcessorDto {
	private String brand;
	private String generation;
	private String model;
	
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getGeneration() {
		return generation;
	}


	public void setGeneration(String generation) {
		this.generation = generation;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public String toString() {
		return "ProcessorDto [brand=" + brand + ", generation=" + generation + ", model=" + model + "]";
	}


	public ProcessorDto(String brand, String generation, String model) {
		super();
		this.brand = brand;
		this.generation = generation;
		this.model = model;
	}
	
	

}
