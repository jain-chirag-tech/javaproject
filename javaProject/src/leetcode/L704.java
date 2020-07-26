/*
 * Given a sorted (in ascending order) integer array nums of n elements and a target value,
 * write a function to search target in nums. If target exists, then return its index, 
 * otherwise return -1.
 */

package leetcode;

public class L704 {

	  public int search(int[] nums, int target) {
	        int low = 0;
	        int high = nums.length-1;
	        while(low<=high){
	           int mid = low + (high-low)/2;
	            if(target == nums[mid])
	            {
	                return mid;
	            }
	            else if(target<nums[mid])
	            {
	                high = mid-1;
	            }
	            else
	            {
	                low = mid+1;
	            }
	        }
	        return -1;
	    }
}
