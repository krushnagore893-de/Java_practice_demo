package com.tka;

public class Main_class {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setEmployeeId(101);
        emp.setEmployeeName("Krushna");
        emp.setAge(21);
        emp.setGender("Male");
        emp.setDepartment("IT");
        emp.setDesignation("Java Developer");
        emp.setSalary(35000);
        emp.setEmail("krushnagore@.com");
        emp.setPhoneNumber("9323456787");
        emp.setAddress("Sambhajinagar");
        emp.setCity("sambhajinagar");
        emp.setState("Maharashtra");
        emp.setCompanyName("Accencture");
        emp.setExperience(1);
        emp.setPermanent(true);
        
        
        System.out.println("Employee ID  ---->" + emp.getEmployeeId());
        System.out.println("Name   ---->" + emp.getEmployeeName());
        System.out.println("Age  ----> " + emp.getAge());
        System.out.println("Gender   -----> " + emp.getGender());
        System.out.println("Department  -----> " + emp.getDepartment());
        System.out.println("Designation -----> " + emp.getDesignation());
        System.out.println("Salary -----> " + emp.getSalary());
        System.out.println("Email -----> " + emp.getEmail());
        System.out.println("Phone -----> " + emp.getPhoneNumber());
        System.out.println("Address -----> " + emp.getAddress());
        System.out.println("City -----> " + emp.getCity());
        System.out.println("State -----> " + emp.getState());
        System.out.println("Company -----> " + emp.getCompanyName());
        System.out.println("Experience -----> " + emp.getExperience());
        System.out.println("Permanent -----> " + emp.getIsPermanent());
	}
}
