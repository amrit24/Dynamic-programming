package fibonacci;
import java.util.Scanner;

public class FibonacciMemoization {
	
    int lookup[] = new int[100];
	
    void initialize() {
	    for(int i=0;i<100;i++) {
	    	lookup[i] = -1;
	    }
   }
	
	int fib(int n) {
		
		if(lookup[n] == -1) {
			if(n<=1) {
				lookup[n] = n;
			}else {
				lookup[n] = fib(n-1) + fib(n-2);
			}
		}
		return lookup[n];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out .println("Enter a number");
		
		int n =  sc.nextInt();
		sc.close();
		
		FibonacciMemoization f = new FibonacciMemoization();
		
		f.initialize();
		
		System.out.println(f.fib(n));			
		
	}

}
