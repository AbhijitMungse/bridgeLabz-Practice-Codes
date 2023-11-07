package com.bridgelabz;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number of seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;  
        int minutes = (totalSeconds % 3600) / 60; 
        int seconds = totalSeconds % 60;

        System.out.println(totalSeconds + " seconds is equal to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");

	}
}
