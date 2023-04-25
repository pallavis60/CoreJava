package com.xworkz.shop;

import com.xworkz.shop.dto.ShopDto;

public class ShopRunner {
	public static void main(String[] args) {
		
		ShopDto obj = new ShopDto("Everly", "Nikitha", "Cloths", 98458352," june 23 2008", "8 am to 9 pm", "Bangalore", 45, "Gowri", 20000, 40000, 50000, true, 2 , 3,  60000, 30000, 20000,  10000,  50000, 500, 50, 15000);
	
	  obj.setShopName("Everly");
	  obj.setOwnerName("Nikitha");
      obj.setStoreRelated("Cloths");
	  obj.setShopNo(98458352);
	  obj.setShopinauguration("june 23 2008");
	  obj.setShopingTiming("8 am to 9 pm");
	  obj.setAddress("Bangalore");
	  obj.setShopBuildingNo(45);
	  obj.setManagerName("Gowri");
	  obj.setShopRent(200000);
	  obj.setTotalExpenture(400000);
	  obj.setProfitInAMonth(500000);
	  obj.setHaveBranches(true);
	  obj.setBranches(2);
	  obj.setSections(3);
	  obj.setTotalClothAvailable(60000);
	  obj.setWomamsColths(20000);
	  obj.setMenCloths(30000);
	  obj.setKidCloths(10000);
	  obj.setMostExpensiveCloth(50000);
	  obj.setMostLessExpensiveCloth(500);
	  obj.setnoOfEmployee(50);
	  obj.setEmployeeMinimumSalary(15000);
	  obj.setShopColour("Blue");
	  obj.setFloors(2);
	  obj.setNoOfRooms(6);
	  obj.setTotalCustomerPerDay(30);
	  obj.setSleepWear(500);
	  obj.setTrialRoom(2);
	  obj.setBeautyAndPersonalCare(1);
	  obj.setBusinessModel("BM Fashion");
	  obj.setSportsAndActiveWear(30);
	  obj.setLuggageAndTrolleys(50);
	  obj.setWinterWear(500);
	  obj.setSummerWear(400);
	  obj.setWesternwear(600) ;
	  obj.setBillingRoom(1);
	  obj.setCounters(5);
	  obj.setPaymentMethod("CreditCard and DebitCard");
	  obj.setCustomerFeedback("1 to 5 rating");
	  obj.setPaymentProcessingFee("5%");
	  obj.setProfitMargin("60%");
	  obj.setUpcommingEvents("Ugadi");
	  obj.setPopularProduct("Jeens");
	  obj.setEmployeeTraining("customerServiceSikills");
	  obj.setBrandIdentity("Logo");
	  obj.setMarketingBudget(500000);
	  obj.setLocalization("popularRegion");
	  obj.setpricingStrategy("quality");
	  obj.setEmployeePerformance("iceAdjust");
	  obj.setReturnPolicy("attendence");
	  obj.setSalesAnaliseCheck("only Exchange");
	  obj.setShopByOccation(5000);
	  obj.setSalesProjections("Revenue");
	  obj.setVendurManagment("The No Of Vendurs");
	  obj.setHaveEmailMarketing(true);
	  obj.setHaveProdectTesting(true);
	  obj.setDiscount("5%");
	  obj.setLossInLastYear(10000);
	  obj.setMaintenanceCharge(20000);
	  obj.setBuildingRate(3000000);
		
		
		
		
		System.out.println(obj.getShopName());
		System.out.println(obj.getOwnerName());
		System.out.println(obj.getStoreRelated());
		System.out.println(obj.getShopNo());
		System.out.println(obj.getShopinauguration());
		System.out.println(obj.getShopingTiming());
		System.out.println(obj.getAddress());
		System.out.println(obj.getShopBuildingNo());
		System.out.println(obj.getManagerName());
		System.out.println(obj.getShopRent());
		System.out.println(obj.getTotalExpenture());
		System.out.println(obj.getProfitInAMonth());
		System.out.println(obj.getisHaveBranches());
		System.out.println(obj.getBranches());
		System.out.println(obj.getSections());
		System.out.println(obj.getTotalClothAvailable());
		System.out.println(obj.getWomamsColths());
		System.out.println(obj.getMenCloths());
		System.out.println(obj.getKidCloths());
		System.out.println(obj.getMostExpensiveCloth());
		System.out.println(obj.getMostLessExpensiveCloth());
		System.out.println(obj.getnoOfEmployee());
		System.out.println(obj.getEmployeeMinimumSalary());
		System.out.println(obj.getShopColour());
		System.out.println(obj.getFloors());
		System.out.println(obj.getTotalCustomerPerDay());
		System.out.println(obj.getNoOfRooms());
		System.out.println(obj.getSleepWear());
		System.out.println(obj.getTrialRoom());
		System.out.println(obj.getBeautyAndPersonalCare());
		System.out.println(obj.getBusinessModel());
		System.out.println(obj.getSportsAndActiveWear());
		System.out.println(obj.getLuggageAndTrolleys());
		System.out.println(obj.getWinterWear());
		System.out.println(obj.getSummerWear());
		System.out.println(obj.getShopName());
		System.out.println(obj.getWesternwear());
		System.out.println(obj.getBillingRoom());
		System.out.println(obj.getCounters());
		System.out.println(obj.getPaymentProcessingFee());
		System.out.println(obj.getCustomerFeedback());
		System.out.println(obj.getPaymentMethod());
		System.out.println(obj.getProfitMargin());
		System.out.println(obj.getUpcommingEvents());
		System.out.println(obj.getPopularProduct());
		System.out.println(obj.getEmployeeTraining());
		System.out.println(obj.getBrandIdentity());
		System.out.println(obj.getLocalization());
		System.out.println(obj.getMarketingBudget());
		System.out.println(obj.getpricingStrategy());
		System.out.println(obj.getEmployeePerformance());
		System.out.println(obj.getReturnPolicy());
		System.out.println(obj.getSalesAnaliseCheck());
		System.out.println(obj.getSalesProjections());
		System.out.println(obj.getVendurManagment());
		System.out.println(obj.getisHaveEmailMarketing());
		System.out.println(obj.getisHaveProdectTesting());
		System.out.println(obj.getDiscount());
		System.out.println(obj.getLossInLastYear());
		System.out.println(obj.getMaintenanceCharge());
		System.out.println(obj.getBuildingRate());
		
		}

}
