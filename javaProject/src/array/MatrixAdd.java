package array;

import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number Rows = ");
		int rows = sc.nextInt();
		
		System.out.print("Enter Number Column = ");
		int cols = sc.nextInt();
		
		System.out.print("Enter First Matrix = ");
		int [][] a = new int[rows][cols];
				
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
			 a[i][j] = sc.nextInt();				
			}
		}
		
		System.out.print("Enter Second Matrix = ");
		int [][] b = new int[rows][cols];
				
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
			 b[i][j] = sc.nextInt();				
			}
		}
		sc.close();
		int [][] c = new int[rows][cols];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
			 c[i][j] = a[i][j] + b[i][j];				
			}
		}
		System.out.println("Sum o f Matrix is ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
			System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}
		
	}

}
