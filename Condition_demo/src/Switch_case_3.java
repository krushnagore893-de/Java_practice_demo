import java.util.Scanner;
public class Switch_case_3 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your grade :");
		
		char grade = sc.next().charAt(0);
		
		switch (grade) {
		case 'A' :
			System.out.println("Extelent");
		break ;
		
		case 'B' :
			System.out.println("very Good");
		break;
		
		case 'C' :
			System.out.println("good");
		break;
		
		default :
			System.out.println("Invalid grade");
		}
		
		
	}
}
