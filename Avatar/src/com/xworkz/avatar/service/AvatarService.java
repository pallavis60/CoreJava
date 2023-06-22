package com.xworkz.avatar.service;

import com.xworkz.avatar.dto.AvatarDto;

public interface AvatarService {
	
	boolean validateAndSave(AvatarDto dto);
	
	boolean update(AvatarDto dto,int id);

}
