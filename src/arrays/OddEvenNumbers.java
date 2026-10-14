package arrays;

public class OddEvenNumbers {

	public static void main(String[] args) {
		int[] numbers= {10,15,30,35,50};
		int even=0;
		int odd=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
			   even++;
			}else {
				odd++;
			}
		}
		System.out.println("Number of the Even Numbers:"+even);
		System.out.println("Number of the Odd Numbers:"+odd);

	}

}
