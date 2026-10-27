package oops;

public class BankAccount {
	private String accountHoldername;
	private double balance;
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername=accountHoldername;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}

}
