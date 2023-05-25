package com.xworkz.mobile;

public class MobileRunner {

	public static void main(String[] args) {

		Samsung mbl = new Samsung();
		mbl.call();
		mbl.alram();
		mbl.clock();
		mbl.game();
		mbl.message();

		Vivo mbl1 = new Vivo();
		mbl1.calculator();
		mbl1.camera();
		mbl1.fringerPrint();
		mbl1.frontcamera();
		mbl1.storage();

		Redmi mbl2 = new Redmi();
		mbl2.call();
		mbl2.alram();
		mbl2.clock();
		mbl2.game();
		mbl2.message();
		mbl2.calculator();
		mbl2.camera();
		mbl2.fringerPrint();
		mbl2.frontcamera();
		mbl2.storage();

	}

}
