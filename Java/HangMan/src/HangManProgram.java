import java.io.*;

public class HangManProgram {
	
	public static void main(String[] args) {
				
		System.out.println("Welcome to the HangMan Game!");
			
		String filePath = new File(".").getAbsolutePath() + "\\bin\\dictionary.txt";
		
		Hangman hangman = new Hangman(filePath, 4);			
		String randomWord = hangman.getRandomWord();
		int randomWordLength = randomWord.length();		
		
		System.out.println(String.format("\nA random word with %d letters has been selected.",  randomWordLength));
						
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 	
				
		while (hangman.hasGuesses() && !hangman.wordGuessed()) {
			
			System.out.println("\nPlease guess a letter:");
							
			try {
				String input = reader.readLine();	
				
				if (input.length() > 1) {
					throw new InvalidGuessException("Invalid guess!");
				}
				
				hangman.guess(input);	
				
			} catch (IOException ex) {
				System.out.println(ex.getMessage());					    												
			} 
			catch (InvalidGuessException ex) {
				System.out.println(ex.getMessage());
			}
			
			System.out.println(hangman.display());				
		}
		
		if (hangman.wordGuessed()) {
			System.out.println("Congrats, you have guessed the word!");			
		}
		else 
		{
			System.out.println("Sorry, You Lose!");			
		}
		
	}

}

