package com.xworkz.car.dao;

import com.xworkz.car.custom.ArrayOutOfBoundException;
import com.xworkz.car.custom.DtoIsNullException;
import com.xworkz.car.custom.ModelIsNullException;
import com.xworkz.car.custom.NameIsNullException;
import com.xworkz.car.custom.PriceIsNotValidException;
import com.xworkz.car.dto.CarDto;

public interface CarDao {

	public boolean save(CarDto dto) throws DtoIsNullException, ArrayOutOfBoundException;

	public CarDto[] read();

	public CarDto find(String name) throws NameIsNullException, NullPointerException;

	public boolean update(String name, Integer price)
			throws NameIsNullException, NullPointerException, PriceIsNotValidException;

	public boolean delete(String name) throws NameIsNullException, NullPointerException;

	public boolean updateByTwoFields(String name, String model, String colour)
			throws NameIsNullException, ModelIsNullException;

	public CarDto findByTwoFields(String name, String model)
			throws NameIsNullException, ModelIsNullException, NullPointerException;

}
