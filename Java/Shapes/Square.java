/*
Name:
Connor Cheng (G00963340)
Course:      CIS-255
Instructor:  Jessica Masters
Project 3:   Shape class due 9/30/2015
Filename:    Square.java
Description: Console application that holds and reads squares.
*/

public class Square extends Quadrilateral {
	private int area;

   public Square(int length) {
		
   }

	public int getArea() {
		this.area = length * 2;
		return this.area;
	}
}