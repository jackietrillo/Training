/*
Name:
Connor Cheng (G00963340)
Course:      CIS-255
Instructor:  Jessica Masters
Project 3:   Shape class due 9/30/2015
Filename:    Rectangle.java
Description: Console application that holds and reads rectangles.
*/

public class Rectangle extends PolyShape {
	private int length;
	private int width;
	private int area;

	public Rectangle(int length, width) {
		super(4);		
		this.length = length;
		this.width = width;					
		int[] sideLengths = super.getSideLengths();
		sideLengths[0] = length;
		sideLengths[1] = width;
		sideLengths[2] = length;
		sideLengths[3] = width;						
	}

	public int getLength() {
		return this.length;
	}
	
	public int getWidth() {	
		return this.width;
	}	

	public int getArea() {
		this.area = length * width;		
		return this.area;
	}
}