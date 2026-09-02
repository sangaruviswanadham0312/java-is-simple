package javaprogramming;

public class Arithematic {
	void addition(int a,int b) {
		System.out.println("Addition:"+(a+b));
	}
	void substraction(int a, int b) {
		System.out.println("Substraction:"+(a-b));
	}
	void muitiplaction(int a,int b) {
		System.out.println("Multiplaction:"+(a*b));
	}
	void divison(int a,int b) {
		System.out.println("Divison:"+(a/b));
	}

	public static void main(String[] args) {
		Arithematic b=new Arithematic();
		b.addition(10,20);
		b.divison(10, 5);
		b.substraction(10, 50);
		b.muitiplaction(10, 10);

	}

}
