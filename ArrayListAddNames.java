package com.arraylist;

import java.util.ArrayList;

public class ArrayListAddNames {
	   public static void main(String args[]){
	ArrayList<String> alist=new ArrayList<String>();  
    alist.add("Siri");
    alist.add("Tim");
    alist.add("Jhon");
    alist.add("Tom");
    alist.add("Jerry");
    alist.add("Janu");

    System.out.println(alist);

    alist.add(3, "Steve");
    System.out.println(alist);
   }
}
