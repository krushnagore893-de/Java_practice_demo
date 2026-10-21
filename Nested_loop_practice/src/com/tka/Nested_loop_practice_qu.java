package com.tka;

public class Nested_loop_practice_qu {

	public static void main(String[] args) {
		
		/// 1. print a square pattern of * (size n ) using nested loop
		
		
//		int n = 5;
//		for(int i = 1; i <= n ; i++) {
//			for(int j = 1; j <= n; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
		
		
		
		/// 2. print a right-angle trangle of * using nested loops
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
		
		
		/// print numbers from 1 to 5 each row (5 row ) using nested loops
//		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
		
		
		/// 4. print a pattern where even rows print * and odd rows print #.
		
//		int n = 5;
//		for(int i = 1; i <= n; i++) {
//			for(int j = 1; j <= i; j++) {
//				if(i % 2 == 0) {
//					System.out.print("* ");
//				} else {
//					System.out.print("# ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		
		//// 5. print a pattern of numbers where 
//		
//		for(int i = 1; i <= 4; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
		
		/// 6  print a multiplication table from 1 to 5 using nested loop
		
//		int n = 10;
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1 ; j <= n; j++) {
//				System.out.println(i + " * " + j + " = "+ i * j );
//			}
//			System.out.println();
//		}
//		
		
		/// 7. print only numbers between 1  to 50 using nested loops and if else
		
//		for(int i = 1; i <= 50; i++) {
//			for(int j = 1; j <= i ; j++) {
//				if(i == j) {
//					System.out.println(i);
//				
//				}
//			
//			}
//		}
		
		/// 8. print a pattern where
		
//		int sum = 0;
//		for(int i = 1 ; i <= 3; i++) {                
//			
//			for(int j = 1; j <= 3; j++) {
//				
//			sum = i + j;
//			if(sum % 2 == 0) {
//				System.out.print("1");
//			} else {
//				System.out.print("0");
//			}
//			
//			}
//			System.out.println();
//		}
		
	
//		  int n = 5;
//
//	        for (int i = 1; i <= n; i++) {
//
//	            // Print spaces
//	            for (int j = 1; j <= n - i; j++) {
//	                System.out.print(" ");
//	            }
//
//	            // Print stars
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("* ");
//	            }
//
//	            System.out.println();
//	        }
		
		
		
/// 9. Check whether two Strings are anagrams.

//        String s1 = "listen";
//        String s2 = "silent";
//
//        s1 = s1.toLowerCase();
//        s2 = s2.toLowerCase();
//
//        if (s1.length() != s2.length()) {
//            System.out.println("No Anagrams");
//            return;
//        }
//
//        int[] count = new int[26];
//
//        for (int i = 0; i < s1.length(); i++) {
//            count[s1.charAt(i) - 'a']++;
//            count[s2.charAt(i) - 'a']--;
//        }
//
//        boolean isAnagram = true;
//
//        for (int i = 0; i < count.length; i++) {
//            if (count[i] != 0) {
//                isAnagram = false;
//                break;
//            }
//        }
//
//        System.out.println(isAnagram ? "Anagram" : "No Anagram");

		
		
		/// array
		
//		int[] arr = { 10, 20, 30 };
//       
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				System.out.println(arr[i] + " , " + arr[j]);
//			}
//		}
//		
		
		
		
	}
}
 