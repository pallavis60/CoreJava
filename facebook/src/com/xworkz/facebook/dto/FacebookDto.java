package com.xworkz.facebook.dto;

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

public class FacebookDto {
	
	private int id;
	
	@NotBlank
	@NotEmpty
	@Size(min=3,max=50)
	private String firstName;
	
	@NotBlank
	@NotEmpty
	private String lastName;
	private Date DOB;
	@NotBlank
	@NotEmpty
	@Email
	private String email;
	private Long phoneNo;
	@NotBlank
	@NotEmpty
	private String gender;
	@NotBlank
	@NotEmpty
	@Size(min=8,max=16)
	private String password;

}
