package arrays;

public class NumofPositiveNegativeElements {

	public static void main(String[] args) {
		int [] numbers= {10,-20,-30,40,50,-60};
		int positive=0;
		int negative=0;
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i]<0) {
				negative++;
			}else {
				positive++;
			}
		}
		
			System.out.println("Number of Positive elements:"+positive);
			System.out.println("Number of Negitive Elements:"+negative);
		

	}

}
