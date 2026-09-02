package javaprogramming;

public class Methods {
	public static void main(String[] args) {
		System.out.println("main method starts");
		welcome();
		Methods e1=new Methods();
		e1.welcome2();
		
		System.out.println("main method ended");
	}

	

	public static void welcome() {
		System.out.println("welcome to vcube");
	}
	void welcome2() {
		
		System.out.println("show your id number");
	}
	
}
