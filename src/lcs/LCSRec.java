package lcs;
import java.util.Scanner;

public class LCSRec {
	
	int LCS(char[] L1, char[] L2, int m, int n) {
		
		if(m==0 || n==0) {
			return 0;
		}
		if(L1[m-1] == L2[n-1]) {
		   return 1+LCS(L1, L2, m-1, n-1);	
		}
		
		return Math.max(LCS(L1, L2, m-1, n), LCS(L1, L2, m, n-1));
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
    	
    	LCSRec l = new LCSRec();
    	
    	System.out.println(l.LCS(L1,L2,L1.length,L2.length));
    	
    }
}
