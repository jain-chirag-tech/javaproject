            //  Practice of "for each loop in 2D array" 

package array;

public class Practise1 {

	public static void main(String[] args) {
		
		int x[][] =   {
						{9,5,3,4,7},
						{2,8,4,6,0}
					};
		
		for(int [] i : x) {
			for(int j : i) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
		

	}

}
