/*
Name:
Connor Cheng (G00963340)
Course:      CIS-255
Instructor:  Jessica Masters
Project 4:   Animal class due 10/14/2015
Filename:    Dog.java
Description: Console application that holds and reads animal classes.
*/


public class Dog extends Animal implements Adoptable {
	
	protected String homeInstructions;
	
	public Dog(String name){
		super(name);
		homeInstructions = "These are home instructions.";
	}

	public boolean isWarmBlooded() {
		return true;
	}

	public String toString() {
		return super.toString();
	}
	
	public String getHomeCareInstructions() {
		return homeInstructions;
	}
}