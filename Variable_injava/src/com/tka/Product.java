package com.tka;

public class Product {
	static int id = 123;
	static int total_product ;
	static String productName = "Mobile";
	static int total_produc_price;
	static String owener = "krushna";
	static double quantity ;
	static int avalible ;
	static double discount ;
	static String city = "pune";
	static long phoneNo =732676753747l;
	static int mobile_warranty = 2;
	static boolean returnAvailable;            
	static String returnPolicy;  
	static String color = "Black";
	static String category = "Electronics";  
	
	
	public static void main (String[] args) {
		System.out.println("productId ---->" + id);
		System.out.println("total_product ---->" + total_product);
		System.out.println("productName  ----->" + productName);
		System.out.println("total_produc_price ---->" + total_produc_price);
		System.out.println("owener --->" + owener);
		System.out.println("quantity --->" +quantity);
		System.out.println("avalible ---->" + avalible);
		System.out.println("discount  --->" + discount);
		System.out.println("city ---> " + city);
		System.out.println("phoneNo ----> " + phoneNo);
		System.out.println("mobile_warranty -----> " + mobile_warranty);
		System.out.println("returnAvailable ---->" + returnAvailable);
		System.out.println("returnPolicy --->" + returnPolicy);
		System.out.println("color ---->" + color);
		System.out.println("category ---->" + category);
		
		int a = 5;

		int b = a++ + ++a;

		System.out.println(a);
		System.out.println(b);
	}
}
