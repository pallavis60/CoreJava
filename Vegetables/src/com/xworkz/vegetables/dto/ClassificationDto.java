package com.xworkz.vegetables.dto;

public class ClassificationDto {
	private String className;
	private String example;
	private String shape;
	private String soilType;

	public ClassificationDto(String className, String example, String shape, String soilType) {
		super();
		this.className = className;
		this.example = example;
		this.shape = shape;
		this.soilType = soilType;
	}

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getSoilType() {
		return soilType;
	}

	public void setSoilType(String soilType) {
		this.soilType = soilType;
	}

	@Override
	public String toString() {
		return "ClassificationDto [className=" + className + ", example=" + example + ", shape=" + shape + ", soilType="
				+ soilType + "]";
	}

}
