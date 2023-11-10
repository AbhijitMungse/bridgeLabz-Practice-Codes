package com.bridgelabz0711;

public class ArrayOfSquares {

	public static void main(String[] args) {
		
		int numbers = 10; 
        int[] squares = new int[numbers];

        for (int i = 1; i <= numbers; i++) {
            squares[i - 1] = i * i; 
        }
        
        System.out.println("Array of squares from 1 to 10: ");
        for (int i = 0; i < numbers; i++) {
            System.out.println("Square of " + (i + 1) + " is " + squares[i]);
        }
	}
}
