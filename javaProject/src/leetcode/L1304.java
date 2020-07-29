/*
 * Given an integer n, return any array containing n unique integers such that they add up to 0.

 Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
 */

//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

package leetcode;

public class L1304 {
	 public int[] sumZero(int n) {
	        int[] res = new int[n];
	        int left = 0, right = n - 1, start = 1;
	        while (left < right) {
	            res[left++] = start;
	            res[right--] = -start;
	            start++;
	        }
	        return res;
	    }
}
