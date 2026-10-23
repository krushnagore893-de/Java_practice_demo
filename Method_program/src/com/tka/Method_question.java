package com.tka;

public class Method_question {

	
  //// 1. fibnocassi
  
//	public void fibnocassi() {
//		
//		int n = 10;
//		int a = 0;
//		int b = 1;
//		System.out.println(a);
//		System.out.println(b);
//
//		for(int i = 1; i <= n; i++) {
//			int c = a + b;
//			System.out.println(c);
//			
//			a = b;
//			b = c;
//		}
//		
//	}
	
	//// 2. reverse number
	
//	public int reverse(int num) {
//		
//		
//		int reverse = 0;
//		
//		while(num > 0) {
//			int digit = num % 10;
//			reverse = reverse * 10 + digit;
//			
//			num = num / 10;
//		}
//		
//		return reverse ;
//	
//      }
	
	
	/// 3. palindrome
	
	public int palindrome(int num) {
		
		int original = num;
		int reverse = 0;
		
		while(num > 0) {
			
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			
			num = num / 10;
			
		}
		
		return reverse;
	}
	
}
