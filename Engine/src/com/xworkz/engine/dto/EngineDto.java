package com.xworkz.engine.dto;

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

public class EngineDto {

	private String type;
	private String capacity;
	private int noOfCylinders;
	private int price;
	private String fuelSystem;
	private int speed;

}
