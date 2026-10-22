package com.tka;

public class Employee {


	int employeeId;
	String employeeName;
	int age;
	String gender;
	String department;
	double salary;
	String email;
	String phoneNumber;
	String city;
	String address;
	String state;
	String joiningDate;
	String companyName;
	boolean is_Active;

	public static void empWorking() {
		System.out.println("Employee is working");

	}

	public static void attendMeeting() {
		System.out.println("Employee is attending a meeting.");
	}

	public static void empBreak() {
		System.out.println("Employee is taking a break");
	}

	public static void empProject() {
		System.out.println("Employee is working on a project");
	}

	public static void empTask() {
		System.out.println("Employee completed the task");
	}
	
	public void display() {
		System.out.println("EmployeeId ----> " + employeeId);
		System.out.println("employeeName ----> " + employeeName );
		System.out.println("age ----> " + age);
		System.out.println("gender ----> " + gender);
		System.out.println("department ----> " + department);
		System.out.println("salary ----> " + salary);
		System.out.println("email ----> " + email);
		System.out.println("phoneNumber ----> " + phoneNumber);
		System.out.println("city ----> " + city);
		System.out.println("address ----> " + address);
		System.out.println("state ----> " + state);
		System.out.println("joiningDate ----> " + joiningDate);
		System.out.println("companyName ----> " + companyName);
		System.out.println("is_Active ----> " + is_Active);
		empWorking();
		attendMeeting();
		empBreak();
		empProject();
		empTask();
	}

}
