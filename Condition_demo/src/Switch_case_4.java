import java.util.Scanner;
public class Switch_case_4 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide"); 
		
		System.out.println("Enter your choice :");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 :
			System.out.println("your selected Add");
		break;
		
		case 2:
			System.out.println("your selected Subtract");
		break;
		
		case 3 :
			System.out.println("your selected Multiply");
		break;
		
		case 4:
			System.out.println("your selected Divide");
		break;
		
		default :
			System.out.println("Invalid choice");
		
		
		}
		
		
	}
}
