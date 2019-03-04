package com.geeksforgeeks.problem.array.optimization;

public class LargestSumContigousSubArray {

	public static void main (String[] args) 
    { 
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        System.out.println("Maximum contiguous sum is " + 
                                       maxSubArraySum(a)); 
    } 
	
	private static int maxSubArraySum(int[] arr) {
		int prevSum = Integer.MIN_VALUE, currentSum = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			currentSum += arr[i];
			if(currentSum < 0) currentSum = 0;
			if(currentSum > prevSum) prevSum = currentSum;
		}
		return prevSum;
	}
}
