package com.tka;

public class Vehicle {

	int vehicleId;
	String vehicleName;
	String brand;
	String model;
	String color;
	double price;
	String vehicleType;
	String fuelType;
	int seatingCapacity;
	String registrationNumber;
	String ownerName;
	String city;
	int manufacturingYear;
	boolean isElectric;
	boolean isAvailable;

	public static void vehicleStart() {
		System.out.println("vehicle is starting");
	}

	public static void vehicleStop() {
		System.out.println("vehicle is stopping");
	}

	// Method 3
	public static void vehicleAccelerate() {
		System.out.println("vehicle is accelerating");
	}

	public static void vehicleBrake() {
		System.out.println("vehicle brakes applied");
	}

	public static void vehicleHorn() {
		System.out.println("vehicle horn is blowing");
	}

	public void display() {
		
        System.out.println("vehicle ID -----> " + vehicleId);
        System.out.println("vehicle Name -----> " + vehicleName);
        System.out.println("brand -----> " + brand);
        System.out.println("model -----> " + model);
        System.out.println("color -----> " + color);
        System.out.println("price -----> " + price);
        System.out.println("vehicle Type -----> " + vehicleType);
        System.out.println("fuel Type -----> " + fuelType);
        System.out.println("seating Capacity -----> " + seatingCapacity);
        System.out.println("registration Number -----> " + registrationNumber);
        System.out.println("owner Name  -----> " + ownerName);
        System.out.println("city -----> " + city);
        System.out.println("manufacturing Year -----> " + manufacturingYear);
        System.out.println("electric -----> " + isElectric);
        System.out.println("available -----> " + isAvailable);

        vehicleStart();
        vehicleStop();
        vehicleAccelerate();
        vehicleBrake();
        vehicleHorn();
        
      }
	
}
