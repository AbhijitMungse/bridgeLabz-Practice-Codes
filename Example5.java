package com.bridgelabz;

import java.util.Scanner;

public class Example5 {
	public static double kmhToMs(double speedKmh) {
		double speedMs = speedKmh * 1000 / 3600;
		return speedMs;
	}

	public static double msToKmh(double speedMs) {
		double speedKmh = speedMs * 3600 / 1000;
		return speedKmh;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Choose conversion direction (1 for km/h to m/s, 2 for m/s to km/h): ");
		int choice = scanner.nextInt();

		if (choice == 1) {
			System.out.print("Enter speed in km/h: ");
			double speedKmh = scanner.nextDouble();
			double speedMs = kmhToMs(speedKmh);
			System.out.println(speedKmh + " km/h is equal to " + speedMs + " m/s");
		} else if (choice == 2) {
			System.out.print("Enter speed in m/s: ");
			double speedMs = scanner.nextDouble();
			double speedKmh = msToKmh(speedMs);
			System.out.println(speedMs + " m/s is equal to " + speedKmh + " km/h");
		} else {
			System.out.println("Invalid choice. Please enter '1' for km/h to m/s or '2' for m/s to km/h.");
		}
	}
}
