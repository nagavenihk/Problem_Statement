package com.string;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="MPHASIS";
		int n=s.length();
		System.out.println(s);
		for(int i=0;i<n;i++) {
		s=s.substring(1)+s.charAt(0);
			System.out.println(s);
			
		}

	}

}
