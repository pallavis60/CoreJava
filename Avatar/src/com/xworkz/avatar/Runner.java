package com.xworkz.avatar;

import com.xworkz.avatar.dto.AvatarDto;
import com.xworkz.avatar.service.AvatarService;
import com.xworkz.avatar.service.AvatarServiceImpl;

public class Runner {

	public static void main(String[] args) {
		
		AvatarDto dto = new  AvatarDto();
		dto.setId(1);
		dto.setAvatar_actors("Sheela");
		dto.setAge(23);
		dto.setDateOfBirth("6-6-2001");
		dto.setNationality("India");
		dto.setMarriageStatus(false);
		dto.setTotalMovies(10);
		dto.setFirstMovie("Avtar");
		dto.setLastMovie("Avtar3");
		dto.setCharecterName("Dr.Karina");
		
		AvatarService service = new  AvatarServiceImpl();
		//service.validateAndSave(dto);
		
		service.update(dto, 1 );
		
		

		
	}

}
