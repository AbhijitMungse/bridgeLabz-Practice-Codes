package com.bridgelabz0711;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {

	public static void main(String[] args) {
		
		 Random random = new Random();
	        int randomNumber = random.nextInt(100) + 1; // Random number between 1 and 100

	        Scanner sc = new Scanner(System.in);
	        int guess;
	        int attempts = 0;

	        System.out.println("Welcome to the Guess the Number Game!");
	        System.out.println("I have selected a random number between 1 and 100.");
	        
	        do {
	            System.out.print("Enter your guess: ");
	            guess = sc.nextInt();
	            attempts++;

	            if (guess < randomNumber) {
	                System.out.println("Too low! Try again.");
	            } else if (guess > randomNumber) {
	                System.out.println("Too high! Try again.");
	            } else {
	                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
	            }
	        } while (guess != randomNumber);
	}
}
