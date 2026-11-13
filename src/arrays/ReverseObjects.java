package arrays;
class Student{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+" "+name;
	}
}

public class ReverseObjects {

	public static void main(String[] args) {
		Student[] s= {new Student(1,"Vishwa"),new Student(2,"Chitti"),new Student(3,"Praveen"),new Student(4,"Mohan")};
		System.out.println("Before Reverse:");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		for(int i=0;i<s.length/2;i++) {
			Student temp=s[i];
			 s[i]=s[s.length-1-i];
			 s[s.length-1-i]=temp;
		}
		System.out.println("After Reverse:");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
