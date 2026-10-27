package oops;

public class Bankaccount2 {

	public static void main(String[] args) {
	  BankAccount obj=new BankAccount();
	  obj.setAccountHoldername("vishwa");
	  obj.setBalance(100000.00);
	  System.out.println("Account HolderName:"+obj.getAccountHoldername());
	  System.out.println("Account Balance:"+obj.getBalance());
	  

	}

}
