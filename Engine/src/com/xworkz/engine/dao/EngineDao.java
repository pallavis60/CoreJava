package com.xworkz.engine.dao;

import com.xworkz.engine.custom.ArrayOutOfBoundException;
import com.xworkz.engine.custom.DtoIsNullException;
import com.xworkz.engine.custom.PriceIsNotValidException;
import com.xworkz.engine.custom.NullPointerException;
import com.xworkz.engine.custom.TypeIsNullException;
import com.xworkz.engine.dto.EngineDto;

public interface EngineDao {

	public boolean save(EngineDto dto) throws ArrayOutOfBoundException, DtoIsNullException;

	public EngineDto[] read();

	public boolean update(String type, int price)
			throws NullPointerException, PriceIsNotValidException, TypeIsNullException;

	public boolean delete(String type) throws NullPointerException, TypeIsNullException;

}
