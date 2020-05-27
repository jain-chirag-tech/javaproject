			//jagged array for each loop

package array;

public class Practice2 {

	public static void main(String[] args) {

		
		int [][] p = {
						{9,5,3},
						{2,8,4,6,0},
						{5,4,6,9}				
		};
		
		for(int [] i : p) {
			for(int j : i) {
			System.out.print(j + " ");
			}
			System.out.println();
			}
		}	

	}


