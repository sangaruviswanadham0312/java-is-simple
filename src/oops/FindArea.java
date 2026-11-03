package oops;
class Shapes{
	public void area() {
	}
}
class Square extends Shapes{
	double s=10;
	@Override
	public void area() {
		double result=s*s;
		System.out.println("Square of area:"+result);
	}
	
}
class Sphere extends Shapes{
	double r=7;
	@Override
	public void area() {
	double result=4*22/7*r*r;
	System.out.println("Sphere of area:"+result);
	}
}

public class FindArea {

	public static void main(String[] args) {
		Square c=new Square();
		c.area();
		Sphere r=new Sphere();
		r.area();

	}

}
