package oops;

public class Employe {
	String employeeName;
	int employeeId;
	Employe(String employeeName,int employeeId){
		this.employeeName=employeeName;
		this.employeeId=employeeId;
	}
	public double calculateSalary() {
		return 0;
	}
	public void displaydetails() {
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Employee Id;"+employeeId);
	}
	

}
