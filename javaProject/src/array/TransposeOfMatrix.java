package array;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
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
		sc.close();
		int [][] b = new int[rows][cols];
		for(int i=0; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				b[i][j] = a[j][i];
			}
		}
		for(int i=0 ; i<rows; i++) {
			for(int j=0 ; j<cols ; j++) {
				System.out.print(b[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
