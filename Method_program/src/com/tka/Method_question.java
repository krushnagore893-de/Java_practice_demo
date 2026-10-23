package com.tka;

public class Method_question {

	
  //// 1. fibnocassi
  
//	public void fibnocassi() {
	public void fibonacci(int n) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(a);

            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
	
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
