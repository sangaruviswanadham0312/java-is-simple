package javaprogramming;
import java.util.Scanner;

public class Product1 {

    String productName;
    int productId;
    double price;
    Product1(String productName, int productId, double price) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
    }
    Product1(Product1 p1) {
        this.productName = p1.productName;
        this.productId = p1.productId;
        this.price = p1.price;
    }
    void display() {
        System.out.println("Product Name : " + productName);
        System.out.println("Product ID   : " + productId);
        System.out.println("Price        : " + price);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        Product1 p1 = new Product1(name, id, price);
        Product1 p2 = new Product1(p1);
        System.out.println("\n--- Product 1 Details ---");
        p1.display();
        System.out.println("\n--- Product 2 Details ---");
        p2.display();
        sc.close();
    }
}