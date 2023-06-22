package com.xworkz.avatar.service;

import com.xworkz.avatar.dto.AvatarDto;
import com.xworkz.avatar.repository.AvatarRepository;
import com.xworkz.avatar.repository.AvatarRepositoryImpl;

public class AvatarServiceImpl implements AvatarService {
	
	AvatarRepository repo = new AvatarRepositoryImpl();

	@Override
	public boolean validateAndSave(AvatarDto dto) {
		
	System.out.println("dto is validate");
	boolean save =	repo.save(dto);
	System.out.println(save);
		return false;
	}

	@Override
	public boolean update(AvatarDto dto,int id) {
		if(dto!=null) {
		boolean update =repo.update(dto,id);
		System.out.println(update);
		}
		return false;
	}

}
