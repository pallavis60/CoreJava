package com.xworkz.comparable.dto;

public class BusDto implements Comparable<BusDto> {

	private String name;
	private int no;
	private int noOfSeats;
	private String timing;

	public BusDto(String name, int no, int noOfSeats, String timing) {
		super();
		this.name = name;
		this.no = no;
		this.noOfSeats = noOfSeats;
		this.timing = timing;

	}

	@Override
	public String toString() {
		return "BusDto [name=" + name + ", no=" + no + ", noOfSeats=" + noOfSeats + ", timing=" + timing + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	@Override
	public int compareTo(BusDto o) {
		if (no > o.getNo()) {
			return 1;
		} else {
			return -1;
		}
	}

}
