class Employee_1 {
	int id ;
	String name;
	double salary;
	
	void displayDetails(){
		System.out.println("Employee Id :" + id);
		System.out.println("Employee name :" + name);
		System.out.println("Employee Salary :" + salary);
	}
}

public class Employee {
	public static void main (String[] args) {
		Employee_1 emp = new Employee_1();
		
		emp.id = 101;
		emp.name = "krushna";
		emp.salary = 50000;
		
		emp.displayDetails();	
	}
}
