package chirag;

public class MajorityWins {
	
	    public int majorityWins(int arr[],int n,int x,int y)
	    {
	            int count_x=0;//counter to count frequency of x
	            int count_y=0;//counter to count frequency of y

	          for(int i:arr){
	              if(i==x)
	              {
	                  count_x++;
	              }else if(i==y)
	              {
	                  count_y++;
	              }
	          }
	        
	         if (count_x > count_y)
	            return x;
	         else if (count_y > count_x)
	            return y;
	         else
	            return Math.min(x,y);

	   }
}


