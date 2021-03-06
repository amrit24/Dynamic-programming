package knapsack;

import java.util.Scanner;

/*https://youtu.be/_gPcYovP7wc*/
/*Bottom up approach */
public class SubsetSumTabulation {

	public static boolean subSetSum(int[] arr, int sum, int n) {
		boolean[][] dp = new boolean[n + 1][sum + 1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= sum; j++) {

				if (i == 0) {
					dp[i][j] = false;
				}
				else if (j == 0) {
					dp[i][j] = true;
				}

				else if (arr[i - 1] <= j) {
					dp[i][j] = dp[i-1][j - arr[i - 1]] || dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		return dp[n][sum];
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

		System.out.println(subSetSum(arr, sum, n));

	}
}
