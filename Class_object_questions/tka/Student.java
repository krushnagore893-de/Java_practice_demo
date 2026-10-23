package com.tka;

public class Student {

	int studentId;
	String studentName;
	int age;
	String gender;
	String course;
	String department;
	double marks;
	String email;
	String phoneNumber;
	String city;
	String address;
	String state;
	String collegeName;
	int passingYear;
	boolean isActive;

	public static void studentStudy() {
		System.out.println("Student is studying");
	}

	public static void studentPlay() {
		System.out.println("Student is playing");
	}

	public static void studentWriteExam() {
		System.out.println("Student is writing an exam");
	}

	public static void studentCompleteProject() {
		System.out.println("Student completed the project");
	}

	public static void studentPayFees() {
		System.out.println("Student paid the fees");
	}

	 public void display() {

	        System.out.println("StudentId -----> " + studentId);
	        System.out.println("StudentName -----> " + studentName);
	        System.out.println("Age -----> " + age);
	        System.out.println("Gender -----> " + gender);
	        System.out.println("Course -----> " + course);
	        System.out.println("Department -----> " + department);
	        System.out.println("Marks -----> " + marks);
	        System.out.println("Email -----> " + email);
	        System.out.println("PhoneNumber -----> " + phoneNumber);
	        System.out.println("City -----> " + city);
	        System.out.println("Address -----> " + address);
	        System.out.println("State -----> " + state);
	        System.out.println("CollegeName -----> " + collegeName);
	        System.out.println("PassingYear -----> " + passingYear);
	        System.out.println("IsActive -----> " + isActive);

	        studentStudy();
	        studentPlay();
	        studentWriteExam();
	        studentCompleteProject();
	        studentPayFees();
	    }
}
