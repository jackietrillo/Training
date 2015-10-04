/*
Name:
Connor Cheng (G00963340)
Course:      CIS-255
Instructor:  Jessica Masters
Project 4:   Animal class due 10/14/2015
Filename:    Animal.java
Description: Console application that holds and reads animal classes.
*/

public abstract class Animal {
	protected String animalName;
	
	public Animal() {
		this.animalName = "";
	}
	
	public Animal(String animalName) {
		this.animalName = animalName;		
	}
	
	public String getName() {
		return this.animalName;
	}
	
	public abstract boolean isWarmBlooded();
	
	public String toString() {
		return animalName;
	}
	
}