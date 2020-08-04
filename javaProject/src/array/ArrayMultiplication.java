package array;

import java.util.Scanner;

public class ArrayMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter number of rows = ");
		int rows = sc.nextInt();
		
		System.out.print("Enter number of column = ");
		int cols = sc.nextInt();
		
		System.out.println("Input elements of First Matrix = ");
		int [][] a = new int [rows][cols];
		for(int i=0; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				 a[i][j] = sc.nextInt();
			}
		}
		

		System.out.println("Input elements of Second Matrix = ");
		int [][] b = new int [rows][cols];
		for(int i=0; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				b [i][j] = sc.nextInt();
			}
		}
		sc.close();
		int[][] c = new int [rows][cols];
		for(int i=0; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				c[i][j]=0;
				for(int k=0 ; k<3 ; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}
		
	}

}
