/*
 * Example 1:

Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
Example 2:

Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
 */

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

package leetcode;

public class L1281 {
	public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n>0){
            product *= n%10;
            sum += n%10;
            n/=10;
        }
        return product-sum;
    }
}
