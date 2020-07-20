/* Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0),
 you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
 */


package leetcode;

import java.util.Arrays;

public class L1464 {

	 public int maxProduct(int[] nums) {
         Arrays.sort(nums);
 
 int last = nums[nums.length-1];
 int theLastButOne = nums[nums.length-2];
 
 return (last-1) * (theLastButOne-1);
}
}