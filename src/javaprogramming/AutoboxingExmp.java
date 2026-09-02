package javaprogramming;

public class AutoboxingExmp {

	public static void main(String[] args) {
		int a=200;
		Integer obj = a;
		int b=obj;
		System.out.println("primitive variable:"+a);
		System.out.println("after autoboxing:"+obj);
		System.out.println("after autoboxing:"+b);

	}

}
