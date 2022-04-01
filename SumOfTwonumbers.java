package com.problemstatement2;

public class SumOfTwonumbers {
	 public static void main(String[] args) { 
		 int count = 13, num1 = 1, num2 = 3; 
		 System.out.print("Sum of previous "+count+" numbers:"+"\n"); 
		 for (int i = 1; i <= count; ++i)
		 { 
			 System.out.print(num1+" ");
			 int sumOfPrevTwo = num1 + num2; num1 = num2; num2 = sumOfPrevTwo; 
			 }
		 }
	 }

