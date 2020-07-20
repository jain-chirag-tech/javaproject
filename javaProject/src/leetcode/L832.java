/*
 * Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 */

package leetcode;

public class L832 {

	public int[][] flipAndInvertImage(int[][] A) {
	       for(int i=0; i<A.length; i++){
	           int j=0;
	           int k=A.length-1;
	           while(j<k){
	               int temp = A[i][j];
	               A[i][j++] = A[i][k];
	               A[i][k--] = temp;
	           }
	           
	           for(j=0; j<A.length; j++){
	               A[i][j] = A[i][j]==1 ? 0 : 1;
	           }
	       } 
	        return A;
	}
}
