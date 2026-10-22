package com.tka;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("Employee -----------------------------------------\n");

		
		Employee emp = new Employee();

		emp.employeeId = 101;
		emp.employeeName = "Krushna";
		emp.age = 21;
		emp.gender = "Male";
		emp.department = "IT";
		emp.salary = 35000;
		emp.email = "krushna@gmail.com";
		emp.phoneNumber = "9876543210";
		emp.city = "Pune";
		emp.address = "Pimpri";
		emp.state = "Maharashtra";
		emp.joiningDate = "21-10-2026";
		emp.companyName = "TKA Technologies";
		emp.is_Active = true;

		emp.display();
		
		

		System.out.println("-----------------------------------------\n");
		System.out.println("vehicle -----------------------------------------\n");

		Vehicle v = new Vehicle();

		v.vehicleId = 101;
		v.vehicleName = "Swift";
		v.brand = "Maruti Suzuki";
		v.model = "VXI";
		v.color = "White";
		v.price = 750000;
		v.vehicleType = "Car";
		v.fuelType = "Petrol";
		v.seatingCapacity = 5;
		v.registrationNumber = "MHDE2732";
		v.ownerName = "Krushna";
		v.city = "Sambhajinagar";
		v.manufacturingYear = 2026;
		v.isElectric = false;
		v.isAvailable = true;

		v.display();
		
		

		System.out.println("-----------------------------------------\n");
		System.out.println("Library  -----------------------------------------\n");
		
		
		Library lib = new Library();
		
        lib.libraryId = 1;
        lib.libraryName = "Pune Library";
        lib.bookName = "Java Programming";
        lib.authorName = "James Gosling";
        lib.publisher = "Tech Publications";
        lib.bookCategory = "Programming";
        lib.bookPrice = 650;
        lib.totalBooks = 5000;
        lib.availableBooks = 120;
        lib.memberName = "Krushna";
        lib.isAvailable = true;
        
        lib.display();
        
        
        System.out.println("-----------------------------------------\n");
		System.out.println("Student  -----------------------------------------\n");
		
        
        Student s = new Student();
        
        s.studentId = 101;
        s.studentName = "Krushna";
        s.age = 21;
        s.gender = "Male";
        s.course = "BCA";
        s.department = "Computer Applications";
        s.marks = 85.5;
        s.email = "krushna@gmail.com";
        s.phoneNumber = "9876543210";
        s.city = "sambhajinagar";
        s.address = "sambhajinagar Maharashtra";
        s.state = "Maharashtra";
        s.collegeName = "ABC College";
        s.passingYear = 2028;
        s.isActive = true;
        
        s.display();

        
        

		System.out.println("-----------------------------------------\n");
		System.out.println("hospital  -----------------------------------------\n");
		

        Hospital h = new Hospital();

        h.hospitalId = 101;
        h.hospitalName = "City Care Hospital";
        h.doctorName = "Dr. Rahul";
        h.specialization = "Cardiology";
        h.totalBeds = 100;
        h.availableBeds = 25;
        h.patientName = "Amit";
        h.patientAge = 35;
        h.patientGender = "Male";
        h.disease = "Heart Problem";
        h.city = "Pune";
        h.address = "Pimpri";
        h.phoneNumber = "9876543210";
        h.billAmount = 15000.50;
        h.isOpen = true;

        h.display();
        


		
	}
}
