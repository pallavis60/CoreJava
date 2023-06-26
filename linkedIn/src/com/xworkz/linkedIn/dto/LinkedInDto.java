package com.xworkz.linkedIn.dto;

import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class LinkedInDto {
	
	private int id;
	@NotBlank
	@NotEmpty
	@Size(min=3,max=15)
	private String name;
	@NotBlank
	@NotEmpty
	@Size(min=2,max=10)
	private String qualification;
	private int age;
	@NotBlank
	@NotEmpty
	private String dateOfBirth;
	private int passOutYear;
	@NotBlank
	@NotEmpty
	private String percent;
	@NotBlank
	@NotEmpty
	private String skills;
	private String experiance;
	@NotBlank
	@NotEmpty
	private String univercity;
	private long phoneNo;
	@NotBlank
	@NotEmpty
	@Email(message="Email is not valid")
	private String email;
	@NotBlank
	@NotEmpty
	@Size(min=8,max=15)
	private String password;
	@NotBlank
	@NotEmpty
	private String extraCourse;
	private Date date;

}
