package javaprogramming;
import java.util.Scanner;

public class Bank {
	static void customerName(String name) {
		System.out.println("Customer Name:"+name);
	}
	static void accountNumber(long accountNo) {
		System.out.println("Account Number:"+accountNo);
	}
	static void balance(double amount) {
		System.out.println("Balance:"+ amount );
	}
	static void bankname(String bank) {
		System.out.println("bank Name:"+bank);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter customer name:");
		String name=sc.nextLine();
		System.out.println("Enter account number:");
		long accountNo=sc.nextLong();
		System.out.println("Enter amount:");
		double amount=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter bank name:");
		String bank=sc.nextLine();
		System.out.println("-----bank details------");
		customerName(name);
		accountNumber(accountNo);
		balance(amount);
		bankname(bank);
		

	}

}
