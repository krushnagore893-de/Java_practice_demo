package com.tka;

public class Atm_program {

	double balance;
	
	public double checkBalance(double amount) {
		if(amount > 0) {
			balance = balance + amount;
			System.out.println("balance ---> " + balance);
			System.out.println("amount successfully...");
		} else {
			System.out.println("Invalid balance :");
		}
		return balance;
	}
	
	public double withdrawAmount(double amount) {
		
		if(amount > 0 && amount < balance) {
			balance = balance - amount;
			System.out.println("withdraw amount successfully... --->" + balance);
		} else {
			System.out.println("Invalid amount..." + balance);
		}
		return balance;
	}
	
	
}
