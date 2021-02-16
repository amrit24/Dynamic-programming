package lcs;

import java.util.Scanner;

public class LCSDp {

	int lcs(char[] x, char[] y, int m, int n) {
		
		int[][] L = new int[m+1][n+1];
		
		for(int i=0; i<=m; i++) {
			
			for (int j=0; j<=n; j++) {
				
				if(i==0 || j==0) {
					L[i][j] = 0;
				} else if(x[i-1] == y[j-1]) {
					L[i][j] = 1+L[i-1][j-1];
				} else {
					L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
				}
			}
		}
		
		return L[m][n];
		
	}
	
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter first string");
    	String str1 =  sc.next();
    	
    	System.out.println("Enter second string");
    	String str2 = sc.next();
    	
    	sc.close();
    	
    	char[] L1 = str1.toCharArray();
    	char[] L2 = str2.toCharArray();
    	
    	LCSDp l = new LCSDp();
    	
    	System.out.println(l.lcs(L1,L2,L1.length,L2.length));
    	
    }
}
