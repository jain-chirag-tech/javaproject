package chirag;

import java.util.Scanner;

public class TrailingZero {
	static int CountTrailingZeros(int n) {
		int res = 0;
		for(int i=5; i<=n; i*=5) {
			res = res + (int) Math.floor(n/i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int n = sc.nextInt();
		sc.close();
		System.out.println(CountTrailingZeros(n));
	}
}
