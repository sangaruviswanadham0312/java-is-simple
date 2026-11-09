package oops;
class Vehicle{
	private String vehicleNumber;
	private String brand;
	private double rentPerDay;
	Vehicle(String vehicleNumber,String brand,double rentPerDay){
		this.vehicleNumber=vehicleNumber;
		this.brand=brand;
		this.rentPerDay=rentPerDay;
	}
	public String getBrand() {
		return brand;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public double getRentPerDay() {
		return rentPerDay;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber=vehicleNumber;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay=rentPerDay;
	}
	 double calculateRent(int days) {
	        return rentPerDay * days;
	    }
	void display(int days) {
		System.out.println("Vehicle Number:"+vehicleNumber);
		System.out.println("Brand:"+brand);
		System.out.println("Rent Per Day:"+rentPerDay);
		System.out.println("Total Rent:"+calculateRent(days));
	}
	
}
class Car extends Vehicle{
	Car(String number,String brand,double rent){
		super(number,brand,rent);
	}
	@Override
	double calculateRent(int days) {
		return (getRentPerDay()+500)*days;
	}
}
class Bike extends Vehicle{
	Bike(String number,String brand,double rent){
		super(number,brand,rent);
	}
	@Override
	double calculateRent(int days) {
		return (getRentPerDay()+100)*days;
	}
} 

public class VehicleRentalSystem {

	public static void main(String[] args) {
		Car c=new Car("AP03TS1234","Swift",1500);
		Bike b= new Bike("AP31HS4321","Honda",500);
		System.out.println("---Car Details---");
		c.display(3);
		System.out.println("---Bike Details----");
		b.display(2);

	}

}
