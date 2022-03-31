package com.rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Rectangle rectangle1 = new Rectangle();
	      System.out.println("Area of Rectangle is " + rectangle1.getArea());
	      System.out.println("Perimeter of Rectangle is " + rectangle1.getPerimeter());

	      Rectangle rectangle2 = new Rectangle(2.5, 4.5);
	      System.out.println("Area of Rectangle is" + rectangle2.getArea());
	      System.out.println("Perimeter of Rectangle is" + rectangle2.getPerimeter());
	      
	      Rectangle rectangle3 = new Rectangle(3.5, 5.5);
	      System.out.println("Area of Rectangle is" + rectangle3.getArea());
	      System.out.println("Perimeter of Rectangle is" + rectangle3.getPerimeter());
	      
	      Rectangle rectangle4 = new Rectangle(1.5, 3.5);
	      System.out.println("Area of Rectangle is" + rectangle4.getArea());
	      System.out.println("Perimeter of Rectangle is" + rectangle4.getPerimeter());
	      
	      Rectangle rectangle5 = new Rectangle(2.0, 4.0);
	      System.out.println("Area of Rectangle is" + rectangle5.getArea());
	      System.out.println("Perimeter of Rectangle is" + rectangle5.getPerimeter());
	      
	}

}
