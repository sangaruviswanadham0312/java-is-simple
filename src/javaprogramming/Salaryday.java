package javaprogramming;
import java.util.Scanner;

public class Salaryday {
	Scanner sc=new Scanner(System.in);
	double getBascisalary(){
		System.out.println("Enter salary:");
		double salary=sc.nextDouble();
		return salary;
	}
	double getHRA() {
		System.out.println("Enter working hours:");
		double hours=sc.nextDouble();
		return hours;
	}
	double getBonus() {
		System.out.println("Enter bonus");
		double bonus=sc.nextDouble();
		return bonus;
	}
	double getTax() {
		System.out.println("Enter your tax:");
		double tax=sc.nextDouble();
		return tax;
	}
	double getPf() {
		System.out.println("Enter your pf:");
		double pf=sc.nextDouble();
		return pf;
	}
	

	public static void main(String[] args) {
		Salaryday s=new Salaryday();
		double salary=s.getBascisalary();
		double hours=s.getHRA();
		double bonus=s.getBonus();
		double tax=s.getTax();
		double Pf=s.getPf();
		System.out.println("salary:"+salary);
		System.out.println("working hours:"+hours);
		System.out.println("get bonus:"+bonus);
		System.out.println("get tax:"+tax);
		System.out.println("get PF:"+Pf);

	}

}
