package javaprogramming;

public class LoanManagement {
	String customerName;
	double loanAmount;
	double interestRate;
	int loanTenure;
	double calculateInterest(double loanamount,double intrestRate) {
		double interest=(loanAmount*interestRate*loanTenure)/100;
		return interest;
	}
	double calculateTotalAmount(double interest) {
		double totalamount=loanAmount+interest;
		return totalamount;
	}
	double calculateMonthlyEMI(double totalamount,double loanTenure) {
		double monthlyEmi=totalamount/(loanTenure*12);
		return monthlyEmi;
	}
    void displayLoanSummary(double interest,double totalamount,double EMI) {
    	System.out.println("Customer Name:"+customerName);
    	System.out.println("Loan Amount:"+loanAmount);
    	System.out.println("Intrest Rate:"+interestRate);
    	System.out.println("Loan Tenure:"+loanTenure);
    	System.out.println("Interest:"+interest);
    	System.out.println("Total Amount:"+totalamount);
    	System.out.println("Monthly EMI's:"+EMI);
    	
    }
	public static void main(String[] args) {
		LoanManagement obj1=new LoanManagement();
		obj1.customerName="vishwa";
		obj1.loanAmount=2000;
		obj1.interestRate=10;
		obj1.loanTenure=2;
		double intrest=obj1.calculateInterest(2000, 10);
		double totalAmount=obj1.calculateTotalAmount(intrest);
		double monthlyEmi=obj1.calculateMonthlyEMI(totalAmount, 10);
		System.out.println("========== LOAN DETAILS 1 ==========");
		obj1.displayLoanSummary(intrest, totalAmount, monthlyEmi);
		LoanManagement obj2=new LoanManagement();
		obj2.customerName="chitti";
		obj2.loanAmount=100000;
		obj2.interestRate=2;
		obj2.loanTenure=4;
		double interest=obj2.calculateInterest(100000,2);
		double totalAmount1=obj2.calculateTotalAmount(intrest);
		double monthlyEmi1=obj2.calculateMonthlyEMI(totalAmount1, 2);
		System.out.println("========== LOAN DETAILS 2 ==========");
		obj2.displayLoanSummary(intrest, totalAmount1, monthlyEmi);
	}

}
