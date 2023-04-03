package com.xworkz.aggregation;

public class Treatment {
	
	String treatmentname;
	int noOfAvailableTratments;
	float emergencyDepartment;
	int nonMedicalEquipment;
	int QualityIndicators;
	
	
	public Treatment(String treatmentname,int noOfAvailableTratments,float emergencyDepartment,	int nonMedicalEquipment,int QualityIndicators) {
		this.treatmentname=treatmentname;
		this.noOfAvailableTratments=noOfAvailableTratments;
		this.emergencyDepartment=emergencyDepartment;
		this.nonMedicalEquipment=nonMedicalEquipment;
		this.QualityIndicators=QualityIndicators;
		}
} 