import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        short age = sc.nextShort();

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();

        System.out.print("Enter Student Percentage: ");
        float percentage = sc.nextFloat();

        System.out.print("Enter Student Fees: ");
        double fees = sc.nextDouble();

        System.out.print("Is Student Active? ");
        boolean isActive = sc.nextBoolean();

        System.out.print("Enter Student Grade: ");
        char grade = sc.next().charAt(0);

        System.out.println("\n----- Student Information -----");

        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Student ID : " + studentId);
        System.out.println("Percentage : " + percentage);
        System.out.println("Fees       : " + fees);
        System.out.println("Active     : " + isActive);
        System.out.println("Grade      : " + grade);

        sc.close();
    }
}