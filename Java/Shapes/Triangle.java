/*
Name:
Connor Cheng (G00963340)
Course:      CIS-255
Instructor:  Jessica Masters
Project 3:   Shape class due 9/30/2015
Filename:    Triangle.java
Description: Console application that holds and reads triangles.
*/

public class Triangle{
	private int[] sideLengths;
	private int maxlength;
	private int perimeter;

   public Triangle(){
	this.perimeter = 0;
	this.maxlength = 3;
   }

   public Quadrilateral(int perimeter, int maxlength){
	this.perimeter = perimeter;
	this.maxlength = maxlength;
   	this.sideLengths = new int[maxlength];
   }

	public String getPerimeter(){
		return this.perimeter;
	}

	public void setPerimeter(int perimeter){
		this.perimeter = perimeter;
	}

	public boolean isIsoceles(){

		/*
		if (1 sideLengths == 2 sideLengths)
			return true;
		else
			return false;
		*/

	}
	public boolean isEquilateral(){

		/*
		if (1 sideLengths && 2 sideLengths == 3 sideLengths)
			return true;
		else
			return false;
		*/

	}

	}