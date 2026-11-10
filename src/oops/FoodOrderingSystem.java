package oops;
abstract class FoodOrder{
	abstract void calculateBill();
	abstract void prepareOrder();	
}
class PizzaOrder extends FoodOrder{
	int quantity=2;
	double price=200;
	@Override
     void calculateBill() {
		System.out.println("Calculate Bill:"+(quantity*price));
	}
	@Override
	void prepareOrder() {
		System.out.println("Preparing order.....");
	}
}
class BurgerOrder extends FoodOrder{
	int quantity=3;
	double price=180;
	@Override
    void calculateBill() {
		System.out.println("Calculate Bill:"+(quantity*price));
	}
	@Override
	void prepareOrder() {
		System.out.println("Preparing Burger order.....");
	}
	
}
class BiryaniOrder extends FoodOrder{
	int quantity=4;
	double price=220;
	@Override
    void calculateBill() {
		System.out.println("Calculate Bill:"+(quantity*price));
	}
	@Override
	void prepareOrder() {
		System.out.println("Preparing Biryani Order.....");
	}
	
}


public class FoodOrderingSystem {

	public static void main(String[] args) {
		PizzaOrder p= new PizzaOrder();
		BurgerOrder b= new BurgerOrder();
		BiryaniOrder bi=new BiryaniOrder();
		System.out.println("-----Pizza Order------");
		p.calculateBill();
		p.prepareOrder();
		System.out.println("------Burger Oder------");
		b.calculateBill();
		b.prepareOrder();
		System.out.println("-------Biryani Order----");
		bi.calculateBill();
		bi.prepareOrder();
	}

}
