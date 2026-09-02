package javaprogramming;

public class Atm {
	static String bankName;
	long accountNumber;
	double balance;
	void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Deposit amount:"+balance);
	}
	void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Withdraw amount:"+balance);	
	}
	void checkBalance() {
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Bank Name:"+ bankName);
		System.out.println("Account Total Balance:"+balance);
	}

	public static void main(String[] args) {
		bankName="SBI";
		Atm a1=new Atm();
		Atm a2=new Atm();
		System.out.println("----account,1 details -------");
		a1.accountNumber=987654321L;
		a1.balance=0;
		a1.deposit(2000);
		a1.withdraw(1000);
		System.out.println("----account,2 details -------");
		a2.accountNumber=123456789L;
		a2.balance=0;
		a2.deposit(2000);
		a2.withdraw(1000);
		System.out.println("----account-1-------");
		a1.checkBalance();
		System.out.println("----account-2-------");
		a2.checkBalance();
		

	}

}
