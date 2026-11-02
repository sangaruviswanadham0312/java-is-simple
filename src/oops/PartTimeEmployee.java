package oops;

public class PartTimeEmployee extends Employe {
	double hourlyRate;
	int workingHours;
	PartTimeEmployee(String name,int id,double hourlyRate,int workingHours){
		super(name,id);
		this.hourlyRate=hourlyRate;
		this.workingHours=workingHours;
	}
	@Override
	public double calculateSalary() {
		return hourlyRate*workingHours;
	}
	@Override
	public void displaydetails() {
		super.displaydetails();
		System.out.println("Part Time Salary:"+calculateSalary());
		
	}

}
