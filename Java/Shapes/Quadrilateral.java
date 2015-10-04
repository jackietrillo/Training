/*
Name:
Connor Cheng (G00963340)
Course:      CIS-255
Instructor:  Jessica Masters
Project 3:   Shape class due 9/30/2015
Filename:    Quadrilateral.java
Description: Console application that holds and reads quadrilateral shapes.
*/

public class Quadrilateral extends PolyShape {

	public Quadrilateral(int sidelength){
		super(4);				
		int[] sideLengths = super.getSideLengths();
		for(int i=0; i < sideLengths.length; i++) {
			sideLengths[i] = sidelength;			
		}
	}

	public int getPerimeter() {
		return super.getPerimeter();
	}
}