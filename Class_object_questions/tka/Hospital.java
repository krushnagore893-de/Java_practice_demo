package com.tka;

public class Hospital {

    int hospitalId;
    String hospitalName;
    String doctorName;
    String specialization;
    int totalBeds;
    int availableBeds;
    String patientName;
    int patientAge;
    String patientGender;
    String disease;
    String city;
    String address;
    String phoneNumber;
    double billAmount;
    boolean isOpen;

    
    
    public static void admitPatient() {
        System.out.println("Patient admitted successfully");
    }

    public static void dischargePatient() {
        System.out.println("Patient discharged successfully");
    }

    public static void checkupPatient() {
        System.out.println("Patient checkup is completed");
    }

    public static void provideMedicine() {
        System.out.println("Medicine provided to patient");
    }

    public static void collectBill() {
        System.out.println("Hospital bill collected");
    }

    public void display() {
        System.out.println("Hospital ID  -----> " + hospitalId);
        System.out.println("Hospital Name  -----> " + hospitalName);
        System.out.println("Doctor Name  -----> " + doctorName);
        System.out.println("Specialization  -----> " + specialization);
        System.out.println("Total Beds  -----> " + totalBeds);
        System.out.println("Available Beds  -----> " + availableBeds);
        System.out.println("Patient Name  -----> " + patientName);
        System.out.println("Patient Age  -----> " + patientAge);
        System.out.println("Patient Gender  -----> " + patientGender);
        System.out.println("Disease  -----> " + disease);
        System.out.println("City  -----> " + city);
        System.out.println("Address  -----> " + address);
        System.out.println("Phone Number  -----> " + phoneNumber);
        System.out.println("Bill Amount  -----> " + billAmount);
        System.out.println("Hospital Open  -----> " + isOpen);

        admitPatient();
        dischargePatient();
        checkupPatient();
        provideMedicine();
        collectBill();
    }
}
