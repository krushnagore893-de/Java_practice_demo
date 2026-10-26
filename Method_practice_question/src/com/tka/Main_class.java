package com.tka;

public class Main_class {

	public static void main(String[] args) {
		
		//// 1. Atm amount
		System.out.println("1.atm -- > \n");
		Atm_program atm = new Atm_program();
		
		atm.checkBalance(25000.0);
		atm.withdrawAmount(5000);
		System.out.println(" \n");
		
		
		//// 2.persentage
		
		System.out.println("2.persentage -- > \n");
		
		Student_details student = new Student_details();
		
		int result = student.calculatPercentage(79, 65,89);
		System.out.println(result);
		
		
		
		//// 3. mobile recharge
		
		System.out.println("2.Mobile recharge -- > \n");
		
		Mobile m = new Mobile();
		
		double display = m.recharge(300);
		System.out.println(display);
		System.out.println(" \n");
		
		
		//// 4.login ..
		

		System.out.println("5.Login  -- > \n");
		
		Login l1 = new Login();
		
		String name = l1.login("krushna", "krushna@123");
		System.out.println(name);
		System.out.println(" \n");
		
		
		//// 5. E-commerse
		
		System.out.println("6: E-commerse  -- > \n");
		
		Ecommerce  d = new Ecommerce();
		
		double result1 = d.calculateDiscount(1000);
		System.out.println(result1);
		
		
		
	//// 6. Employee 
		
			System.out.println("6: Employee  -- > \n");
			
			Employee e = new Employee();
			
			double result3 = e.calculateSalary(1234567);
			System.out.println(result3);
		
			
	
			/// 7.Temperature
			
			System.out.println("7: Temperature  -- > \n");
			
			 Temperature t = new Temperature();

		        double result5= t.temperature(25);

		        System.out.println("Fahrenheit: " + result5);
			
		
		
		

	}
}
