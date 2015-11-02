import java.io.*;
import java.util.*;

public class Hangman  {
	
	private HashMap<Integer, String> randomWords;
	private ArrayList<String> guessedLetters;	
	private String fileName;
	private int maxGuesses;
	private int guessCount;
	private String randomWord;
		
	public Hangman() {
		this.maxGuesses = 7;		
	}
	
	public Hangman(String fileName, int maxGuesses) {		
		this.fileName = fileName;		
		this.maxGuesses = maxGuesses;		
		this.randomWord = generateRandomWord();
		this.guessedLetters = new ArrayList<String>();
		this.guessCount = 0;
	}
		
	public boolean validInput(String str)
	{
	    for (char c : str.toCharArray())
	    {
	        if (!Character.isDigit(c)) return false;
	    }
	    return true;
	}
	
	public Boolean hasGuesses() {
		
		return this.guessCount < this.maxGuesses;
	}
	
	public Boolean wordGuessed() {
			
		for(int i=0; i < this.randomWord.length(); i++) {			
			char currentLetter =  this.randomWord.charAt(i);
			if (!this.guessedLetters.contains(String.valueOf(currentLetter))) {
				return false;
			}			
		}
		return true;  
	}
	
	private String generateRandomWord() {
		
		if (this.randomWord == null) {
		
			this.randomWords = GetRandomWords(this.fileName);
	
			Random random = new Random();
			int randomWordIndex = random.nextInt(this.randomWords.size());
		
			this.randomWord = randomWords.get(randomWordIndex);
		}
		return this.randomWord;
	}
			
	public String getRandomWord() {		
		return this.randomWord;
	}
	
	private HashMap<Integer,String> GetRandomWords(String fileName)
	{
		HashMap<Integer, String> randomWords = new HashMap<Integer,String>();
		
        String line = null;

        try {

            FileReader fileReader =  new FileReader(fileName);           
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int index = 1;
            while((line = bufferedReader.readLine()) != null) {            	
            	randomWords.put(index, line);            	
            	index++;
            }   
            bufferedReader.close();                          
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println( "Error reading file '" + fileName + "'");                  
        }
        
		return randomWords;	
	}
	
	public String display() {
		String output = "";
		
		for(int i=0; i < this.randomWord.length(); i++) {			
			char currentLetter =  this.randomWord.charAt(i);
			if (this.guessedLetters.contains(String.valueOf(currentLetter))) {
				output += String.format("%c ", currentLetter ); 
			}
			else 
			{
				output += "_ ";				
			}
		}
		return output; 
	}
	
	public void guess(String letter) {			
		this.guessCount++;
		this.guessedLetters.add(letter);	  		
	}
}
