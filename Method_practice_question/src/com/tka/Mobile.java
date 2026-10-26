package com.tka;

public class Mobile {

	double mobile_recharge;
	
	public double recharge(double amount ) {
		
		if(amount > 0) {
			mobile_recharge = mobile_recharge + amount;
			System.out.println("mobile recharge successfully ...." + mobile_recharge);
		} else {
			System.out.println("Invalid Mobile recharge...");
		}
		return mobile_recharge;
	}
}
