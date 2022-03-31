package com.book;

import java.util.Scanner;

public class TestBook {
	
	 static Scanner sc = new Scanner(System.in);
	 public static void createBooks(Book[] b) {
	  for (int i = 0; i < b.length; i++) {
	   System.out.println("Enter book" + (i + 1) + " details:");
	   System.out.print("Title: ");
	   sc.nextLine();
	   String t = sc.nextLine();
	   System.out.print("Price: ");
	   double p = sc.nextDouble();
	   b[i] = new Book(t, p);
	  }
	 }

	 public static void showBooks(Book[] b) {
	  System.out.println("Book Title\t\tPrice");
	  System.out.println("----------------------------------");
	  String r="RS";
	  for (int i = 0; i < b.length; i++) {
	   System.out.printf("%-20s%6s",b[i].getBook_title(),r);
	   System.out.println(b[i].getBook_price());
	  }
	 }

	 public static void main(String args[]) {
	  System.out.print("Number of books: ");
	  int n = sc.nextInt();
	  Book[] b = new Book[n];
	  createBooks(b);
	  showBooks(b);
	 }

}
