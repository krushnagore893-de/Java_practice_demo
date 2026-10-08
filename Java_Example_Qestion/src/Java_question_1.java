import java.util.Scanner;

public class Java_question_1 {
	public static void main(String[] args) {
	
	 Scanner sc = new Scanner (System.in);
	 
	 int correctPin = 1234;
	 double balance = 10000.10;
	 
	 System.out.println("Enter your PIN :");
	 int pin = sc.nextInt();
	 
	 if (pin == correctPin) {
		 System.out.println("\n1. Cheack Balance :");
		 System.out.println("2. Witdhraw :");
		 System.out.println("3. deposite :");
		 System.out.println("4. Exist:");
		 
		 System.out.println("Enter your choice :");
		 
		 int choice = sc.nextInt();
		 
		 if (choice == 2) {
			 System.out.println("Your balance = $ " + balance);
			 
		 } else if (choice == 2) {
			 System.out.println("Enter witdhraw amount :");
			 double amount = sc.nextDouble();
			 
			 if (amount <= balance) {
				 balance = balance - amount;
				 System.out.println("Withdraw amount succesfully !");
				 System.out.println("Remaining Balance = $ " + balance);
			 } else {
				 System.out.println("Insufficient balance !");
			 }
		 } else if(choice == 3) {
			 
			 System.out.print("Enter deposit amount: ");
             double amount = sc.nextDouble();

             balance = balance + amount;

             System.out.println("Deposit successful!");
             System.out.println("Updated Balance = ₹" + balance);

			 
		 } else if(choice == 4) {
			 System.out.println("Thank you! Visit Again.");
		 } else {

             System.out.println("Invalid choice!");

         } 
		 
	 } else {

         System.out.println("Incorrect PIN!");

     }

	 
}
}
