package oops;
class Device{
	private String brand;
	private double price;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String getBrand() {
		return brand;
	}
	public double getPrice() {
		return price;
	}
	void displaydetails() {
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
	}
}
class Laptop extends Device{
	String ram;
	String processor;
	void CunIDE() {
		System.out.println("Running CunIde");
	}
	void CompileCode() {
		System.out.println("Running Compile Code");
	}
	@Override
	void displaydetails() {
		System.out.println("---Laptop Details------");
		System.out.println("Brand:"+getBrand());
		System.out.println("Price:"+getPrice());
		System.out.println("Ram"+ram);
		System.out.println("Processor:"+processor);
	}
}
class Mobile extends Device{
	String camera;
	String battery;
	void makeCall() {
		System.out.println("Make a Call......");
	}
	void takephoto() {
		System.out.println("Taking a Photo....");
	}
	@Override
	void displaydetails()  {
		System.out.println("---Mobile Details----");
		System.out.println("Brand:"+getBrand());
		System.out.println("Price:"+getPrice());
		System.out.println("Camera:"+camera);
		System.out.println("Battery:"+battery);
	}
}

public class Vcube {

	public static void main(String[] args) {
	 Laptop l =new Laptop();
	 l.setBrand("HP");
	 l.setPrice(65000);
	 l.ram="16GB";
	 l.processor="intel i5";
	 Mobile m = new Mobile();
	 m.setBrand("Google Pixcel");
	 m.setPrice(55000);
	 m.camera="100MP";
	 m.battery="55000mAh";
	 Device d;
	 d=l;
	 d.displaydetails();
	 l.CunIDE();
	 l.CompileCode();
	 System.out.println("--------------");
	 d=m;
	 d.displaydetails();
	 m.makeCall();
	 m.takephoto();

	}

}
