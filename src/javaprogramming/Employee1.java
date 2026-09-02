package javaprogramming;

public class Employee1 {
	void Employeename() {
		System.out.println("Employee name:vishwa");
	}
    void EmployeeId() {
    	System.out.println("Employee Id : 24A51F0048");
    }
    void Department() {
    	System.out.println("Department Name: Master of computer applications");
    }
    void Salary() {
    	System.out.println("Salaray : 10LPA");
    }
    void Experience() {
    	System.out.println("Experience : Fresher");
    }
    void CompanyName() {
    	System.out.println("Company Name : Apple");
    }
	public static void main(String[] args) {
		System.out.println("--------Employee Details---------");
		Employee1 e=new Employee1();
		e.Employeename();
		e.EmployeeId();
		e.Department();
		e.Salary();
		e.Experience();
		e.CompanyName();
		System.out.println("---------Done---------------");

	}

}
