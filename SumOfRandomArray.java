package com.bridgelabz0711;

import java.util.Random;

public class SumOfRandomArray {

	public static void main(String[] args) {
		
		  int[] randomArray = generateRandomIntArray(25);
	        int sum = calculateSum(randomArray);
	        double average = calculateAverage(randomArray);

	        System.out.println("Random Array:");
	        for (int num : randomArray) {
	            System.out.print(num + " ");
	        }
	        System.out.println("\nSum of the elements: " + sum);
	        System.out.println("Average of the elements: " + average);
	    }

	    private static int[] generateRandomIntArray(int size) {
	        Random random = new Random();
	        int[] randomArray = new int[size];

	        for (int i = 0; i < size; i++) {
	            randomArray[i] = random.nextInt(101); 
	        }

	        return randomArray;
	    }

	    private static int calculateSum(int[] array) {
	        int sum = 0;
	        for (int num : array) {
	            sum += num;
	        }
	        return sum;
	    }

	    private static double calculateAverage(int[] array) {
	        int sum = calculateSum(array);
	        return (double) sum / array.length;
	}
}
