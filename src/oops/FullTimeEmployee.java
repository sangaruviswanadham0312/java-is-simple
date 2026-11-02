package oops;

public class FullTimeEmployee extends Employe {
         double monthlySalary;
         FullTimeEmployee(String name,int id,double salary){
        	 super(name,id);
        	 this.monthlySalary=monthlySalary;
         }
         @Override
         public double calculateSalary() {
     		return monthlySalary ;
     	}
         @Override
         public void displaydetails() {
        	 super.displaydetails();
        	 System.out.println("monthly Salary:"+calculateSalary());
         }
         
         
}
