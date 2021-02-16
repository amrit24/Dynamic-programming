package knapsack;

import java.util.Scanner;

public class KnapSackMemoization {

    int[][] dp = new int[10][100];
    
    KnapSackMemoization() {
    	for(int i=0;i<10;i++) {
    		for(int j=0;j<100;j++) {
    			dp[i][j] = -1;
    		}
    	}
    }
   

	private  int knapSack(int w, int[] wt, int[] val, int n) {
        
		if (n == 0 || w == 0) {
			return 0;
		}
		
		if(dp[n][w] != -1) {
			return dp[n][w];
		}

		if (wt[n - 1] > w) {
			 dp[n][w] = knapSack(w, wt, val, n - 1);
			 return dp[n][w];
		} else {
			dp[n][w] = Math.max(val[n - 1] + knapSack(w - wt[n - 1], wt, val, n - 1), knapSack(w, wt, val, n - 1));
			return dp[n][w];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of weight/value array");
		int n = sc.nextInt();

		System.out.println("Enter weight array");
		int[] wt = new int[n];

		for (int i = 0; i < n; i++) {
			wt[i] = sc.nextInt();
		}

		System.out.println("Enter value array");
		int[] val = new int[n];

		for (int i = 0; i < n; i++) {
			val[i] = sc.nextInt();
		}

		System.out.println("Enter weight of knapsack");
		int w = sc.nextInt();

		sc.close();
        
		KnapSackMemoization kp = new KnapSackMemoization();
		System.out.println(kp.knapSack(w, wt, val, n));

	}

}
