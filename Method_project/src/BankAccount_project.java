class BankAccount {
	private double balance;
	
	public double getBalance() {
		return balance;
		
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
		} else {
			System.out.println("Invalid amount");
		}
	}
	
	public void withdraw (double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount ;
		} else {
			System.out.println("Invalid withdraw");
		}
	}
}
public class BankAccount_project {
	public static void main (String[] args) {
		
		BankAccount account = new BankAccount();
		
		account.deposit(10000);
		account.withdraw(3000);
		
		System.out.println("Balance :" + account.getBalance());
		
	}
}
