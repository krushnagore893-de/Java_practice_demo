
public class Practicle_program {
	public static void main (String[] args) {

/// 6.  Variable Value Exchange		
		int a = 100;
		int b = 200;
		int c;
		
	    c = a;
		a = b;
		b = c;
		
		System.out.println("a ---->" + a);
		System.out.println("b ---->" + b);

/// 7.
System.out.println("\n 7.Different Data Types /////////////");
		    byte age = 21;
	        short salary = 25000;
	        int population = 100000;
	        long phoneNumber = 9876543210L;

	        float height = 5.8f;
	        double price = 999.99;

	        char grade = 'A';
	        boolean isStudent = true;
	        
	        System.out.println("age ---- >" + age);
	        System.out.println("salary ---- >" + salary);
	        System.out.println("population ---- >" + population);
	        System.out.println("phoneNumber ---- >" + phoneNumber);
	        System.out.println("height ---- >" + height);
	        System.out.println("price ---- >" + price);
	        System.out.println("grade ---- >" + grade);
	        System.out.println("isStudent ---- >" + isStudent);
		
	}
}
