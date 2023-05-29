package com.xworkz.engine;

import com.xworkz.engine.custom.ArrayOutOfBoundException;
import com.xworkz.engine.custom.DtoIsNullException;
import com.xworkz.engine.custom.PriceIsNotValidException;
import com.xworkz.engine.custom.NullPointerException;
import com.xworkz.engine.custom.TypeIsNullException;
import com.xworkz.engine.dao.EngineDao;
import com.xworkz.engine.dao.EngineDaoImpl;
import com.xworkz.engine.dto.EngineDto;

public class EngineRunner {

	public static void main(String[] args) {

		EngineDto obj = new EngineDto("Articulated", "11.9liters", 6, 10000, "Fuel Injection", 5400);
		EngineDto obj1 = new EngineDto("4 Stroke In Line", "14.10liters", 5, 20000, "Direct Injection", 6000);
		EngineDao object = new EngineDaoImpl();

		try {
			object.save(obj);
			object.save(obj1);
			object.update("Articulated", 21000);
			object.update("Injection", 40000);
			object.delete(null);

		} catch (ArrayOutOfBoundException e) {
			e.printStackTrace();
		} catch (DtoIsNullException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (PriceIsNotValidException e) {
			e.printStackTrace();
		} catch (TypeIsNullException e) {
			e.printStackTrace();
		}

		EngineDto[] reading = object.read();
		for (int i = 0; i < reading.length; i++) {
			if (reading[i] != null) {
				System.out.println(reading[i]);

			}

		}

	}
}
