package oops;
class Delivery{
	int deliveryId;
	String partnerName;
	double distance;
	Delivery(int deliveryId,String partnerName,double distance){
		this.deliveryId=deliveryId;
		this.partnerName=partnerName;
		this.distance=distance;
	} 
 void calculateDeliveryCharge() {
		
	}
}
class BikeDelivery extends Delivery{
	BikeDelivery(int deliveryId,String partnerName,double distance){
		super(deliveryId,partnerName,distance);
	}
	@Override
void calculateDeliveryCharge() {
	double charge=distance*10;
	System.out.println("Delivery Type:Bike Delivery");
	System.out.println("Delivery Id:"+deliveryId);
	System.out.println("Partner Name:"+partnerName);
	System.out.println("Distance:"+distance);
	System.out.println("Total Delivery Charge:"+charge);
	}
}
class CycleDelivery  extends Delivery{
	CycleDelivery(int deliveryId,String partnerName,double distance){
		super(deliveryId,partnerName,distance);
	}
	@Override
void calculateDeliveryCharge() {
	double charge=distance*5;
	System.out.println("Delivery Type:CycleDelivery");
	System.out.println("Delivery Id:"+deliveryId);
	System.out.println("Partner Name:"+partnerName);
	System.out.println("Distance:"+distance);
	System.out.println("Total Delivery Charge:"+charge);
	}
}
class ExpressDelivery extends Delivery{
	ExpressDelivery(int deliveryId,String partnerName,double distance){
		super(deliveryId,partnerName,distance);
	}
	@Override
void calculateDeliveryCharge() {
	double charge=distance*20;
	System.out.println("Delivery Type:ExpressDelivery");
	System.out.println("Delivery Id:"+deliveryId);
	System.out.println("Partner Name:"+partnerName);
	System.out.println("Distance:"+distance);
	System.out.println("Total Delivery Charge:"+charge);
	}
}
public class ZomotoDelivery {

	public static void main(String[] args) {
		BikeDelivery  b1=new BikeDelivery (101,"Vishwa",2);
		CycleDelivery c1=new CycleDelivery(102,"Chitti",3);
		ExpressDelivery e1=new ExpressDelivery(103,"Lohi",4);
		b1.calculateDeliveryCharge();
		System.out.println("***********************");
		c1.calculateDeliveryCharge();
		System.out.println("***********************");
		e1.calculateDeliveryCharge();

	}

}
