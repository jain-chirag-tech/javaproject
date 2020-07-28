/*
 * Example 1:

Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false
 */

package leetcode;

public class L367 {
	  public boolean isPerfectSquare(int num) {
	        if(num == 1)
	        {
	            return true;
	        }
	        long low = 1;
	        long high = num/2;
	        while(low<=high){
	            long mid = low + (high-low)/2;
	            if(mid*mid == num)
	            {
	                return true;
	            }
	            else if(mid*mid < num)
	            {
	                low = mid + 1;
	            }
	            else
	            {
	                high = mid - 1 ;
	            }
	        }
	        return false;
	    }
}
