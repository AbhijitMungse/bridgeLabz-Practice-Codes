package com.bridgelabz0711;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumberWithComputer {

	public static void main(String[] args) {
		
		 Random random = new Random();
	        int randomNumber = random.nextInt(100) + 1; // Random number between 1 and 100

	        Scanner sc = new Scanner(System.in);
	        int guess;
	        int maxAttempts = 5; // Set the maximum number of attempts
	        int attempts = 0;
	        boolean userWon = false;

	        System.out.println("Welcome to the Guess the Number Game!");
	        System.out.println("I have selected a random number between 1 and 100.");
	        
	        while (attempts < maxAttempts) {
	            System.out.print("Enter your guess: ");
	            guess = sc.nextInt();
	            attempts++;

	            if (guess < randomNumber) {
	                System.out.println("Too low! Try again.");
	            } else if (guess > randomNumber) {
	                System.out.println("Too high! Try again.");
	            } else {
	                userWon = true;
	                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
	                break;
	            }
	        }

	        if (!userWon) {
	            System.out.println("Sorry, you've reached the maximum number of attempts. The computer wins! The correct number was " + randomNumber);
	        }
	}
}
