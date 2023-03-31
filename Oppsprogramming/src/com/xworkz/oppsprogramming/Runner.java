package com.xworkz.oppsprogramming;

public class Runner {
	
	
	
	public static void main(String[]args) {		
		
		Car obj1 = new Car("BMW",477476744,"KA4567","Red",560.6F);
		System.out.println(obj1.name);
		System.out.println(obj1.price);
		System.out.println(obj1.carNo);
		System.out.println(obj1.colour);
		System.out.println(obj1.weight);
		obj1.giveComfort();
		obj1.affordableToPurchase();
		obj1.attractive();
		
		MarutiSuzuki obj2 = new MarutiSuzuki(21,10);
		System.out.println(obj2.availableModel);
		System.out.println(obj2. hatchbacks);
		obj2.goodFuelEfficient();
		obj2.havingMachineAlloyWheels();
		
		
		
		Mahindra obj3 = new Mahindra(2, 5);
		System.out.println(obj3.airbags);
		System.out.println(obj3.gncapRating);
		obj3. haveAnchorPointsForChildSeat();
		obj3.speedSensingDoorLock();
		
		 Skoda obj4 = new  Skoda(5, 14.3F);
		System.out.println(obj4.seats);
		System.out.println(obj4. mileage);
		obj4.automatictransmission();
		obj4. digitalClock();

		
	}

}
