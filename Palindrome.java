package com.string;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String args[])
	   {
	      String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	      System.out.println(length);
	      
	      String str1=str.toUpperCase();
	      System.out.println(str1);
	      
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str1.charAt(i);
	 
	      if (str1.equals(rev))
	         System.out.println(str1+" is a palindrome");
	      else
	         System.out.println(str1+" is not a palindrome");
	   }
	}

