package com.tka;

public class MainClass_method {
	
public static void main(String[] args) {

	JavaMethodPractice d = new JavaMethodPractice();

//	/// 1.
	System.out.println(" 1: Hello Java  ");
	
	String result = d.myAddition();
    System.out.println(result);
    
    
    System.out.println("\n 2: Even or Odd ---");
    /// 2.
    d.myAddition(12);
 
    
    /// 3. 
    System.out.println("\n 3: Compare Two Numbers ---");

    String result1 = d.myAddition(12, 10);
    System.out.println(result1);
     
    
    /// 4 
    System.out.println("\n 4: Addition of Three Numbers ---");

    int sum1 = d.myAddition(10, 20, 11);
    System.out.println("Addition: " + sum1);

  
	/// 5 pass and fail
    System.out.println("\n 5: Pass or Fail ---");

    
    String sum2 = d.myAddition(54, true);
    System.out.println("Marks: " + sum2);
    
    
	
/// 6. name and age
    System.out.println("\n 6: name and age ---");

	System.out.println(d.myAddition("krushna", 21));
    
	
///// 7. factriol number
    System.out.println("\n 7: factriol number ---");

	System.out.println(d.myAddition(5, true));
    
	
//// 8. leap year

    System.out.println("\n 8: leap year ---");

	 System.out.println(d.myAddition(2024, 1, 'L'));
    
	
	
/// 9. divison 

	 System.out.println("\n 9: divison  ---");

	System.out.println(d.myAddition(10, 2.0));
	
	
    
 /// 10 cheak or age

	System.out.println("\n 10: cheak or age  ---");
	
	System.out.println(d.myAddition(12, 100L));
	

/// 11. grade

	System.out.println("\n 11: student grade  ---");
	System.out.println("Grade: " + d.myAddition(85, 'G'));	
	
/// 12. divisible by 5

	System.out.println("\n 12: divisible by 5  ---");
	  System.out.println("Divisible by 5: " + d.myAddition(25L, 5));

	
/// 13. print even number

	  System.out.println("\n 13: print even number  ---");

	 d.myAddition((short) 1, (short) 10);

	
	
//// 14. Student details

	  System.out.println("\n 14: Student details  ---");

    d.myAddition("Krushna", 21, 'A');
	
/// 15. Print two strings

	  System.out.println("\n 15: Print two strings  ---");

  d.myAddition("Hello", "Java", 'S');
	
//// 16  addd four number

    System.out.println("\n  16: addd four number  ---");
  
	System.out.println(d.myAddition(1, 2, 3, 4, 'A')); 


	
/// 17. cube 

    System.out.println("\n 17: cube  ---");
	
	System.out.println(d.myAddition(3 , 'C', true));

	
/// 18. even or odd

    System.out.println("\n 18: even or odd number  ---");

	System.out.println(d.isOdd(7L));


/// 19  addition

    System.out.println("\n 19: addition  ---");

	
	System.out.println(d.myAddition(10.5, 20.5));

/// 20 table
	
    System.out.println("\n 20: table ---");

	d.myAddition(2, 'T', true, 10);

	
	/// 21.
	
    System.out.println("\n 21: upper case and lower case  ---");

	System.out.println(d.myAddition('r'));
	
/// 22 .Positive, Negative or Zero

    System.out.println("\n 22: Positive, Negative or Zero ---");

	System.out.println(d.myAddition(12,'S'));
	
	
/// 23.divisble by 10
	
    System.out.println("\n 23: divisble by 10  ---");

 System.out.println(d.myAddition(150L, 'D'));
	
	
	
/// 24  sum of 1 to 10

 System.out.println("\n 24: sum of 1 to 10  ---");

 System.out.println("Sum 1 to 10: " + d.myAddition(10L, 1L));
 
 
/// 25 sum of even numbers

 System.out.println("\n 25: sum of even numbers  ---");


	System.out.println(d.myAddition(11, true, 'E'));

	
/// 26 . count of even numbers

    System.out.println("\n 26: count of even numbers  ---");


	  System.out.println("Count of even numbers: "
              + d.myAddition(18, (short) 0));

}	

}


