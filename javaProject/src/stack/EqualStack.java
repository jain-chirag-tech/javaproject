package stack;

import java.util.Stack;

public class EqualStack {

	
	static int equalStacks(int[] h1, int[] h2, int[] h3) {
	    Stack<Integer> s1=new Stack<>();
	    Stack<Integer> s2=new Stack<>();
	    Stack<Integer> s3=new Stack<>();
	    
	    int sum1=0,sum2=0,sum3=0;
	   for(int i=h1.length-1;i>=0;i--){
	       s1.push(h1[i]);
	       sum1+=h1[i];
	   }
	    for(int i=h2.length-1;i>=0;i--){
	       s2.push(h2[i]);
	       sum2+=h2[i]; 
	   }
	    for(int i=h3.length-1;i>=0;i--){
	       s3.push(h3[i]);
	       sum3+=h3[i];
	   }
	   while(!(sum1==sum2&&sum2==sum3&&sum3==sum1)){
	        if(sum1==0||sum2==0||sum3==0){
	            sum1=0;
	            break;
	        }else if(sum1>=sum2&&sum1>=sum3){
	            sum1-=s1.peek();
	            s1.pop();
	        }else if(sum2>=sum1&&sum2>=sum3){
	            sum2-=s2.peek();
	            s2.pop();
	        }else if(sum3>=sum1&&sum3>=sum2){
	            sum3-=s3.peek();
	            s3.pop();
	        }
	    }
	    return sum1;
	}
	public static void main(String [] args) {
		int []a = {3,2,1,1,1};
		int []b = {4,3,2};
		int []c = {1,1,4,1};
		int maxHieght = equalStacks(a,b,c);
		System.out.println("Maximum hieght of equal Stack "+ maxHieght);
	}
}
