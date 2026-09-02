package javaprogramming;

public class Method2 {
public static void welcome() {
   System.out.println("welcom to hyd");
	}
public static void hello() {
	System.out.println("hello how are you");
}
public static void goodMoring() {
	System.out.println("good mrng hyd");
}
public static void goodAfternoon() {
	System.out.println("good aftternoon palasa");
}
public static void goodEvening() {
	System.out.println("goodEvening vizag");
}
public static void displayName() {
	System.out.println("my name is chitti");
}
public static void displayAge() {
	System.out.println("my age is 23");
}
void displayGender() {
	System.out.println("Male");
}
void displayCollege() {
	System.out.println("AITAM");
}
void displayBranch() {
	System.out.println("MCA");
}
void displayStudentId() {
	System.out.println("24A51F0048");
}
	public static void main(String[] args) {
		System.out.println("main method started");
		welcome();
		hello();
		goodMoring();
		goodAfternoon();
		goodEvening();
		displayName();
		displayAge();
		Method2 m1=new Method2();
		m1.displayGender();
		m1.displayCollege();
		m1.displayBranch();
		m1.displayStudentId();
		System.out.println("main method ended");

	}

}
