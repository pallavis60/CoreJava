package com.xworkz.computer;

import com.xworkz.computer.dao.ComputerDao;
import com.xworkz.computer.dto.ComputerDto;
import com.xworkz.computer.dto.ProcessorDto;
import com.xworkz.computer.dto.Type;

public class ComputerRunner {

	public static void main(String[] args) {
		ComputerDao obj = new ComputerDao();
		
		ProcessorDto obj2 = new ProcessorDto("Dell","1stGeneration","19A5");
		ComputerDto obj3 = new ComputerDto("Hp", "A5", "Black", 40000, Type. AnalogComputers, obj2);
		
		
		
		ProcessorDto tryy = new ProcessorDto("Apple","3gen","vivobook16");
				
		ComputerDto trying = new ComputerDto("Asus","15X","White",60000,Type.DigitalComputers,tryy);
		
		
		
		ProcessorDto obj5 = new ProcessorDto("Lenovo","2ndGeneration","XPS13");		
		
		//Save method
		obj.save(obj3);
		obj.save(trying);
		System.out.println("----------------------------------------------------------------------------------------------");
		
		//FindByBrnad method;
		ComputerDto find=obj.findByBrand("Hp");
		System.out.println(find);
		obj.findByBrand("DELL");
		obj.findByBrand(null);
		System.out.println("------------------------------------------------------------------------------------------------");
		
		//findByModel method;
		
		ComputerDto finding =obj.findByModel("A5");
		System.out.println(finding);
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		//updateModelByBrand mwthod;
		obj.updateModelByBrand("Hp","Window10");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		
		//deleteByColour method;
		obj.deleteByColour(null);
		System.out.println("----------------------------------------------------------------");
		
		
		boolean rea =obj.updateProcessorByBrand("Hp",obj5);
		System.out.println(rea);
		System.out.println("------------------------------------------------------------------------------");
		
		//deleteByBrand method;
		obj.deleteByBrand("Asus");
		System.out.println("--------------------------------------------------------------------------------");
		
		//Read method
		ComputerDto[] read = obj.readAll();
		for(int i=0; i<read.length;i++) {
			if(read[i]!=null) {
			System.out.println(read[i]);
		}
	}

}
}
