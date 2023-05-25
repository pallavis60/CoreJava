package com.xworkz.medical;

import com.xworkz.medical.custom.NameIsNullException;
import com.xworkz.medical.custom.arrayIsNullException;
import com.xworkz.medical.custom.dtoIsNullException;
import com.xworkz.medical.custom.locationIsNotValidException;
import com.xworkz.medical.custom.nameIsNotValidException;
import com.xworkz.medical.dao.MedicalDao;
import com.xworkz.medical.dto.MedicalDto;

public class MedicalRunner {

	public static void main(String[] args) {

		MedicalDao obj = new MedicalDao();

		MedicalDto dto = new MedicalDto("SR Medical", "Bangalore", "8Am to 10 Pm", 50000, 15000);
		MedicalDto dto2 = new MedicalDto("NirmalaMedical", "Bangalore", "9Am to 11Pm", 6000, 3000);
		MedicalDto dto3 = new MedicalDto("SRJ Medical", "Bhadravati", "10 am to 4 pm", 7000, 1000);

		try {
			obj.save(dto);

			obj.save(dto2);

			obj.save(dto3);

			obj.save(null);
		} catch (dtoIsNullException e) {
			e.printStackTrace();
		}

		try {
			obj.update("NirmalaMedical", null);
		} catch (locationIsNotValidException e) {
			e.printStackTrace();
		} catch (NameIsNullException e) {
			e.printStackTrace();
		}

		try {
			obj.delete("SR Medical");
			obj.delete(null);
		} catch (nameIsNotValidException e) {
			e.printStackTrace();
		}

		try {
			MedicalDto[] reading = obj.read();
			for (int i = 0; i < reading.length; i++) {
				System.out.println(reading[i]);
			}
		} catch (arrayIsNullException e) {
			e.printStackTrace();
		}

	}
}
