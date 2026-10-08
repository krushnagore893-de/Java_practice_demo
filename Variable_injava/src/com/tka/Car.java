package com.tka;

public class Car {

    static String brand = "Toyota";
    static String model = "Fortuner";
    static int year = 2025;
    static String color = "Black";
    static double price = 3500000;

    static String insuranceNumber;
    static String pollutionCertificate;
    static String secondOwner;
    static long loanAmount;
    static String previousOwner;

    static String fuelType = "Diesel";
    static int Capacity = 7;
    static String city = "Pune";
    static long engineNumber = 123456789L;
    static boolean available = true;

    public static void main(String[] args) {

        System.out.println("brand ---> " + brand);
        System.out.println("model ---> " + model);
        System.out.println("year ---> " + year);
        System.out.println("color ---> " + color);
        System.out.println("price ---> " + price);

        System.out.println("insuranceNumber ---> " + insuranceNumber);
        System.out.println("pollutionCertificate ---> " + pollutionCertificate);
        System.out.println("secondOwner ---> " + secondOwner);
        System.out.println("loanAmount ---> " + loanAmount);
        System.out.println("previousOwner ---> " + previousOwner);

        System.out.println("fuelType ---> " + fuelType);
        System.out.println("seatingCapacity ---> " + Capacity);
        System.out.println("city ---> " + city);
        System.out.println("engineNumber ---> " + engineNumber);
        System.out.println("available ---> " + available);
    }
}