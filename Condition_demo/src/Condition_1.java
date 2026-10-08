import java.util.Scanner;
public class Condition_1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your marks :");
		int marks = sc.nextInt();
		if (marks >= 40) {
			System.out.println("pass");
		} else if (marks == 0) {
			System.out.println("Zero");
		} else {
			System.out.println("Fail");
		}
	}
}
