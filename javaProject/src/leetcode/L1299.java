/*
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

 

Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
 */

package leetcode;

public class L1299 {
	  public int[] replaceElements(int[] arr) {
	        int maxSoFar = arr[arr.length-1];
	        arr[arr.length-1] = -1;
	        
	        for(int i=arr.length-2; i>-1; i--){
	            int currVal = arr[i];
	            arr[i] = maxSoFar;
	            maxSoFar = Math.max(maxSoFar,currVal);
	        }
	        return arr;
	    }
}
