package arrays;

public class FirstNonRepeating {

	public static void main(String[] args) {
		int [] arr= {10,11,15,11,13,12,10,12};
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println("First Non-Repating number is:"+arr[i]);
				break;
			}
		}
		

	}

}
