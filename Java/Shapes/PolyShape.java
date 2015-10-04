/*
Name:
Connor Cheng (G00963340)
Course:      CIS-255
Instructor:  Jessica Masters
Project 3:   Shape class due 9/30/2015
Filename:    Polyshape.java
Description: Console application that holds and reads circles and shapes with more than four sides.
*/

public class PolyShape {
	private int[] sideLengths;
	private int numberOfSides;
	private int perimeter;

    public PolyShape() {
		this.numberOfSides = 0;
		this.perimeter = 0;
		this.sideLengths = new int[0];
    }

    public PolyShape(int numberOfSides) {
		this.numberOfSides = numberOfSides;
   		this.sideLengths = new int[numberOfSides];
    }

	public int getNumberOfSides() {
		return this.numberOfSides;
	}

	public int[] getSideLengths() {
		return this.sideLengths;
	}

	public int getPerimeter() {
		for(int i=0; i < sideLengths.length; i++) {
			this.perimeter += sideLengths[i];
		}		
		return this.perimeter;
	}	
}