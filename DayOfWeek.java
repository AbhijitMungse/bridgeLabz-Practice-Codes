package com.bridgelabz0711;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number from 1 to 7: ");
		int dayNumber = sc.nextInt();

		String dayOfWeek;

		switch (dayNumber) {
		case 1:
			dayOfWeek = "Sunday";
			break;
		case 2:
			dayOfWeek = "Monday";
			break;
		case 3:
			dayOfWeek = "Tuesday";
			break;
		case 4:
			dayOfWeek = "Wednesday";
			break;
		case 5:
			dayOfWeek = "Thursday";
			break;
		case 6:
			dayOfWeek = "Friday";
			break;
		case 7:
			dayOfWeek = "Saturday";
            break;
            
		default:
			dayOfWeek = "Invalid input, Please enter number from 1 to 7 only!!";

		}
		System.out.println("Day of week is: " + dayOfWeek);

	}
}
