package com.tka;

public class Ecommerce {

	int discount;
	
	public double calculateDiscount(double price) {
		
		double discount = price * 10 / 100;
		double finalPrice = price - discount;
		
		return finalPrice;
	}
}
