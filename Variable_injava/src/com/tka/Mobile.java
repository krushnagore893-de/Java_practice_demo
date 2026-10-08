package com.tka;

public class Mobile {

	static int mobileId = 501;
	static String mobile_brand = "Samsung";
	static String mobile_model = "Galaxy S25";
     static double mobile_price = 79999.99;
     static String mobile_color = "Black";
     static int mobile_ram = 12;
     static int mobile_storage = 256;
     static int mobile_battery = 5000;
     static boolean mobile_is5G = true;
     static int mobile_warranty = 1;
     
     static String mobile_IMEI;
     static String mobile_secondIMEI;
     static String mobile_insurance;
     static String mobile_previousOwner;
     static int mobile_loanAmount;
     
     public static void main(String[] args) {

	    	
	        System.out.println("mobileId ---> " + mobileId);
	        System.out.println("brand ---> " + mobile_brand);
	        System.out.println("model ---> " + mobile_model);
	        System.out.println("price ---> " + mobile_price);
	        System.out.println("color ---> " + mobile_color);
	        System.out.println("ram ---> " + mobile_ram);
	        System.out.println("storage ---> " + mobile_storage);
	        System.out.println("battery ---> " + mobile_battery);
	        System.out.println("is5G ---> " + mobile_is5G);
	        System.out.println("warranty ---> " + mobile_warranty);
	        System.out.println("IMEI ---> " + mobile_IMEI);
	        System.out.println("secondIMEI ---> " + mobile_secondIMEI);
	        System.out.println("insurance ---> " + mobile_insurance);
	        System.out.println("previousOwner ---> " + mobile_previousOwner);
	        System.out.println("loanAmount ---> " + mobile_loanAmount);

	    }
	

}
