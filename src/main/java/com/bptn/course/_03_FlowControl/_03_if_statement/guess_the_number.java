package com.bptn.course._03_FlowControl._03_if_statement;

import java.util.Scanner;
import java.util.Random;

public class guess_the_number {

	public static void main (String[] args) {
		Random rand = new Random();
		int numberToGuess = rand.nextInt(100); //Random number generator using the Random utility
		int numberOfTries = 0; //number of tries
		Scanner input = new Scanner(System.in);
		int guess;
		boolean win = false;
		
		while (win == false) { //Using While-Loop to loop the iteration until the if-condition is !false
			
			System.out.println("Guess a random number between 1 and 100: ");
			guess = input.nextInt(); //Returns input from user from scanner and store it in the variable guess
			numberOfTries++;
			
			if (guess == numberToGuess) {
				win = true;
				System.out.println("Congratulations! You guessed the number correctly!");
			}
			else if (guess < numberToGuess) {
				System.out.println("Too low! Try again!");
			}
			else if (guess > numberToGuess) {
				System.out.println("Too high! Try again!");
			
			}
	}

}

/*Steps:
 * 1. Creates a random number to guess
 * 2. Keep track of number of guesses
 * 3. Asks user to guess a random number
 * 4. Lets user input a number
 * 5. informs user if guess is too high or too low
 * 6. Keep playing until user guess the correct number
 * 7. Provides user with correct number */		
}