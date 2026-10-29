package oops;
 class Address {
	String city;
	Address(String city){
		this.city=city;

	}
}
class Student{
	String name;
	Address address;
	Student(String name,Address address){
		this.name=name;
		this.address=address;
	}
}

public class ShallowCopyDemo {

	public static void main(String[] args) {
		Address a1=new Address("hyd");
		Student s1=new Student("vishwa",a1);
		Student s2=new Student(s1.name,s1.address);
		s2.address.city="vizag";
		System.out.println("Original Student");
		System.out.println("Name:"+s1.name);
		System.out.println("City:"+s1.address.city);
		System.out.println("Shallow Copy");
		System.out.println("Name:"+s2.name);
		System.out.println("City:"+s2.address.city);
		
		

	}

}
