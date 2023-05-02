package com.xworkz.resume.dto;

public class ResumeDto {
	private String name;
	private String email;
	private long phoneNo;
	private String dob;
	private String fatherName;
	private String degree;
	private AddressDto address;

	public ResumeDto(String name, String email, String degree, long phoneNo, String dob, String fatherName,
			AddressDto address) {
		super();
		this.name = name;
		this.email = email;
		this.degree = degree;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.fatherName = fatherName;
		this.address = address;

	}

	public String toString() {
		return "ResumeDto [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", dob=" + dob
				+ ", fatherName=" + fatherName + ", degree=" + degree + ", address=" + address + "]";
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}

}
