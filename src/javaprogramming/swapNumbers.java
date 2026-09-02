package javaprogramming;

public class swapNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before Swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("------------ Temparary variables--------------");
		System.out.println("                                               ");
		System.out.println("------------before swapping--------------------");
		System.out.println("a="+a);
		System.out.println("b="+b);
		int temp = a;        
        a = b;          
        b = temp;        
        System.out.println("After Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("------------ XOR--------------");
		System.out.println("                                               ");
		System.out.println("------------before swapping--------------------");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("--------------After Swapping--------------------");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
