package oops;
class Payment{
	String customerName;
	double amount;
	Payment(String customerName,double amount){
		this.customerName=customerName;
		this.amount=amount;
	}
	void makePayment() {
		System.out.println("Payment Details");
	}
}
class UPIPayment extends Payment{
	String upiId;
	UPIPayment(String customerName,double amount,String upiId){
		super(customerName,amount);
		this.upiId=upiId;
	}
	@Override
	void makePayment() {
		System.out.println("--UPI Payment---");
		System.out.println("Customer Name:"+customerName);
		if (upiId.contains("@")) {
			System.out.println("UPI Id:"+upiId);
			System.out.println("Payment Sucessful!");
			System.out.println("Amount:"+amount);
		}else {
			System.out.println("Invalid UPI Id");
		}
	}
}
class CardPayment extends Payment{
	String cardNumber;
	String cvv;
	CardPayment(String customerName,double amount,String cardNumber,String cvv){
		super(customerName,amount);
		this.cardNumber=cardNumber;
		this.cvv=cvv;
	}
	@Override
	void makePayment() {
		System.out.println("---Card Payment---");
		System.out.println("Customer Name:"+customerName);
		if(cardNumber.matches("\\d{16}")&&cvv.matches("\\d{3}")) {
			System.out.println("Card Number:"+"**** **** **** "+cardNumber.substring(12));
			System.out.println("Payment Sucessful");
			System.out.println("Amount:"+amount);
		}else {
			System.out.println("Invalid Card Number or CVV");
		}
	}
}
class CashPayment extends Payment{
	double cashGiven;
	CashPayment(String customerName,double amount,double cashGiven){
		super(customerName,amount);
		this.cashGiven=cashGiven;
	}
	@Override
	void makePayment() {
		System.out.println("---Cash Payment---");
		System.out.println("Customer Name:"+customerName);
		if(cashGiven>=amount) {
			double balance=cashGiven-amount;
			System.out.println("Payment Sucessful");
			System.out.println("Amount:"+amount);
			System.out.println("Cash Given:"+cashGiven);
			System.out.println("Remining Balance:"+balance);
		}else {
			System.out.println("Insufficent Funds");
			System.out.println("Required Amount");
			System.out.println("Cash Given:"+cashGiven);
		}
	}
}

public class PaymentMethod {

	public static void main(String[] args) {
		UPIPayment u=new UPIPayment("Yamini",10000,"yam@union");
		CardPayment p = new CardPayment("Vishwa", 2000, "1234567812345679", "123");
		CashPayment c = new CashPayment("Komalika",5000,7000);
	    u.makePayment();
	    p.makePayment();
	    c.makePayment();

	}

}
