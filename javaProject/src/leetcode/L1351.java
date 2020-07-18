/*
 * Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
 */

package leetcode;

public class L1351 {
	 public int countNegatives(int[][] grid) {
	        int count = 0;
	        for(int[] i : grid){
	            for(int j : i){
	                if(j<0){count++;}
	            }
	        }
	        return count;
	    }
}
