package javaprogramming;

public class Employee2 {
	static String companyName;
	int employeeId;
	String employeeName;
	double salary;
	void addBonus(double bonus) {
		salary=salary+bonus;
		System.out.println("Bonus Added:"+ bonus);
	}
	void deductSalary(double amount ) {
		 salary = salary - amount;
		 System.out.println("Deducter balance:"+amount);
	}
	void displayDetails() {
		System.out.println("Employee Id:"+employeeId);
		System.out.println("Employee Name:"+ employeeName);
		System.out.println("Employee Salary:"+ salary);
	}

	public static void main(String[] args) {
		companyName="Google";
		System.out.println("--------employee=1--------");
		Employee2 e1=new Employee2();
		e1.employeeId=101;
		e1.employeeName="chitti";
		e1.salary=20000.45;
		e1.addBonus(10000);
		e1.deductSalary(100.65 );
		e1.displayDetails();
		System.out.println("--------employee=2--------");
		Employee2 e2=new Employee2();
		e2.employeeId=102;
		e2.employeeName="chitti-2";
		e2.salary=200000.45;
		e2.addBonus(100000);
		e2.deductSalary(1000.65 );
		e2.displayDetails();

	}

}
