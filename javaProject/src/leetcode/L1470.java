/* Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
*/

package leetcode;

public class L1470 {
	
	public int[] shuffle(int[] nums, int n) {
        int []arr = new int[nums.length];
        int left = 0;
        int right = n;
        int p = 0;
        
        while(right<2*n){
            arr[p] = nums[left];
            left++;
            p++;
            arr[p] = nums[right];
            right++;
            p++;
        }
        return arr;
    }    
}
