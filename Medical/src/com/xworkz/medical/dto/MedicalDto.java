package com.xworkz.medical.dto;

public class MedicalDto {

	private String name;
	private String location;
	private String timing;
	private int profitPerMonth;
	private int totalMedicines;

	public MedicalDto() {

	}

	public MedicalDto(String name, String location, String timing, int profitPerMonth, int totalMedicines) {
		super();
		this.name = name;
		this.location = location;
		this.timing = timing;
		this.profitPerMonth = profitPerMonth;
		this.totalMedicines = totalMedicines;
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

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public int getProfitPerMonth() {
		return profitPerMonth;
	}

	public void setProfitPerMonth(int profitPerMonth) {
		this.profitPerMonth = profitPerMonth;
	}

	public int getTotalMedicines() {
		return totalMedicines;
	}

	public void setTotalMedicines(int totalMedicines) {
		this.totalMedicines = totalMedicines;
	}

	@Override
	public String toString() {
		return "MedicalDto [name=" + name + ", location=" + location + ", timing=" + timing + ", profitPerMonth="
				+ profitPerMonth + ", totalMedicines=" + totalMedicines + "]";
	}

}
