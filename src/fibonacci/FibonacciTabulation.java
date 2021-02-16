package fibonacci;

import java.util.Scanner;

public class FibonacciTabulation {
	
	private static int fibonacci(int n) {
		int[] fib = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i=2; i<=n; i++) {
			fib[i] = fib[i-1] +  fib[i-2];
		}
		return fib[n];
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n = sc.nextInt();
		
		sc.close();
		
		System.out.println(fibonacci(n));
	}

}
