package javaprogramming;

public class Employee {
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	Employee(int id,String name){
		this(id,name,50000);
	}
	void display() {
		System.out.println("Employee Id:"+id);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Salary:"+salary);
	}
	public static void main(String[] args) {
		Employee obj=new Employee(101,"vishwa",5000);
        obj.display();
        Employee obj1= new Employee(102,"chitti");
        obj1.display();
        Employee obj2= new Employee(103,"subbu",20000);
        obj2.display();	
        
	}

}
