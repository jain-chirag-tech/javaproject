package stack;

import java.util.*;
import java.util.Stack;

public class MaxElementStack {
	
	public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Stack <Integer> s = new Stack<>();
    Stack <Integer> max = new Stack<>();
    max.push(Integer.MIN_VALUE);

    for(int i = 1 ; i<=n ;i++){
    int choice = sc.nextInt();
    if(choice == 1){
        int x = sc.nextInt();
        s.push(x);
         if(s.peek()>=max.peek()){
             max.push(s.peek());
         }
       }

    else if(choice == 2){
        if(s.peek()==max.peek()){
            max.pop();
        }
        s.pop();
    }

    else if(choice == 3) {
        System.out.println(max.peek());
       } 
    sc.close();
    }
}
}



