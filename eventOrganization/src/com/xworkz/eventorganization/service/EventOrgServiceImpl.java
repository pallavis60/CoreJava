package com.xworkz.eventorganization.service;

import com.xworkz.eventorganization.dto.EventOrg;
import com.xworkz.eventorganization.repository.EventOrgRepository;
import com.xworkz.eventorganization.repository.EventOrgRepositoryImpl;

public class EventOrgServiceImpl implements EventOrgService {
	EventOrgRepository repo = new EventOrgRepositoryImpl();

	@Override
	public boolean validateAndSave(EventOrg dto) {
		if (dto != null) {
			if (dto.getId() > 0) {
				if (dto.getEvent_name() != null && dto.getEvent_name().length() > 0) {
					if (dto.getDate() != null && dto.getTime() != null) {
						if (dto.getEmailId() != null && dto.getPhoneNo() > 0) {
							if (dto.getLocation() != null && dto.getLocation().length() > 3) {
								System.out.println("data is validated");
								boolean save = repo.save(dto);
								System.out.println(save);
								return true;

							}

							System.out.println("location is not valid");
							return false;

						}
						System.out.println("Email or Phone Number is not valid");
						return false;
					}
					System.out.println("Date or time is null");
					return false;

				}
				System.out.println("Event is not valid");
				return false;
			}
			System.out.println("id is 0");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public boolean update(String time, int id) {
		if (time != null) {
			if (id > 0) {
				System.out.println("Data is validated");
				boolean update = repo.update(time, id);
				System.out.println(update);
				return true;
			}
			System.out.println("id is 0");
			return false;
		}
		System.out.println("Time is null");
		return false;
	}

	@Override
	public boolean updatingName(String name) {

		if (name != null && name.length() > 3) {
			System.out.println("Name is validated");
			boolean update = repo.updatingName(name);
			System.out.println(update);
			return true;

		}
		System.out.println("Name is not valid");

		return false;
	}

	@Override
	public boolean updatingDto(EventOrg dto, int id) {
		if (dto != null) {
			if (id > 0) {
				System.out.println("Data is validated");
				boolean update = repo.updatingDto(dto, id);
				System.out.println(update);
				return true;
			}
			System.out.println("id is 0");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public boolean updatingEmailId(String emailId) {
		if(emailId!=null && emailId.length()>8) {
			System.out.println("email is validated");
			boolean update =repo.updatingEmailId(emailId);
			System.out.println(update);
			return true;
		}
		System.out.println("email is not validated");
		return false;
	}

	@Override
	public boolean updateByName(String location, String date, String time, long phoneNo, String duration) {
		if(location!=null && location.length()>3) {
			if(date!=null) {
				if(time!=null) {
					if(phoneNo>0) {
						System.out.println("Data is validated");
						boolean update = repo.updateByName(location,date,time,phoneNo,duration);
						System.out.println(update);
						return true;
					}
					
					System.out.println("Phone no is not valid");
					return false;
				}
				System.out.println("time is null");
				return false;
			}
			System.out.println("date is null");
			return false;
		}
		System.out.println("Location is not valid");
		return false;
	}

}
