package arrays;

public class KthLargestNumber {

	public static void main(String[] args) {
		int arr[]= {3,4,6,7,3,9,10};
		int k=3;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
				count++;	
				}
			}
			if(count==k-1) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
