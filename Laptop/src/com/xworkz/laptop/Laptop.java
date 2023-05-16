package com.xworkz.laptop;

public abstract class Laptop {
	// Abstract Method
	public abstract void playGame();

	public abstract void easyToCarry();

	public abstract void easyToPerformTask();

	public abstract void VedioCall();

	public abstract void giveSecurity();

	// Concrete Method
	public void helpsToInternetBanking() {
		System.out.println("Method From Laptop");

	}

	public void helpsTakeOnlineEducation() {

		System.out.println("Method From Laptop");
	}

}
