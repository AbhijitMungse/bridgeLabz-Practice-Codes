package com.bridgelabz;

import java.util.Random;

public class Example7 {

	public static void main(String[] args) {
		
		 Random random = new Random();

	        // Generate two random integers between 1 and 6
	        int die1 = random.nextInt(6) + 1;
	        int die2 = random.nextInt(6) + 1;

	        // Calculate the sum of the two dice
	        int sum = die1 + die2;

	        System.out.println("Rolling two dice...");
	        System.out.println("Die 1: " + die1);
	        System.out.println("Die 2: " + die2);
	        System.out.println("Sum of the two dice: " + sum);
	}
}
