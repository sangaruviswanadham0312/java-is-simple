package javaprogramming;

public class Student1 {
	Integer StudentId;
	String StudentName;
	String Gender;
	String BranchName;
	String CollegeName;
	void displayStudentDetails() {
	System.out.println("StudentId:"+StudentId);
	System.out.println("StudentName:"+StudentName);
	System.out.println("Gender:"+Gender);
	System.out.println("BranchName:"+BranchName);
	System.out.println("CollegeName:"+CollegeName);
	}
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.StudentId=111;
		s1.StudentName="chitti";
		s1.Gender="Male";
		s1.BranchName="mca";
		s1.CollegeName="AITAM";
		Student1 s2=new Student1();
		s2.StudentId=112;
		s2.StudentName="kavya";
		s2.Gender="feMale";
		s2.BranchName="CSE";
		s2.CollegeName="AITAM";
		
		System.out.println("------Student1----------");
		s1.displayStudentDetails();
		System.out.println("------Student2----------");
		s2.displayStudentDetails();
		
		

	}

}
