package com.climbingstairs;

public class ClimbingStairs1 {
	public static void main(String[] args) {
		System.out.println("Total ways to climb 3 stairs: "+climbStairs(3));
	}
	
	private static  int climbStairs(int n) {
         int[] dpTable = new int[n+1];
         dpTable[0] = 1;
         dpTable[1] = 1;
         for(int i = 2; i <= n; i++){
             dpTable[i] = dpTable[i-1] + dpTable[i-2];
         }
         return dpTable[n];
    }
}
