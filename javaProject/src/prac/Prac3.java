//Task
//Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
//
//Input Format
//
//A single integer, .
package prac;

import java.util.Scanner;

public class Prac3 {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		 int N = scanner.nextInt();
	        int result = 0;
	        for(int i = 1 ; i<=10 ; i++){
	            result = N * i;
	            System.out.println(N + " x " + i + " = " + result);
	        }

	}

}
