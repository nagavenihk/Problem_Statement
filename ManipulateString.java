package com.manipulate;

public class ManipulateString {
	 static String firstLetterWord(String str)
	    {
	        String result = " ";
	        boolean v = true;
	        for (int i=0; i<str.length(); i++)
	        {
	            if (str.charAt(i) == ' ')
	            {
	                v =true;
	            }
	            else if(str.charAt(i)!= ' ' && v==true)
	            {
	                result+=(str.charAt(i));
	                v = false;
	            }
	        }
	 
	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="JAVA is Simple";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
	    System.out.println(firstLetterWord(str));
	    
	    
	   
	    String str1=" ";
	    String words[]=str.split(" ");
	    for(int i=0;i<words.length;i++) {
	    	str1=new StringBuilder(words[i]).reverse()+" ";
	    	System.out.print(str1);
	    	
	    System.out.println(str.length());	  
	     }
	}
	     
	}

