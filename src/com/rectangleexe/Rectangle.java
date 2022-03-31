package com.rectangleexe;

public class Rectangle {
	
	private float len;
	private float breadth;
	public Rectangle(float l, float b) {
		len=l;
		breadth=b;
		
	}
	public void setLen(float l) {
		this.len = l;
	}

	public void setBreadth(float b) {
		this.breadth = b;
	}
	
	public float Area()
	{
		return len*breadth;
	}
	
	public String display()
	{
		return ("\n Length:"+len+"\tBreadth:"+breadth+"\n Area of rectangle:"+Area());
	}
	
	}
	

