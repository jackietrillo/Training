/*
Name:
Connor Cheng (G00963340)
Course:      CIS-255
Instructor:  Jessica Masters
Project 3:   Shape class due 9/30/2015
Filename:    ShapeCreator.java
Description: Console application that holds and reads five other classes.
*/

public class ShapeCreator {
	public static void main(String[] args) {
		PolyShape poly = new PolyShape(10);	
			System.out.println(poly.getNumberOfSides());		
			System.out.println(poly.getPerimeter());
		Quadrilateral quad = new Quadrilateral(5);	
			System.out.println(quad.getNumberOfSides());		
			System.out.println(quad.getPerimeter());			
	}
}