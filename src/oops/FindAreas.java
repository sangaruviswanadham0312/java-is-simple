package oops;
class Shape{
	public void area() {
		System.out.println("Calculating Area");
	}
}
class Circle extends Shape{
	double radius=5;
	@Override
	public void area() {
		double result=22/7*radius*radius;
		System.out.println("Calculating Area of Circle:"+result);
	}
}
class Rectangle extends Shape{
	double length=10;
	double breadth=6;
	@Override
	public void area() {
		double result=length*breadth;
		System.out.println("Calculating Area of Reactangle:"+result);
	}
}


public class FindAreas {

	public static void main(String[] args) {
		Circle cr=new Circle();
		cr.area();
		Rectangle re=new Rectangle();
		re.area();

	}
}
