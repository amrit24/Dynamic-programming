package fibonacci;

import java.util.Scanner;

public class FibonacciRecursive {
	
	static int fib(int num) {
		if(num<=1) {
			return num;
		}
		return fib(num-1) + fib(num-2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a no.");
		
		
		int n  = sc.nextInt();
		
		sc.close();
		
		System.out.println(fib(n));
		
	}

}
