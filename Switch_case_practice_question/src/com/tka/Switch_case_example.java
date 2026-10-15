package com.tka;

public class Switch_case_example {

	public static void main(String[] args) {
//
//		/// 1. Print Day Name Write a program to print the day name using a number.
		
//		 int day = 3;
//		 
//		 switch(day) {
//		 
//		 case 1 :
//			 System.out.println("Monday");
//			 break;
//			 
//		 case 2 :
//			 System.out.println("Tuesday");
//			 break;
//
//		 case 3 :
//			 System.out.println("wednesday");
//			 break;
//		
//		 case 4 :
//			 System.out.println("thursday");
//			 break;
//			
//		 case 5 :
//			 System.out.println("friday");
//			 break;
//		
//		 case 6 :
//			 System.out.println("saturday");
//			 break;
//			 
//		 case 7 :
//			 System.out.println("sunday");
//			 break;
//			 
//		 default :
//			System.out.println("Not a day");
//		 }

		
//		/// 2. Print Month Name Write a program to print month name based on
//		/// number (1–12).
////
////		int month = 10;
////		switch (month) {
////		case 1:
////			System.out.println("January");
////			break;
////
////		case 2:
////			System.out.println("February");
////			break;
////
////		case 3:
////			System.out.println("march");
////			break;
////
////		case 4:
////			System.out.println("april");
////			break;
////
////		case 5:
////			System.out.println("may");
////			break;
////
////		case 6:
////			System.out.println("june");
////			break;
////
////		case 7: 
////			System.out.println("july");
////			break;
////
////		case 8: 
////			System.out.println("august");
////			break;
////
////		case 9: {
////			System.out.println("september");
////		}
////			break;
////
////		case 10: 
////			System.out.println("October");
////			break;
////
////		case 11: 
////			System.out.println("november");
////			break;
////
////		case 12: 
////			System.out.println("december");
////			break;
////
////		default:
////			System.out.println("Not a month");
////		}
//
//		/// 3. Simple Calculator
//
//		/// Create a calculator using switch case for operations:
//
////		char op = '-';
////		int a = 10;
////		int b = 2;
////		
////		switch(op) {
////		case '+':
////			System.out.println("Addition :" + (a+b));
////			break;
////		
////		case '-':
////			System.out.println("Subtraction :"+(a-b));
////			break;
////			
////		case '*':
////			System.out.println("Multiplication :"+(a*b));
////			break;
////			
////		case '/':
////			System.out.println("Division :"+(a/b));
////			break;
////			
////		default :
////			System.out.println("not a valid");
////			
////		}
//
//		/// 4. Vowel or Consonant Write a program to check whether a character is a
//		/// vowel or consonant using switch.
////
////		char vowel = 'z';
////
////		switch (vowel) {
////
////		case 'a', 'e', 'i', 'o', 'u',
////       	     'A', 'E', 'I', , 'O' ,'U':
////			System.out.println("Vowel ---> " + vowel);
////			break;
////		
////	    default :
////	    	System.out.println("Consonant ---> " + vowel);
////		}
//
//		/// 5. Grade System Write a program to print grade description.
//
////		char grade = 'F';
////		switch(grade) {
////		
////		case 'A' :
////			System.out.println("Excellent");
////			break;
////
////		case 'B' :
////			System.out.println("Good");
////			break;
////
////		case 'C' :
////			System.out.println("Average");
////			break;
////		
////		case 'D' :
////			System.out.println("Pass");
////			break;
////			
////		default :
////			System.out.println("Fail");
////		}
////		
//
//		/// 6. Even or Odd / Write a program to check even or odd using switch case.
////
////		int num = 12;
////		switch(num % 2) {
////		  
////		case 0 :
////			System.out.println("even number");
////			break;
////		default :
////			System.out.println("odd number");
////		}
//
//		/// 7. Menu Driven Program Create a menu like:
////
////       int n = 8;
////       
////       switch(n) {
////       
////       case 1 :
////    	   System.out.println("Login");
////    	   break;
////    	   
////       case 2 :
////    	   System.out.println("Register");
////    	   break;
////    	 
////       case 3:
////    	   System.out.println("Profile");
////    	   break;
////    
////       case 4 :
////    	   System.out.println("Logout");
////    	   break;
////    
////    	default :
////    		System.out.println("Not a allowed");
////       }
//
//		//// 8.Check if the day is Weekend or Weekday. Example
//		// 1–5 → Weekday 6–7 →
//
////		int day = 3;
////
////		switch (day) {
////		
////		case 1, 2, 3, 4, 5:
////			System.out.println("Weekday");
////			break;
////		case 6, 7:
////			System.out.println("Weekend");
////			break;
////
////		default:
////			System.out.println("Not a day");
////
////		}
//
//		/// 9. Write a program using switch where operator is:
//		/// + - *
//
////		char op = '+';
////		int a = 10;
////		int b = 2;
////		
////		switch(op) {
////		case '+':
////			System.out.println("Addition :" + (a+b));
////			break;
////		
////		case '-':
////			System.out.println("Subtraction :"+(a-b));
////			break;
////			
////		case '*':
////			System.out.println("Multiplication :"+(a*b));
////			break;
////			
////		case '/':
////			System.out.println("Division :"+(a/b));
////			break;
////			
////		default :
////			System.out.println("not a valid");
////			
////		}
//
//		/// 10. Print Language Name Input language code and print name.
//		// 1 → Java
//		// 2 → Python
//		// 3 → C++
//		// 4 → JavaScript
//
////		int a = 1;
////		
////		switch(a) {
////		
////		case 1 :
////			System.out.println("java");
////			break;
////		
////		case 2 :
////			System.out.println("python");
////			break;
////			
////		case 3 :
////			System.out.println("C++");
////			break;
////	    
////		case 4 :
////			System.out.println("JavaScript");
////			break;
////		
////		default :
////			System.out.println("Not a language");
////		}
//		
//		
//		/// 11. Calculate area using switch.
//
//      //1 → Circle
//      //2 → Rectangle
//      //3 → Square
//		
//		int choice = 2;
//		switch(choice) {
//		
//		case 1:
//			System.out.println("Circle :" + (3.14 * 5 * 5));
//			break;
//			
//
//		case 2:
//			System.out.println("Rectangle :" + (4* 6));
//			break;
//			
//
//		case 3:
//			System.out.println("Square :" + (5 * 5));
//			break;
//		
//		default :
//			System.out.println("Invalid choice :");
//		}
//		
//		
//		
//		
//		
//
//		/// 12 Print traffic signal message.
//		// Red → Stop
//		// Yellow → Ready
//		// Green → Go
//
////		String signal = "Red" ;
////		
////		switch(signal) {
////		
////		case "Red" :
////			System.out.println("Stop");
////			break;
////			
////		case "Yellow" :
////			System.out.println("Ready");
////			break;
////			
////		case "Green" :
////			System.out.println("Go");
////			break;
////		
////		default :
////			System.out.println("invalid signal");
////		
////		}
/// 
//
//		/// 13 Convert numbers into words.
//
//		 int num = 2;
//		 switch(num) {
//		 
//		 case 1 :
//			 System.out.println("One");
//			 break;
//		
//		 case 2:
//			 System.out.println("Two");
//			 break;
//		
//		 case 3 :
//			 System.out.println("Three");
//			 break;
//			 
//		 case 4 :
//			 System.out.println("Four");
//			 break;
//			 
//		 case 5 :
//			 System.out.println("Five");
//			 break;
//		
//		default :
//			System.out.println("Not a valid number");
//		 }

//		/// 14 Print department name.
//
////		1 → Computer Science
////		2 → Mechanical
////		3 → Civil
////		4 → Electrical

//
////		 int department = 4;
////		
////		 switch(department) {
////		 
////		 case 1 :
////			 System.out.println("Computer Science");
////			 break;
////		
////		 case 2:
////			 System.out.println("Mechanical");
////			 break;
////		
////		 case 3 :
////			 System.out.println("Civil");
////			 break;
////			 
////		 case 4 :
////			 System.out.println("Electrical");
////			 break;
////		
////		default :
////			System.out.println("Invalid department");
////		 }
//
//		/// 15 Print season based on month number.
//		// Example
//		//

////		
////		int month = 6;
////		
////		switch(month) {
////		
////		case 1,2,3,4:
////			System.out.println("Winter");
////			break;
////			
////		case 5,6,7,8:
////			System.out.println("Summer");
////			break;
////		
////		case 9,10,11,12:
////			System.out.println("Monsoon");
////			break;
////		
////		default :
////			System.out.println("Not a month");
////		}
//		
//		
//
//		/// 16 Create a mobile settings menu.
//		//
//		// 1 → WiFi
//		// 2 → Bluetooth
//		// 3 → Mobile Data
//		// 4 → Airplane Mode
//
////		int choice = 3;
////
////		switch (choice) {
////
////		case 1:
////			System.out.println("wifi settings");
////			break;
////		
////		case 2:
////			System.out.println("Bluetooth settings");
////			break;
////			
////		case 3:
////			System.out.println("Mobile Data settings");
////			break;
////			
////		case 4:
////			System.out.println("Airplane Mode settings");
////			break;
////			
////	     default :
////	    	 System.out.println("Notvalid mobile settings");
////		}
//
//		/// 17. Create food menu.
//
//		// 1 → Pizza
//		// 2 → Burger
//		// 3 → Sandwich
//		// 4 → Pasta
//
////		int food = 1;
////		
////		switch(food) {
////		case 1 :
////			System.out.println("Pizza");
////			break ;
////			
////		case 2 :
////			System.out.println("Burger");
////			break ;
////		
////		case 3 :
////			System.out.println("Sandwich");
////			break ;
////		
////		case 4 :
////			System.out.println("Pasta");
////			break ;
////		
////		default :
////			System.out.println("not a food");
////				
////		}
//
//		/// 18. Based on marks category.
//		//
//		// 1 → Pass
//		// 2 → Distinction
//		// 3 → Fail
//
////		
////		int marksNu = 1;
////		
////		switch(marksNu) {
////		case 1 :
////			System.out.println("Pass");
////			break ;
////			
////		case 2 :
////			System.out.println("Distinction");
////			break ;
////		
////		case 3 :
////			System.out.println("Fail");
////			break ;
////		
////		default :
////			System.out.println("not a marks");
////				
////		}
//
//		//// 19. ATM Menu Program
//
//		// Create ATM options.
//		//
//		// 1 → Check Balance
//		// 2 → Withdraw
//		// 3 → Deposit
//		// 4 → Exit
//
		int choice = 5;
		
		switch(choice) {
		case 1 :
			System.out.println("Check Balance");
			break ;
			
		case 2 :
			System.out.println("Withdraw");
			break ;
		
		case 3 :
			System.out.println("Deposit");
			break ;
		
		case 4 :
			System.out.println("Exit");
			break ;
		default :
			System.out.println("Invalid ATM choice");
				
		}

	}
}
