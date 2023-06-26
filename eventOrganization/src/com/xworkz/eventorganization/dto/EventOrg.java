package com.xworkz.eventorganization.dto;

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

public class EventOrg {
	
	private int id;
	private String event_name;
	private String organizedBy;
	private String conductedBy;
	private String location;
	private String date;
	private String time;
	private String spl_guest;
	private int expectedPeople;
	private int total_people;
	private int event_price;
	private String emailId;
	private long phoneNo;
	private int total_event;
	private String duration;
	
	

}
