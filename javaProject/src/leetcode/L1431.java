/* Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: 
Kid 1 has 2 candies and if he or she receives all extra candies (3) will
 have 5 candies --- the greatest number of candies among the kids. 
Kid 2 has 3 candies and if he or she receives at least 2 extra candies will
 have the greatest number of candies among the kids. 
Kid 3 has 5 candies and this is already the greatest number of candies among the kids. 
Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies. 
Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have
 the greatest number of candies among the kids. 
 */


package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L1431 {

	 public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        int maxValue = Integer.MIN_VALUE;    
	        for (int i = 0; i < candies.length; i++){
	            maxValue = Math.max(maxValue, candies[i]);
	        }
	        
	        ArrayList<Boolean> resultList = new ArrayList<>();
	        for (int i = 0; i < candies.length; i++){
	            if (candies[i] + extraCandies >= maxValue){
	                resultList.add(true);
	            } else{
	                resultList.add(false);
	            }
	        }
	        return resultList;   
	    }
}
