package com.xworkz.avatar.repository;

import com.xworkz.avatar.dto.AvatarDto;

public interface AvatarRepository {
	
	boolean save(AvatarDto dto);

	boolean update(AvatarDto dto,int id);

}
