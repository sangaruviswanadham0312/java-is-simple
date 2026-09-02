package javaprogramming;

public class Operators {

	public static void main(String[] args) {
		int a =10;
		int b=30;
		int c=10;
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a!=b);
         float d=200.0f;
         double e=200.0;
        System.out.println(d==e);
        System.out.println("--bitwiswshift----");
        System.out.println(71&87); //71
        System.out.println(49&85); //17
        System.out.println(79&69); //69
        System.out.println(88&69); //64
        System.out.println(100&100); //100
        System.out.println("--bitwiswshift=2----");
        System.out.println(71|87); //71
        System.out.println(49|85); //17
        System.out.println(79|69); //69
        System.out.println(88|69); //64
        System.out.println(100|100); //100
        System.out.println("--bitwiswshift=3----");
        System.out.println(71^87); //16
        System.out.println(49^85); //100
        System.out.println(79^69); //10
        System.out.println(88^69); //29
        System.out.println(100^100); //0
        System.out.println("--bitwiswshift=4----");
        System.out.println(~87); //-88
        System.out.println(~85); //-86
        System.out.println(~69); //-70
        System.out.println(~69); //-70
        System.out.println(~100); //-101
        int f=10;
        int g=2;
        System.out.println("--bitwiswshift=5----");
        System.out.println(f<<g); //40
        System.out.println(f>>g); //2
        System.out.println(f>>>g); //2
        System.out.println(f>>>g); //2
        System.out.println("--- ternary operator----");
        int age=18;
        String eliagable=(age<=18)?"yes":"no";
        System.out.println("the eliagable age for vote:"+eliagable);
        int marks=50;
        String grade=(marks>=90)?"A":(marks>=80)?"B":(marks>=70)?"C":(marks>=60)?"D":"E";
        System.out.println("Student grade:"+grade);
        System.out.println("-------instanceof-----");
        Integer i=10;
        System.out.println(i instanceof Integer);
        System.out.println(i instanceof Number);
        System.out.println(i instanceof Object);
        System.out.println(null instanceof Integer);
        System.out.println(null instanceof Number);
        System.out.println(null instanceof Object);
	}
	

}
