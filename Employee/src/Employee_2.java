public class Employee_2 {
	public static void main (String []args) {
		
		int salary = 50000;
		int bonus = 5000;
		int tax = 3000;
		
		int totalSalary = salary + bonus;
		int finalSalary = totalSalary - tax;
		
		System.out.println("Salary --->"+ salary);
		System.out.println("Bonus --->"+bonus);
		System.out.println("Tax --->"+ tax);
		System.out.println("totalSalary ---->" + totalSalary);
		System.out.println(finalSalary);	
	}
}
