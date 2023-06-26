package com.xworkz.eventorganization;

import com.xworkz.eventorganization.dto.EventOrg;
import com.xworkz.eventorganization.service.EventOrgService;
import com.xworkz.eventorganization.service.EventOrgServiceImpl;

public class Runner {

	public static void main(String[] args) {
		
		EventOrg dto = new EventOrg();
		dto.setId(3);
		dto.setEvent_name("Painting for kids");
		dto.setOrganizedBy("Anusha");
		dto.setConductedBy("Sanjana");
		dto.setLocation("Belagavi");
		dto.setDate("12-8-23");
		dto.setTime("4PM");
		dto.setSpl_guest("Ankitha");
		dto.setExpectedPeople(100);
		dto.setTotal_people(90);
		dto.setEvent_price(50000);
		dto.setEmailId("namingOrg@gmail.com");
		dto.setPhoneNo(6758765456L);
		dto.setTotal_event(25);
		dto.setDuration("7 hr");
		
		EventOrgService service = new EventOrgServiceImpl();
//	service.validateAndSave(dto);
//		service.update("10.30AM", 1);
//		service.updatingName("Super Conference");
	//	service.updatingDto(dto, 3);
//		service.updatingEmailId("bhagyashree123@gmail.com");
		service.updateByName("Haveri", "30-12-23", "5PM", 9956745690L, "3hr");
//		
		
		
	}

}
