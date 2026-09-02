package javaprogramming;
import java.util.Scanner;

public class Car {
	static void carName(String name) {
		System.out.println("car name:"+ name);
	}
	static void carmodel(String model) {
		System.out.println("car model:"+model);
	}
	static void carprice(double price) {
		System.out.println("car price:"+price);
	}
	static void carcolor(String color) {
		System.out.println("car color:"+color);
	}
	static void carmileage(int mileage) {
		System.out.println("car mileage:"+mileage);
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Car name:");
		String name = sc.nextLine();
		System.out.println("Enter model name:");
		String model=sc.nextLine();
		System.out.println("Enter car price:");
		int price=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter car color:");
		String color=sc.nextLine();
		System.out.println("Enter car mileage:");
		int mileage=sc.nextInt();
		carName(name);
		carmodel(model);
		carprice(price);
		carcolor(color);
		carmileage(mileage);

	}

}
