package oops;
class User{
	String username;
	String password;
	User(String username,String password){
		this.username=username;
		this.password=password;
	}
	void displayDetails() {
		System.out.println("Username:"+username);
	}
}
class Student extends User{
	Student(String username,String password){
		super(username,password);
	}
	void submitAssignment() {
		System.out.println(username+"Submitted the Assignmenet Sucessfully.");
	}
}
	class Instructor extends User{
		Instructor(String username,String password){
			super(username,password);
		}
		void createCourse() {
			System.out.println(username+"Create a New Course");
		}
	}
	class Admin extends User{
		Admin(String username,String password){
			super(username,password);
		}
		void manageUsers() {
			System.out.println(username+" is Managing Users");
		}
	}

public class OnlineLearningPlatform {

	public static void main(String[] args) {
		Student s=new Student("Vishwa","9870");
		Instructor i=new Instructor("Chitti","1234");
		Admin a = new Admin("Lohi","admin0987");
		System.out.println("----Student Details------");
		s.displayDetails();
		s.submitAssignment();
		System.out.println("----Instructor Details--------");
		i.displayDetails();
		i.createCourse();
		System.out.println("-----Admin Details--------");
        a.displayDetails();
        a.manageUsers();
	}

}
