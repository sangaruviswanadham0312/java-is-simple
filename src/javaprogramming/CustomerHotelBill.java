package javaprogramming;
import java.util.Scanner;

public class CustomerHotelBill {
	String roomType;
	int numberOfDays;
	double roomPrice;
	double foodCharges;
	double roomCost;
	double finalBill;
	
	CustomerHotelBill(){
		this("unknow");
	}
	CustomerHotelBill(String roomType){
		this(roomType,0);
	}
	CustomerHotelBill(String roomType,int numberOfDays) {
		this(roomType,numberOfDays,0);
	}
	CustomerHotelBill(String roomType,int numberOfDays,double roomPrice){
		this(roomType,numberOfDays,roomPrice,0);
	}
	CustomerHotelBill(String roomType,int numberOfDays,double roomPrice,double foodCharges){
		this.roomType=roomType;
		this.numberOfDays=numberOfDays;
		this.roomPrice=roomPrice;
		this.foodCharges=foodCharges;
		roomCost = roomPrice* numberOfDays;
		finalBill = roomCost + foodCharges;
		
	}
	void display() {
		System.out.println("Room Type:"+roomType);
		System.out.println("Number of Days:"+numberOfDays);
		System.out.println("Room Price:"+roomPrice);
		System.out.println("Food Charges:"+foodCharges);
		System.out.println("Room Cost:"+roomCost);
		System.out.println("Final Bill:"+finalBill);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Room Type:");
		String type=sc.next();
		System.out.println("Enter Number of days:");
		int days=sc.nextInt();
		System.out.println("Enter Room Price:");
		double price=sc.nextDouble();
		System.out.println("Enter Food Charges:");
		double charges=sc.nextDouble();
		CustomerHotelBill obj=new CustomerHotelBill(type,days,price,charges);
		obj.display();
		

	}

}
