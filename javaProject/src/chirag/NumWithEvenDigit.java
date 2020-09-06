package chirag;

public class NumWithEvenDigit {
	
	    public int findNumbers(int[] nums) {
	        int count = 0;
	        int n;
	        for(int i=0; i<nums.length; i++){
	            n=nums[i];
	            int c=0;
	            while(n!=0){
	                n=n/10;
	                c++;
	            }
	            if(c%2==0) {
	             count++;   
	            }
	        }
	        return count;
	    }
}
