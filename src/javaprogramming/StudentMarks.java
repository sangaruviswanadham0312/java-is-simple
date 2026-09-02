package javaprogramming;

public class StudentMarks {
	int studentId;
	String studentName;
	int marks;
	double totalMarks;
	void calculatePercentage(int marks) {
		double percentage=(marks*100)/totalMarks;
		System.out.println("Percentage:"+percentage);
	}
	void displayDetails() {
		System.out.println("Student Id:"+studentId);
		System.out.println("Student Name:"+studentName);
		System.out.println("Student Marks:"+marks);
		System.out.println("Student Total Marks:"+totalMarks);
	}

	public static void main(String[] args) {
		StudentMarks s1=new StudentMarks();
		s1.studentId=101;
		s1.studentName="vishwa";
		s1.marks=510;
		s1.totalMarks=600;
		s1.displayDetails();
		s1.calculatePercentage(s1.marks);
		

	}

}
