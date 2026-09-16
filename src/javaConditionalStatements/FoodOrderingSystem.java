package javaConditionalStatements;

import java.util.Scanner;

public class FoodOrderingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int price=0;
		String item="";
		System.out.println("=====Food Menu======");
		System.out.println("1.Pizza=200/-");
		System.out.println("2.Burger=120/-");
		System.out.println("3.Biryani=180/-");
		System.out.println("4.Noodles=100/-");
		System.out.println("Enter Your Choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1 ->{
			item="Pizza";
		    price=200;
		}
		case 2->{
			item="Burger";
			price=120;
		}
		case 3->{
			item="Biryani";
			price=180;
		}
		case 4->{
			item="Noodles";
			price=100;
		}
		default->{
			System.out.println("Invalid Choice");
			return;
		}
		}
		System.out.println("Enter Your Quantity:");
		int quantity=sc.nextInt();
		int totalBill=price*quantity;
        System.out.println("========= Bill Details =========");
        System.out.println("Select Item:"+item);
        System.out.println("Price:"+price);
        System.out.println("Quantity:"+quantity);
        System.out.println("Total Bill:"+totalBill);
        sc.close();
	}

}
