package com.xworkz.eventorganization.service;

import com.xworkz.eventorganization.dto.EventOrg;

public interface EventOrgService {
	
	boolean validateAndSave(EventOrg dto);
	
	boolean update(String time , int id);
	
	boolean updatingName(String name);
	
	boolean updatingDto(EventOrg dto,int id);
	
	boolean updatingEmailId(String emailId);
	
	boolean updateByName(String location, String date, String time, long phoneNo,String duration);
}
