package com.tka;

public class Loop_practice_question {

	public static void main(String[] args) {

/// 1. Print numbers from 1 to 10.

//     for(int i = 1; i <= 10 ; i++){
//         System.out.println(i);
//     }

/// 2. Print numbers from 10 to 1 in reverse order.

//     for(int i = 10 ;i >= 1;i--){
//         System.out.println(i);
//     }

		
/// 3. Print all even numbers from 1 to 50.

//     for(int i = 1; i <= 50 ;i++) {
//         if(i % 2 == 0) {
//             System.out.println(i);
//         }
//     }
		
		
/// 4. Print all odd numbers from 1 to 50..
	    
//	    for (int i = 1; i <= 50; i++) {
//	        if(i % 2 != 0) {
//	            System.out.println(i);
//	        }
//	    }
    

/// 5. Calculate the sum of numbers from 1 to 10.

//
//     int sum = 0;
//     for(int i = 0; i<= 10; i++){
//        sum = sum += i;
//     }
//     System.out.println("sum = " + sum) ;

	
/// 6. Print the multiplication table of 5.

//	    for(int i = 1; i <= 50; i+=5){
//	      System.out.println(i);
//	    }

/// 7.Print the multiplication table of 10 in reverse order.

//	 for(int i = 100 ; i >= 1 ; i-=10){
//	     System.out.println(i);
//	 }

		
/// 8.Print numbers from 1 to 100 that are divisible by 5.

//	 for(int i = 1; i <= 100 ; i++ ) {
//	     if(i % 5 == 0){
//	          System.out.println(i);
//	     }
//	 }
		

/// 9.Print the squares of numbers from 1 to 20.

//	 for(int i = 1; i <= 20; i++) {
//		 System.out.println(i +"  square = " + (i * i) );
//	 }

		
/// 10. 1. Print the cubes of numbers from 1 to 15.

		
//	 for(int i = 1;i <= 15; i++) {
//		 System.out.println(i + " cube = " + (i * i * i));
//	 }

/// 11. Calculate the product of numbers from 1 to 10.

		
//	 int product = 1;
//	 for(int i = 1 ; i <= 10 ; i++) {
//		product = product * i;
//	 }
//     System.out.println(product);

		
/// 12. Calculate the sum of even numbers from 1 to 100.

		
//	 int sum = 0;
//	 for(int i = 1; i <= 100; i++) {
//		 if(i % 2 == 0) {
//			 sum = sum + i;
//		 }
//	 }
//	 System.out.println(sum);

		
/// 13. Calculate the sum of odd numbers from 1 to 100.

//	 int sum = 0;
//	 for(int i = 0; i <= 100; i ++) {
//		 if(i % 2 != 0) {
//			 sum = sum + i ;
//		 }
//	 }
//	 System.out.println("sum = " + sum);
//     

/// 14 . Find the factorial of a given number (n = 5).

//	 int n = 5;
//	 int fact = 1;
//	 for(int i = 1; i <=n ;i++) {
//		 fact = fact * i;
//	 }
//	 System.out.println("factorial = " + fact);
//	 

/// 15 . Count the number of digits in a given number.

//		int n = 12345;
//		int count = 0;
//		for(int i = 0 ; n > 0; i++) {
//			int rem = n % 10;
//			count++;
//			
//			System.out.println("rem = " + rem);
//			n = n / 10;
//		}
//		System.out.println(count);
		
		
/// 16.Print the multiplication table of a given number from 1 to 10.

//	 int n = 5;
//	 for(int i = 1; i <=10 ; i++) {
//		 System.out.println(n + " * " + i + " = " + n*i);
//	 }

		
/// 17. Print numbers from 1 to 100 that are divisible by both 3 and 5.

//	 for(int i = 1; i <= 100; i++) {
//		 if(i % 3 == 0 && i % 5 == 0) {
//			 System.out.println(i);
//		 }
//	 }
 

/// 18.  Print all perfect squares between 1 and 100.

//	 for(int i = 1; i <= 100; i++) {
//		 System.out.println("Square = " + (i * i));
//	 }

		
/// 19 Check whether a given number is prime.

// 
//	 int prime = 2;
//     boolean isPrime = true;
//     
//     for(int i = 2; i < prime ; i++) {
//    	if(i <= 1 ) isPrime = false;
//    	 
//    	 if(prime % i == 0) {
//    		 isPrime = false;
//    		 break;
//    	 }
//     }
//    	 if(isPrime) {
//    		 System.out.println("is prime number");
//    	 } else {
//    		 System.out.println("is not prime number");
//    	 }
		
		

//// 20. Print all prime numbers from 1 to 100.

//		 for (int n = 2; n <= 100; n++) {
//	           boolean isPrime = true;
//
//	           for (int i = 2; i < n; i++) {
//	                if (n % i == 0) {
//	                    isPrime = false;
//	                    break;
//	                }
//	            }
//
//	            if (isPrime) {
//	                System.out.print(n + " ");
//	            }
//	        }

		
/// 21. Check whether a given number is a palindrome.

		
		
	//// while loop

	
/// 1.Print numbers from 1 to 10.

//		int i = 1; 
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//		}
//		

		
/// 2. Print numbers from 20 to 1 in reverse order.

//		int i = 20; 
//		while(i >= 1) {
//			System.out.println(i);
//			i--;
//		}

		
/// 3. Print all even numbers from 1 to 100.

//		int i = 1;
//		while(i <= 100) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}

		
/// 4. Print all odd numbers from 1 to 100.

//		int i = 1;
//		while(i <= 100) {
//			if(i % 2 != 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		

/// 5. Calculate the sum of numbers from 1 to 10.

//		int i = 1;
//		int sum = 0;
//		while(i <= 10) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println(sum);

		
/// 6. Print the multiplication table of 7.

//		int i = 0;
//		while(i <= 70) {
//			System.out.println(i);
//			i+=7;
//		}

		
		
/// 7. Print numbers from 1 to 50 that are divisible by 5.

//		int i = 1;
//		while(i <=50) {
//			if(i % 5 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}

		
/// 8 . Print the squares of numbers from 1 to 10.

//		int i = 1;
//		while(i <= 10) {
//			System.out.println("square = " + (i * i));
//			i++;
//		}

		
/// 9. Print the first 10 terms of the Fibonacci series.
//
//		int i = 1;
//		
//		int a = 0;
//		int b = 1;
//		System.out.println(a);
//		System.out.println(b);
//		
//		while(i <=10 ) {
//			System.out.println(" =" + i);
//			int c = a + b;
//			
//			System.out.println(c);
//			a = b;
//			b = c;
//			i++;
//			
//		}

		
		
/// 10.Print numbers from 1 to 100 that are divisible by 3.
//		
//		int i = 1;
//		while(i <= 100) {
//		  if(i % 3 == 0) {
//			  System.out.println(i);
//			 
//		  }
//		  i++;
//		  
//		}

		/// 11.Find the factorial of a number.

//		int i = 1;
//		int n = 5;
//		int fact = 1;
//		
//		while(i <= n) {
//			fact = fact * i;
//			i++;
//		}
//		System.out.println(fact);
//		

		/// 12. Count the digits of a number.

//		int n = 12345;
//		int count = 0;
//		
//		while(n > 0) {
//			count++;
//			n = n / 10;
//		}
//		System.out.println("total digits = " + count);

		
/// 13.Find the sum of all even digits and odd digits separately.
//
//		int n = 12345;
//		int evenSum = 0;
//		int oddSum = 0;
//		
//		while(n > 0) {
//			int rem = n % 10;
//			
//			if(rem % 2 == 0) {
//				evenSum = evenSum + rem;
//			} else {
//				oddSum = oddSum + rem;
//			}
//			
//			n = n / 10;
//		}
//		
//		System.out.println("even number sum = " + evenSum);
//		System.out.println("odd number sum = " + oddSum);
//		

		
		
/// 14. Find the largest digit in a number.

//		int n = 12346;
//		int largest = -1;
//		
//		while (n > 0) {			
//			
//		int rem = n % 10;
//		if(rem > largest) {
//			largest = rem;
//		}
//	  
//		n = n / 10;
//	  }
//
//		System.out.println("largest num = " + largest);

		
/// 15. Find the largest digit in a number.

//		int n = 12346;
//		int largest = -1;
//		int secondLargest = -1;
//		while (n > 0) {			
//			
//		int rem = n % 10;
//		if(rem > largest) {
//			secondLargest = largest;
//			largest = rem;
//		} else if(rem > secondLargest && rem < largest) {
//			secondLargest = rem;
//		}
//	  
//		n = n / 10;
//	  }
//
//		System.out.println("second largest num = " + secondLargest);


		
		
		/// do while

//// 1. Print numbers from 1 to 10.

//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		}
//		while(i <= 100);

		
/// 2.Print numbers from 10 to 1.

//		int i = 10;
//		do {
//			System.out.println(i);
//			i--;
//		}
//		while(i >= 1);

		
/// 3. Print even numbers from 1 to 50.

//		int i = 1;
//		do {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
//		while(i <= 50);

		
/// 4. Print odd numbers from 1 to 50.

//		int i = 1;
//		do {
//			if(i % 2 != 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
//		while(i <= 50);
//		

		
/// 5.Print multiples of 5 from 1 to 100.

//		int i = 5;
//		do {
//			System.out.println(i);
//			i+=5;
//		}
//		while(i <= 100);

		
		
/// 6. Print numbers divisible by 3 from 1 to 100.

//		int i = 1;
//		do {
//			if(i % 3 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
//		while(i <= 100);

		
		
/// 7. . Find the sum of odd numbers from 1 to 100.

//		int i = 1;
//		int sum = 0;
//		do {
//			if(i % 2 != 0) {
//				sum = sum += i;
//			}
//			i++;
//			
//		}
//		while(i <= 100);
//		System.out.println("Sum of numbers =" + sum);

		
		
/// 8. Find the sum of even numbers from 1 to 100.

//		int i = 1;
//		int sum = 0;
//		do {
//			if(i % 2 == 0) {
//				sum = sum += i;
//			}
//			i++;
//			
//		}
//		while(i <= 100);
//		System.out.println("Sum of numbers =" + sum);

		
		
/// 9. Print the first 10 multiples of 7.
//

//		int i = 1;
//		int n = 7;
//		do {
//			System.out.println(n + " * " + i + " = " + n * i);
//			i++;
//		}
//		while(i <= 10);
//		
//		

/// 10. Print cubes of numbers from 1 to 10.

//		int i = 1;
//		do {
//			System.out.println("Cubes = " + (i * i));
//			i++;
//		}
//		while(i <= 10);


/// 11.Count even and odd digits in a number.
//
//		int n = 123456;
//		int even = 0;
//		int odd = 0;
//		
//		do {
//			int rem = n % 10;
//			
//			if(rem % 2 == 0) {
//				even++;
//			} else {
//				odd++;
//			}
//			n = n / 10;
//			
//		}
//		while(n > 0);
//		System.out.println("even number count =" + even);
//		System.out.println("odd number count =" + odd);

		
		
/// 12 .Count even and odd number 1 to 100

//		int i = 1;
//	    int even = 0;
//	    int odd = 0;
//		do {
//			if(i % 2 == 0) {
//				even++;
//			} else {
//				odd++;
//			}
//			i++;
//			
//		}
//		while(i <= 100);
//		System.out.println("even number = " + even);
//		System.out.println("odd number = " + odd);

		
		
/// 13.Find the factorial of a number.

//		int i = 1;
//		int n = 5;
//		int fact = 1;
//		
//		do {
//			fact = fact * i;
//			i++;			
//		}
//		while(i <=n);
//		System.out.println(fact);

		
		
/// 14. Check whether a number is prime.

//		int i = 2;
//		int n = 5;
//		boolean isPrime = true;
//		do {
//			if(i <= 1) {
//				isPrime = false;
//			}
//			
//			if(n % i == 0) {
//				isPrime = false;
//				break;
//			}
//			
//			i++;
//			
//		}
//		while(i < n);
//		if(isPrime) {
//			System.out.println("prime number");
//		} else {
//			System.out.println("not prime number");
//		}

		
//// 15. Find the largest digit in a number.
//
//		int n = 12345;
//		int largest = -1;
//		do {
//			int rem = n % 10;
//			
//			if(rem > largest) {
//				largest = rem;
//			}
//		  
//			n = n / 10;
//		}
//		while (n > 0);
//		System.out.println(largest);
		
		
		
/// 16. find the second laragest digits in number

//		
//		int n = 12345;
//		int largest = -1;
//		int secondLargest = -1;
//		do {
//			int rem = n % 10;
//			
//			if(rem > largest) {
//				secondLargest = largest;
//				largest = rem;
//			} else if(rem > secondLargest && rem < largest) {
//				secondLargest = rem;
//			}
//		  
//			n = n / 10;
//		}
//		while (n > 0);
//		System.out.println(second Largest);
	}

}
