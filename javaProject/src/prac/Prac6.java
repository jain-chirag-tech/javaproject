//How to convert string to int and vice versa .

package prac;

import java.util.Scanner;
import java.lang.*;

public class Prac6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		
		int n = 100;
		String str1 = Integer.toString(n);
		System.out.println(str1);
		
		String str2 = "101";
		int x = Integer.parseInt(str2);	
		System.out.println(x);

	}

}
