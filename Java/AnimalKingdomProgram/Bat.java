/*
Name:
Connor Cheng (G00963340)
Course:      CIS-255
Instructor:  Jessica Masters
Project 4:   Animal class due 10/14/2015
Filename:    Bat.java
Description: Console application that holds and reads animal classes.
*/


public class Bat extends Animal implements Flyable {

	private double flightSpeed;
	
	public Bat(String name, double flightSpeed){
		super(name);
		this.flightSpeed = flightSpeed;
	}

	public boolean isWarmBlooded(){
		return true;	
	}

	public double getFlightSpeed(){
		return this.flightSpeed;
	}

	public String toString(){
		return super.toString();
	}
}
