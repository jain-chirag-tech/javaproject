/*
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0
 */


package leetcode;

public class L35 {
	public int searchInsert(int[] nums, int target) {
        int i=0;
        while(i<nums.length && nums[i] < target){
            i++;
        }
        return i;
    }

}
