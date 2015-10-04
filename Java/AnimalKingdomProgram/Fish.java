/*
Name:
Connor Cheng (G00963340)
Course:      CIS-255
Instructor:  Jessica Masters
Project 4:   Animal class due 10/14/2015
Filename:    Fish.java
Description: Console application that holds and reads animal classes.
*/


public class Fish extends Animal implements WaterLiveable {

	public Fish(String name) {
		super(name);
	}	

	public boolean isWarmBlooded(){
		return false;	
	}

	public boolean canLiveOnLand(){
		return false;
	}

	public String toString(){
		return super.toString();
	}
}