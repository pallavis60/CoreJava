package com.xworkz.eventorganization.repository;

import com.xworkz.eventorganization.dto.EventOrg;

public interface EventOrgRepository {
	
	boolean save(EventOrg dto);

	boolean update(String time, int id);

	boolean updatingName(String name);

	boolean updatingDto(EventOrg dto, int id);

	boolean updatingEmailId(String emailId);

	boolean updateByName(String location, String date, String time, long phoneNo, String duration);

}	
