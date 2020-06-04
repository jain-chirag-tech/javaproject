package recursion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++)	
		System.out.println(fab(i));
		sc.close();
		
	}

	static int fab(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return (fab(n-1)+fab(n-2));
	}
	
}
