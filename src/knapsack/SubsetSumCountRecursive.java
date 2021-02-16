package knapsack;

import java.util.Scanner;

public class SubsetSumCountRecursive {
	private static int subSetSumCount(int[] arr, int sum, int n) {

		/* Base condition */
		if (sum == 0)
			return 1;
		if (n == 0)
			return 0;

		/*
		 * if last element of array is more than sum we can't include it Else either we
		 * select or not based on sum and size of array
		 */
		if (arr[n - 1] > sum) {
			return subSetSumCount(arr, sum, n - 1);
		} else {
			return subSetSumCount(arr, sum - arr[n - 1], n - 1)+ subSetSumCount(arr, sum, n - 1);
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

		System.out.println("Enter sum");
		int sum = sc.nextInt();

		sc.close();

		System.out.println(subSetSumCount(arr, sum, n));

	}
}
