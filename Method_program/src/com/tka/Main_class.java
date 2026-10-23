package com.tka;

public class Main_class {

	public static void main(String[] args) {
		
		Method_question m1 = new Method_question();
		
//		m1.fibnocassi();
		
//		int result = m1.reverse(12345);
//		System.out.println(result);
		
		
		
		int result = m1.palindrome(121);
		
		if(result == 121) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("not palindrome number");
		}
		
	}
}
