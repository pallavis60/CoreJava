package com.xworkz.laptop;

public class LaptopRunner {

	public static void main(String[] args) {

		Dell obj = new Dell();
		obj.VedioCall();
		obj.giveSecurity();
		obj.playGame();
		obj.easyToPerformTask();
		obj.helpsTakeOnlineEducation();

		Lenovo obj1 = new Lenovo();
		obj1.VedioCall();
		obj1.giveSecurity();
		obj1.playGame();
		obj1.easyToPerformTask();
		obj1.easyToCarry();

		AppleM2 obj3 = new AppleM2();
		obj3.VedioCall();
		obj3.giveSecurity();
		obj3.playGame();
		obj3.easyToPerformTask();
		obj3.easyToCarry();

		// Calling Concrete Method
		obj.easyToCarry();
		obj.helpsToInternetBanking();

	}

}
