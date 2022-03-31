package com.rectangleexe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleTest {
	public static void main(String[] args) throws IOException{
		Rectangle Rect[]=new Rectangle[5];	
		for(int i=0;i<Rect.length;i++) {
		Rect[i]=new Rectangle();
		
		System.out.println("\n Enter the length and breadth of the rectangle["+i+"]:");
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String str=b.readLine();
		float f=Float.parseFloat(str);
		
		Rect[i].setLen(f);
		
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		String str1=b.readLine();
		float f1=Float.parseFloat(str1);
		
		Rect[i].setBreadth(f1);
		System.out.println("\n RECTANGLE["+i+"]:"+Rect[i].display());
		
		}
	}
}
