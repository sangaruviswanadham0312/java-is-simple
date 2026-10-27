
package arrays;

public class EquilibriumIndex {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 2, 2 };
		int total = 0;
		int leftSum = 0;
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			total = total - arr[i];
			if (leftSum == total) {
				System.out.println("Equilibrium Index: " + i);
				return;
			}
			leftSum = leftSum + arr[i];
		}
		System.out.println("No Equilibrium Index found");
	}
}
