
public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount(100.00, 100.00);
		double checking1 = account1.getCheckingBalance();
		double savings1 = account1.getSavingsBalance();
		double allMoney1 = account1.getTotalMoney();
		
		
		// Checking & Savings Tests
		System.out.println("Checking Account Ballance: " + checking1);
		System.out.println("Savings Account Ballance: " + savings1);
		System.out.println("Total Account Ballance: " + allMoney1);
		
		//Deposit checking test
		account1.deposit(50.00, "checking");
		System.out.println("Total Account Ballance: " + account1.getTotalMoney());
		
		//Withdraw test
		account1.withdraw(100, "checking");
		account1.withdraw(100, "checking");
		System.out.println("Total Account Ballance: " + account1.getTotalMoney());
	}
}
