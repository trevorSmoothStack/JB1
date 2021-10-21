/**
 * 
 */
package com.ss.sb1.as2;

/**
 * @author trevor
 *
 */

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		final int upperbound = 100;
		int answer = rand.nextInt(upperbound) + 1;
		
		Scanner guessObj = new Scanner(System.in);
		System.out.println("Guess a number between 1-100:");
		String guessString = guessObj.nextLine();
		int guess = Integer.parseInt(guessString);
		System.out.println("Your guess is: " + guess);
		
		int i = 4;
		while (i >= 0) {
			if (i < 1) {
				System.out.print("GAME OVER");
				break;
			}
			if (Math.abs(guess - answer) <= 10) {
				System.out.print("Congratulations! You were within the range. The correct answer was: " + answer);
				guessObj.close();
				break;
			} else {
				System.out.println("I'm sorry, you were out of the range. Please give it another shot. You have " + i + " more tries.");
				guessString = guessObj.nextLine();
				guess = Integer.parseInt(guessString);
				System.out.println("Your guess is: " + guess);	
				}
			i--;
		}
	}

}
