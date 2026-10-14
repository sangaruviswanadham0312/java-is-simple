package arrays;

public class FindPositiveNegativeElement {

	public static void main(String[] args) {
		int [] number= {-1,2,-3,4,-5};
		for(int i=0;i<number.length;i++) {
			if(number[i]>0) {
				System.out.println(" "+number[i]+" is a Positive number");
			}else {
				System.out.println(number[i]+" is a Negative number");
			}
		}
	}

}
