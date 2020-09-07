/*
 * Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.

Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:

If S[i] == "I", then A[i] < A[i+1]
If S[i] == "D", then A[i] > A[i+1]
 

Example 1:

Input: "IDID"
Output: [0,4,1,3,2]
Example 2:

Input: "III"
Output: [0,1,2,3]
Example 3:

Input: "DDI"
Output: [3,2,0,1]
 */


package leetcode;

public class L942 {
	 public int[] diStringMatch(String S) {
		    
	        int arr[] = new int[S.length()+1];
	        int left = 0;
	        int right = S.length();
	        int j=0;
	        for(char i : S.toCharArray()){            
	            if(i == 'I')
	            {
	                arr[j++] = left++;                
	            }
	            else
	            {
	                arr[j++] = right--;                
	            }
	             arr[j] = left;
	        }       
	        return arr;
	    }
}