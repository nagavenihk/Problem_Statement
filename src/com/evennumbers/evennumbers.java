package com.evennumbers;

import java.util.*;


public class evennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,i=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n :");
		n=scan.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"");
			}
		}

	}

}
