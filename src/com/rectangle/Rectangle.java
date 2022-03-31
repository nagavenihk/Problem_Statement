package com.rectangle;

public class Rectangle {
	 private double length;
	   private double width;
	   
	   public Rectangle()
	   {
	      length = 0.0;
	      width  = 0.0;
	   }

	   public Rectangle(double l, double w)
	   {
	      length = l;
	      width  = w;
	   }
	   
	   public void set(double l, double w)
	   {
	      length = l;
	      width  = w;
	   }

	   public double getArea()
	   {
	      return length * width;
	   }

	   public double getPerimeter()
	   {
	      return 2 * (length + width);
	   }
}
