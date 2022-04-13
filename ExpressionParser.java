package com.expression;

public class ExpressionParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="23 +  45 - ( 343 / 12 )";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				System.out.println();
				i++;
			}
			System.out.println(str.charAt(i));
		}
	}

}
