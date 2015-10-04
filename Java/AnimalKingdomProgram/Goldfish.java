/*
Name:
Connor Cheng (G00963340)
Course:      CIS-255
Instructor:  Jessica Masters
Project 4:   Animal class due 10/14/2015
Filename:    Goldfish.java
Description: Console application that holds and reads animal classes.
*/


public class Goldfish extends Fish implements WaterLiveable, Adoptable {
	
	protected String homeInstructions;
	
	public Goldfish(String name) {
		super(name);
		homeInstructions = "These are home instructions.";
	}		
	
	public boolean isWarmBlooded(){
		return false;	
	}

	public boolean canLiveOnLand(){
		return false;
	}

	public String getHomeCareInstructions() {
		return homeInstructions;
	}

	public String toString(){
		return super.toString();
	}
}