package com.bridgelabz0711;

import java.util.Random;
import java.util.Scanner;

public class RandomArrayGenerator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        double[] randomArray = generateRandomArray(size);
        System.out.println("Random Array:");
        for (double num : randomArray) {
            System.out.print(num + " ");
        }

    }

    private static double[] generateRandomArray(int size) {
        Random random = new Random();
        double[] randomArray = new double[size];

        for (int i = 0; i < size; i++) {
            double randomNumber = 100.0 + (random.nextDouble() * (500.0 - 100.0));
            randomArray[i] = randomNumber;
        }

        return randomArray;
	}
}
