package arrays;

public class TwoDimensionalArray{

	public static void main(String[] args) {
		int[][] num =new int[3][4];
		num[0][0]=100;
		num[0][1]=200;
		num[0][2]=300;
		num[0][3]=400;
		
		num[1][0]=500;
		num[1][1]=600;
		num[1][2]=700;
		num[1][3]=800;
		
		num[2][0]=900;
		num[2][1]=1000;
		num[2][2]=1100;
		num[2][3]=1200;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}

	}

}
