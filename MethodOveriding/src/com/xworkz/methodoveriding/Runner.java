package com.xworkz.methodoveriding;

public class Runner {
	public static void main(String[] args) {
		//Calling Vehicle Class Method
		Vehicle obj = new Vehicle();
		obj.ride(40, 30);
		obj.travel("Car", 8923);
		obj.consume(80,30);
		
		//Calling Car Class Methods
		Car obj2 = new Car();
		obj2.ride(50,30);
		obj2.travel("BMW",9873);
		obj2.consume(90, 23);
		
		//Calling BusClass Methods
		Bus obj3 = new Bus();
		obj3.ride(50, 300);
		obj3.travel("KSRTC", 365);
		obj3.consume(80,60);
		
		//Calling BikeClass Methods
		Bike obj4 = new Bike();
		obj4.ride(98, 45);
		obj4.travel("TVS",9832);
		obj4.consume(89,34);
		
		//Calling TaxiClass Methods
		Taxi obj5 = new Taxi();
		obj5.ride(78, 90);
		obj5.travel("Mahindra", 8073);
		obj5.consume(90, 330);
		
		
		// Calling AutoCalss Methods
		Auto obj6 = new Auto();
		obj6.ride(90, 40);
		obj6.travel("Auto", 9330);
		obj6.consume(90, 330);
	}

}
