package arrays;

public class SumofAllArrys {
	static int[] numbers;

	public static void main(String[] args) {
		numbers =new int[10];
		numbers[0]=200;
		numbers[1]=140;
		numbers[2]=280;
		numbers[3]=170;
		numbers[4]=200;
		numbers[5]=140;
		numbers[6]=280;
		numbers[7]=170;
		numbers[8]=200;
		numbers[9]=140;
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum=sum+numbers[i];
		}
      System.out.println("Sum of All Elements:"+sum);
	}

}
