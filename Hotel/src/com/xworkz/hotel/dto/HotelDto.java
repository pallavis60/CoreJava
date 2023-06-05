package com.xworkz.hotel.dto;

public class HotelDto {

	private String name;
	private String location;
	private int noOfRooms;
	private String color;
	private int rate;

	public HotelDto(String name, String location, int noOfRooms, String color, int rate) {
		super();
		this.name = name;
		this.location = location;
		this.noOfRooms = noOfRooms;
		this.color = color;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "HotelDto [name=" + name + ", location=" + location + ", noOfRooms=" + noOfRooms + ", color=" + color
				+ ", rate=" + rate + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

}
