package ty;
import java.util.Scanner;
import java.util.Random;
// Game class
class Game {
	
	int systemInput;
	int userInput;
	int noOfGuesses = 0;
	
	Scanner sc = new Scanner(System.in);
	// generating random number in default constructor
	 {
		Random random = new Random();
		this.systemInput = random.nextInt(100) + 1;
	}
	
	
	// method to take user guesses
	public boolean takeUserInput() {
		if ( noOfGuesses <= 5 ) {
			System.out.print("Guess the number : ");
			this.userInput = sc.nextInt();
			noOfGuesses++;
			return false;
		}
		else {
			System.out.println("Sorry, number of attempts finished...Better luck for next time\n");
			System.out.println("Correct Number was : " +systemInput);
			return true;
		}
	}
	
	
	//method to check user guess status
	public boolean isCorrectGuess() {
		
		if ( systemInput == userInput ) {
			System.out.println("Congratulations, you guess the correct number " + systemInput +
			" in " + noOfGuesses + " guesses");
			switch(noOfGuesses) {
				case 1:
				System.out.println("Your score is 100");
				break;
				case 2:
				System.out.println("Your score is 90");
				break;
				case 3:
				System.out.println("Your score is 80");
				break;
				case 4:
				System.out.println("Your score is 70");
				break;
				case 5:
				System.out.println("Your score is 60");
				break;
				case 6:
				System.out.println("Your score is 50");
				break;
				case 7:
				System.out.println("Your score is 40");
				break;
				case 8:
				System.out.println("Your score is 30");
				break;
				case 9:
				System.out.println("Your score is 20");
				break;
				case 10:
				System.out.println("Your score is 10");
				break;
			}
			System.out.println();
			return true;
		}
		else if ( noOfGuesses < 10 && userInput > systemInput ) {
			if ( userInput - systemInput > 10 ) {
				System.out.println("Your guess is Too High");
			}
			else {
				System.out.println("Your guess is Little High");
			}
		}
		else if ( noOfGuesses < 10 && userInput < systemInput ) {
			if ( systemInput - userInput > 10 ) {
				System.out.println("Your guess is Too low");
			}
			else {
				System.out.println("Your guess is Little low");
			}
		}
		return false;
	}
}


public class Number_Guessing_Game {
	
	// static method to take integer input without any limit and exception error
	// exception handling and input limit handling
	public static int takeIntegerInput(int limit) {
		int input = 0;
		boolean flag = false;
		
		while ( !flag ) {
			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
				flag = true;
				
				if ( flag && input > limit || input < 1 ) {
					System.out.println("Choose the number between 1 to " + limit);
					flag = false;
				}
			}
			catch ( Exception e ) {
				System.out.println("Enter only integer value");
				flag = false;
			}
		};
		return input;
	}
	
	// main method
	public static void main(String[] args) {
		
		// input for start the game
		System.out.println("1. Start the Game \n2. Exit");
		System.out.print("Enter your choice : ");
		int choice = takeIntegerInput(2);
		int nextRound = 1;
		int noOfRound = 0;
		
		if ( choice == 1 ) {
			
			
			while ( nextRound == 1 ) {		// to check next round is there or not
	Number_Guessing_Gamember_Game gaNumber_Guessing_Gamember_Game();		// creating object of Game class
				boolean isMatched = false;
				boolean isLimitCross = false;
				System.out.println("\nRound " + ++noOfRound + " starts...");
				System.out.println("Guess any Integer number between 1 to 100 only !!");
				
				while ( !isMatched && !isLimitCross) {		// to check correct guess and limit cross
					isLimitCross = game.takeUserInput();
					isMatched = game.isCorrectGuess();
				}
				
				System.out.println("1. Next Round \n2. Exit");		// input for next round
				System.out.println("Enter your choice : ");
				nextRound = takeIntegerInput(2);
				if ( nextRound != 1 ) {
					System.exit(0);
				}
			}
		}
		else {
			System.exit(0);
		}
	}
}
