/*
 * Let's call an array A a mountain if the following properties hold:

A.length >= 3
There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].

Example 1:

Input: [0,1,0]
Output: 1
 */

package leetcode;

public class L852 {
	 public int peakIndexInMountainArray(int[] A) {
	        int start = 0;
			int end = A.length-1;
			while(start<=end){
				int mid = (start+end)/2;
				if(A[mid]>A[mid-1] && A[mid]>A[mid+1])return mid;
				if(A[mid]>A[mid+1])end = mid-1;
				else start = mid+1;
			}
			return -1;
	    }
}
