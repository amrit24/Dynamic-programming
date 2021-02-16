package knapsack;

import java.util.Scanner;

/*https://www.youtube.com/watch?v=UmMh7xp07kY&feature=youtu.be*/
public class EqualSumPartition {
	
	private static boolean equalSumPartition(int[] arr,int n) {
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		
		/* if total sum can't be divided into equal parts 
		 * then it can't have equal partition sum */
		
		if(sum%2 != 0) {
			return false;
		}else {
			/* if sum is even and half of the sum can be achieved by adding a subset of array 
			 * then the other half subset sum will also be same as s+s=2s and if a subset sums up
			 * to s then the other left subset will sum to s and hence equal partition exists.
			 */
			return SubsetSumTabulation.subSetSum(arr, sum/2, n);
		}				
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of  array");
		int n = sc.nextInt();

		System.out.println("Enter array");
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		System.out.println("Equal sum partition exists : "+equalSumPartition(arr, n));
	}
}
