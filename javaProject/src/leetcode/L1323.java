/*
 * Input: num = 9669
Output: 9969
Explanation: 
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666. 
The maximum number is 9969.
Example 2:

Input: num = 9996
Output: 9999
Explanation: Changing the last digit 6 to 9 results in the maximum number.
Example 3:

Input: num = 9999
Output: 9999
Explanation: It is better not to apply any change.
 */

//https://leetcode.com/problems/maximum-69-number/

package leetcode;

public class L1323 {
	 public int maximum69Number (int num) {
	        char[] chars = Integer.toString(num).toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '6') {
				chars[i] = '9';
				break;
			}
		}
		return Integer.parseInt(new String(chars));
	    }
}