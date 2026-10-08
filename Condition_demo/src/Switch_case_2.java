import java.util.Scanner;
public class Switch_case_2 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your browser :");
		String browser = sc.nextLine();
		
		switch (browser) {
			case "chrome" :
				System.out.println("chrome browser");
			break ;
			
			case "firefox" :
				System.out.println("firefox browser");
			break;
			
			case "edge" :
				System.out.println("edge browser");
			break ;
			
			case "chakra" :
				System.out.println("chakra browser");
			break;
			
			default :
				System.out.println("unknown browser");
		}
	}
}
