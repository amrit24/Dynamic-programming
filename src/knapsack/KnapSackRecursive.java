package knapsack;

import java.util.Scanner;

public class KnapSackRecursive {
	
	
	int knapsack(int w, int[] wt, int[] val, int n) {
		
		if(n==0 || w==0) {
			return 0;
		}
		
		if(wt[n-1] > w) {
			return knapsack(w, wt, val, n-1);
		}else {
			return Math.max(val[n-1] + knapsack(w-wt[n-1], wt, val, n-1), knapsack(w, wt, val, n-1));
		}
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of weight/value array");
		int n = sc.nextInt();
		
		System.out.println("Enter weight array");
		int[] wt = new int[n];
		
		for(int i=0;i<n;i++) {
			wt[i] = sc.nextInt();
		}
		
		System.out.println("Enter value array");
		int[] val = new int[n];
		
		for(int i=0;i<n;i++) {
			val[i] = sc.nextInt();
		}
		
		System.out.println("Enter weight of knapsack");
		int w = sc.nextInt();
		
		sc.close();
		
		KnapSackRecursive kp = new KnapSackRecursive();
		
		System.out.println(kp.knapsack(w, wt, val, n));
		
	}
}
