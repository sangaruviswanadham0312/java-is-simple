package oops;

public class Employeee {

	public static void main(String[] args) {
		FullTimeEmployee f=new FullTimeEmployee("vishwa",101,200000);
		PartTimeEmployee p=new PartTimeEmployee("chitti",102,200,50);
		f.displaydetails();
		System.out.println("-------------------------");
		p.displaydetails();
	}

}
