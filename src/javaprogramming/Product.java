package javaprogramming;
import java.util.Scanner;

public class Product {
	int productId;
	String productName;
	double price;
	Product(int productId,String productName,double price){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}
	Product(){
		this(101,"laptop",50000);
	}
	void details() {
		System.out.println("product ID:"+productId);
		System.out.println("Product Name:"+productName);
		System.out.println("Product Price:"+price);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product Id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Product Name:");
		String name=sc.nextLine();
		System.out.println("Enter Product Price:");
		double price=sc.nextDouble();
		Product obj=new Product(id,name,price);
		obj.details();

	}

}
