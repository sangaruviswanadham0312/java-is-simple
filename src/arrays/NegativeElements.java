package arrays;

public class NegativeElements {

	public static void main(String[] args) {
		int[] arr= {10,20,-30,-12,32,50,-90};
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
