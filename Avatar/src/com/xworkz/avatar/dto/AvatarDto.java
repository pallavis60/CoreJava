package com.xworkz.avatar.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AvatarDto {

	private int id;
	private String avatar_actors;
	private int age;
	private String dateOfBirth;
	private String nationality;
	private boolean marriageStatus;
	private int totalMovies;
	private String firstMovie;
	private String lastMovie;
	private String charecterName;

}
