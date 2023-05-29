package com.xworkz.car.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class CarDto {

	private String name;
	private Integer price;
	private String model;
	private String colour;
	private Integer seats;

}
