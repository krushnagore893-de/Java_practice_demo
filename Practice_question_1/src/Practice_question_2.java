import java.util.Scanner;

public class Practice_question_2 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
/// 1. Write a Java program to check whether a number is even or odd.

//		System.out.println("Enter your number :");
//		int num = sc.nextInt();
//		
//		if (num % 2 == 0) {
//			System.out.println("Even number");
//		} else {
//			System.out.println("Odd number");
//		}
		

/// 2. Write a Java program to check whether a number is positive, negative, or zero.
		
//		System.out.println("Enter your number :");
//		int num = sc.nextInt();
//		
//		if (num > 0) {
//			System.out.println("positive number");
//		} else if (num < 0) {
//			System.out.println("Negative number");
//		} else {
//			System.out.println("Zero");
//		}

/// 3.Write a Java program to find the largest of two numbers.
//
//		System.out.println("Enter your first number :");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter your second number :");
//		int b = sc.nextInt();
//		
//		if (a > b) {
//			System.out.println("a is largest number");
//		} else {
//			System.out.println("b is largest number");
//		}
		
/// 4. Print numbers from 1 to 100.
//
//		for(int i = 1 ; i <=100; i++) {
//			System.out.println(i);
//		}

/// 5.Print numbers from 100 to 1.

//		for(int i = 100; i >=1; i--) {
//			System.out.println(i);		
//		}
//		

/// 6. Print all even numbers from 1 to 100.

//		for(int i = 1; i <=100; i++) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}

/// 7.Print all odd numbers from 1 to 100.

//		for(int i = 0; i <= 100; i++) {
//			if(i % 2 != 0) {
//				System.out.println(i);
//			}
//		}
		
// 8. Print the multiplication table of a given number.
//		System.out.println("Enter your number :");
//		int a = sc.nextInt();
//		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i*a);
//		}

// 9. Calculate the sum of even numbers from 1 to N.
//		
//		System.out.println("Enter your number :");
//		int n = sc.nextInt();
//		int sum = 0;
//		for(int i = 1; i <=n; i++) {
//			if(i % 2 == 0) {
//				sum = sum + i;
//			}
//		}
//		System.out.println(sum);
		
/// 9. Calculate the sum of odd numbers from 1 to N.
//
//		System.out.println("Enter your number :");
//		int n = sc.nextInt();
//		
//		int sum = 0;
//		for(int i = 1; i <=n; i++) {
//			if (i % 2 != 0) {
//				sum = sum + i ;
//			}
//		}
//		System.out.println(sum);

/// 10.Swap two numbers without using a third variable.
		
//		int a = 50;
//		int b = 10;
//		
//		a = a + b;
//		b = a - b;
//		a = a - b;
//		
//		System.out.println("a --- >" + a);
//		System.out.println("b ---->" + b);
		
/// 11. Find the remainder of two numbers.

//		int a = 20;
//		int b = 2;
//		
//		int reminder = a % b ;
//		System.out.println("reminter --->" + reminder);
		
/// 12. Check the result of pre-increment and post-increment.
//
//		int a = 10;
//		System.out.println("post increment ---> " + a++);
//		System.out.println("post increment ---> " + a);
		
/// 13. Check the result of pre-decrement and post-decrement.

//		int a = 10 ;
//		System.out.println(++a);
//		System.out.println(a);
		
/// 14. Check whether two numbers are equal.
//
//		int a = a
//		int b = 12;
//		
//		if (a == b) {
//			System.out.println("is equal");
//		} else {
//			System.out.println("not equal");
//		}

/// 15.Check whether one number is greater than another.
//
//		System.out.println("Enter your first number :");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter your second number :");
//		int b = sc.nextInt();
//		
//		if (a > b) {
//			System.out.println("A is greater than number :");
//		} else if(b > a) {
//			System.out.println("B is greater than number");
//		} else {
//			System.out.println("both number is equal");
//		}
		
/// 16. Find the largest of two numbers using a ternary operator.
//
//		System.out.println("Enter your first number :");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter your first number :");
//		int b = sc.nextInt();
//		
//		String result = (a > b) ? "a is largest number" : " b is largest number";
//		System.out.println(result);

		
/// 17. Find the smallest of two numbers using a ternary operator.

//		
//		System.out.println("Enter your first number :");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter your first number :");
//		int b = sc.nextInt();
//		
//		String result = (a < b) ? "a is smallest number" : "b is smallest number";
//		System.out.println(result);
		
/// 18. Check whether a number is even using the ternary operator.

//		System.out.println("Enter your first number :");
//		int a = sc.nextInt();
//		
//		String result = a % 2 == 0 ? "even number" : "odd number";
//		System.out.println(result);
		
/// 19. Check whether a number is positive using the ternary operator.

//		System.out.println("Enter your first number :");
//		int a = sc.nextInt();
//		
//		String result = (a > 0 ) ? "positive number" : "negative number";
//		System.out.println(result);
//	

/// 20. Check whether a person is eligible to vote.
//
//		System.out.println("Enter your first number :");
//		int a = sc.nextInt();
//		
//		if ( a >=18) {
//			System.out.println(" eligible to vote");
//		} else {
//			System.out.println("not eligible to vote");
//		}

/// 21. Check whether a person is eligible for a driving license.

//		System.out.println("Enter your age :");
//		int age = sc.nextInt();
//		
//		if (age >=18) {
//			System.out.println("eligible for a driving license");
//		} else {
//			System.out.println("not eligible for a driving license");
//		}

/// 22. Check whether a student has passed or failed.

//		System.out.println("Enter your marks :");
//		int marks = sc.nextInt();
//		
//		if(marks >=35) {
//			System.out.println("Pass");
//		} else {
//			System.out.println("Fail");
//		}
		
/// 23. Find the largest of two numbers.
//
//		System.out.println("Enter your first number :");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter your second number :");
//		int b = sc.nextInt();
//		
//		if(a > b) {
//			System.out.println("A is largest number");
//		} else if (b > a) {
//			System.out.println("B is largest number");
//		} else {
//			System.out.println("both of the equal number");
//		}
		
/// 24. Find the largest of three numbers.
//
//		System.out.println("Enter your first number :");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter your second number :");
//		int b = sc.nextInt();
//		
//		System.out.println("Enter your third number :");
//		int c = sc.nextInt();
//		
//		if(a > b && a > c) {
//			System.out.println("A is largest number :");
//		} else if (b > c && b > a) {
//			System.out.println("B is largest number");
//		} else if (c > a && c > b) {
//			System.out.println("C is largest number");
//		} else {
//			System.out.println("Both of the equal");
//		}
		
/// 25. Check whether a year is a leap year.
//
//		System.out.println("Enter your year :");
//		int year = sc.nextInt();
//		
//		if (year % 400 == 0) {
//			System.out.println(year + " is a leap year");
//		} else if (year % 100 == 0) {
//			System.out.println(year + " is not leap year");
//		} else if (year % 4 == 0) {
//			System.out.println(year + " is a leap year");
//		} else {
//			System.out.println(year + " is not leap year");
//		}

		
// 26. Check whether a character is uppercase.    

		System.out.println("Enter tour character :");
		char ch = sc.next().charAt(0);
		
		if (ch >='A' && ch <= 'Z') {
			System.out.println(ch + " is an Uppercase character :");
		} else {
			System.out.println(ch + " is not an Uppercase character :");
		}
		
	}
}
