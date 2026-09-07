package javaprogramming;
import java.util.Scanner;
public class MobileBill {
String mobileModel;
int quantity;
double price;
double deliveryCharge;
double mobileCost;
double finalbill;
MobileBill(){
	this("unknow");
}
MobileBill(String mobileModel){
	this(mobileModel,0);
}
MobileBill(String mobileModel,int quantity){
	this(mobileModel,quantity,0);
}
MobileBill(String mobileModel,int quantity,double price){
	this(mobileModel,quantity,price,0);
}
MobileBill(String mobileModel,int quantity,double price,double deliveryCharge){
	this.mobileModel=mobileModel;
	this.quantity=quantity;
	this.price=price;
	this.deliveryCharge=deliveryCharge;
	mobileCost=price*quantity;
	finalbill=mobileCost+deliveryCharge;
}
void display() {
	System.out.println("Mobile Model:"+mobileModel);
	System.out.println("mobile Quantity:"+quantity);
	System.out.println("Mobile Price:"+price);
	System.out.println("Delivery Charges:"+deliveryCharge);
	System.out.println("Mobile Cost:"+mobileCost);
	System.out.println("Final Mobile Bill:"+finalbill);
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mobile Model:");
		String model=sc.nextLine();
		System.out.println("Enter Quantity:");
		int quantity=sc.nextInt();
		System.out.println("Enter Price:");
		double price=sc.nextDouble();
		System.out.println("Enter delivety charges:");
		double deliveryCharge=sc.nextDouble();
		MobileBill obj=new MobileBill(model,quantity,price,deliveryCharge);
		obj.display();

	}

}
