package com.book;

public class Book {
	String book_title;
	double book_price;
	
	Book(String title, double price){
		book_title=title;
		book_price=price;
	}
	
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String s) {
		this.book_title = s;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double p) {
		this.book_price = p;
	}
	
	
}
