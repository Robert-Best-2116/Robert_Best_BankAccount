
public class BankAccount {
	private double checkingBalance = 0.0;
	private double savingsBalance = 0.0;
	private static int totalAccounts = 0;
	private static double totalMoney = 0.0;
	

	//public BankAccount() {
		//totalAccounts;
	//}
	
	public BankAccount(double initalChecking, double initalSavings) {
		checkingBalance = initalChecking;
		savingsBalance = initalSavings;
		totalAccounts++;
		totalMoney = checkingBalance +  savingsBalance;
	}

	// Getters
	
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public static int getTotalAccounts() {
		return totalAccounts;
	}

	public static double getTotalMoney() {
		return totalMoney;
	}
	
	
	//Setters

	private void setCheckingBalance(double deposit) {
		this.checkingBalance += deposit;
		
	}

	private void setSavingsBalance(double savingsBalance) {
		this.savingsBalance += savingsBalance;
	}
	private void setCheckingBalanceWithdraw(double deposit) {
		this.checkingBalance -= deposit;
		
	}

	private void setSavingsBalanceWithdraw(double savingsBalance) {
		this.savingsBalance -= savingsBalance;
	}
	
	//methods
	public void deposit(double depositAmount, String account) {
		if (account.equals("checking")) {
			//this.checkingBalance += depositAmount;
			this.setCheckingBalance(depositAmount);
			System.out.println(checkingBalance);
			this.totalMoney += depositAmount;
		}
		else if(account.equals("savings")) {
			//this.savingsBalance += depositAmount;
			this.setSavingsBalance(depositAmount);
			System.out.println(savingsBalance);
			this.totalMoney += depositAmount;
		}
	} 
		
	public void withdraw(double withdrawAmount, String account) {
		if (account.equals("checking")) {
			if (this.checkingBalance - withdrawAmount >= 0) {
				this.setCheckingBalanceWithdraw(withdrawAmount);
				System.out.println(checkingBalance);
				this.totalMoney -= withdrawAmount;
			}
			else {
				System.out.println("Insuffent Funds");
			}
		}
		else if(account.equals("savings")) {
			if (this.savingsBalance - withdrawAmount >= 0) {
				this.setSavingsBalanceWithdraw(withdrawAmount);
				System.out.println(savingsBalance);
				this.totalMoney -= withdrawAmount;
			}
			else {
				System.out.println("Insuffent Funds");
			}
		}
	}
		
}

