package javaprogramming;
import java.util.Scanner;
public class LibraryBook {
	static void bookName(String name) {
		System.out.println("book Name:"+name);
	}
	static void authorName(String author) {
		System.out.println("author name:"+author);
	}
	static void bookId(int Id) {
		System.out.println("book Id:"+Id);
	}
	static void bookRating(float Rating) {
		System.out.println("book Rating:"+Rating);
	}
	static void bookPrice(double Price) {
		System.out.println("book Price:"+Price);
	}
	static void bookLanguge(String Language){
		System.out.println("book Language:"+ Language);
	}
	static void avaliableBooks(boolean avaliableBooks) {
		System.out.println("avaliable Books:"+avaliableBooks);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book name:");
		String name = sc.nextLine();
		System.out.println("Enter author name:");
		String author=sc.nextLine();
		System.out.println("Enter book Id:");
		int Id=sc.nextInt();
		System.out.println("book rating:");
        float Rating=sc.nextFloat();
        System.out.println("Enter book price:");
        double Price=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter book Language:");
        String Language=sc.nextLine();
        System.out.println("avaliableBooks..?(true/false)");
        boolean avaliableBooks=sc.nextBoolean();
        bookName(name);
        authorName(author);
        bookId(Id);
        bookRating(Rating);
        bookPrice(Price);
        bookLanguge(Language);
        avaliableBooks(avaliableBooks);
        
        
		 
		
		

	}

}
