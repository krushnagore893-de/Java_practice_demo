package com.tka;

public class Class_Object_Method_question {
//
//////// 1.print Hello Java
	
	public String myAddition() {
		return "Hello Java";
    }
	

 //// 2. Even or Odd
 	
	
    public void myAddition(int a) {
    	 if (a % 2 == 0) {
             System.out.println("Even Number");
         } else {
             System.out.println("Odd Number");
         }
    	 
    }
    
  
////// 3.compare Two Numbers

    public String myAddition(int a, int b) {
        if (a > b) {
            return "A is greater than ";
        } else if (b > a) {
            return "B is greater than";
        } else {
            return "Both are equal";
        }
    }
    
/////// Method 4: Addition of three numbers

    public int myAddition(int a, int b, int c) {
        return a + b + c;
    }

    
/// 5. pass or fail

    public String myAddition(int marks, boolean resultType) {
        return marks >= 35 ? "Pass" : "Fail";
    }
    
	
/// 6. name and age

	  public String myAddition(String name, int age) {
	        return name + " is " + age + " years old";
	    }
	
	
//// 7. factriol number

	   public int myAddition(long n, boolean factorial) {
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }
    
	   
/// 8. leap year

 	 public boolean myAddition(int year, int check, char option) {
	        return year % 400 == 0 ||
	               (year % 4 == 0 && year % 100 != 0);
	    }
	
	  
//// 9. divison

	   public double myAddition(int a, double b) {
	        return a / b;
	    }
	   

/// 10 check age 

	   public String myAddition(int age, long check) {
		    if (age < 0) {
		        return "Invalid Age";
		    } else if (age >= 18) {
		        return "Adult";
		    } else {
		        return "Minor";
		    }
		}
	   
	  
	   
/// 11. grade
 
	   public String myAddition(int marks, char grade) {
		    if (marks < 0 || marks > 100) return "Invalid Marks";
		    if (marks >= 90) return "A";
		    if (marks >= 75) return "B";
		    if (marks >= 35) return "C";
		    return "Fail";
		}
	   
	   
/// 12. divisible 5

	    public boolean myAddition(long n, int divisor) {
	        return divisor != 0 && n % divisor == 0;
	    }
	   
/// 13.print even number

	    public void myAddition(short start, short end) {
	        for (int i = start; i <= end; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i);
	            }
	        }
	    }
	   
	   
//// 14 . Print student details
/// 
	    public void myAddition(String name, int age, char grade) {
	        System.out.println(name + " " + age + " " + grade);
	    }
	   
	   
/// 15 Srint two strings

	   public void myAddition(String a, String b, char op) {
	        System.out.println(a + " " + b);
	    }
	   
	   
	   
/// 16.add four number

  public int myAddition(int a, int b, int c, int d, char op) {
        return a + b + c + d;
    }

	   
/// 17. cube  

	   public int myAddition(int n, char op, boolean cube) {
		    return n * n * n;
		}
	   
	   
	   
/// 18. even or odd

	   public boolean isOdd(long n) {
		    return n % 2 != 0;
		}
	   
	   
/// 19  addition

	   public double myAddition(double m, double n) {
		    return m + n;
		}

	 
	   
/// 20 table 

	   public void myAddition(int n, char op, boolean table, int count) {
		    for (int i = 1; i <= count; i++) {
		        System.out.println(n + " x " + i + " = " + (n * i));
		    }
		}

	   
	   
/// 21  upper case and lower case

	   public String myAddition(char a) {
	        return (a >= 'A' && a <= 'Z') ? "Uppercase" : "Lower";
	    }
	   
	 
/// 22. Positive, Negative or Zero

    public String myAddition(short n, char sign) {
        if (n > 0) return "Positive Number";
        if (n < 0) return "Negative Number";
        return "Zero";
    }
	   
	   
	   
//// 23. divisble by 10 

		public boolean myAddition(long n, char op) {
		    return n % 10 == 0;
		}
	   
	   
/// 24. sum of 1 to n

		public int myAddition(long n, long operation) {
		    int total = 0;

		    for (int i = 1; i <= n; i++) {
		        total += i;
		    }

		    return total;
		}
	   
	   
///  25. sum of even numbers

	   public int myAddition(int n, boolean even, char op) {
	        int total = 0;
	        for (int i = 1; i <= n; i++) {
	            if (even && i % 2 == 0) {
	                total += i;
	            }
	        }
	        return total;
	    }
	   
	   
	   
/// 26 count of even numbers 

	   public int myAddition(int n, short count) {
	        int total = 0;
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) {
	                total++;
	            }
	        }
	        return total;
	    }
	   
	   

	   
	   
}


