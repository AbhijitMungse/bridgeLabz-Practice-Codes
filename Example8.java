package com.bridgelabz;

import java.util.Random;

public class Example8 {

	public static void main(String[] args) {
		
		  Random random = new Random();

	        // Generate two random integers between 1 and 10
	        int num1 = random.nextInt(10) + 1;
	        int num2 = random.nextInt(10) + 1;

	        // Generate a random arithmetic operator (+, -, *, or /)
	        String[] operators = {"+", "-", "*", "/"};
	        int operatorIndex = random.nextInt(operators.length);
	        String operator = operators[operatorIndex];

	        double result = 0.0;

	        // Perform the operation based on the selected operator
	        switch (operator) {
	            case "+":
	                result = num1 + num2;
	                break;
	            case "-":
	                result = num1 - num2;
	                break;
	            case "*":
	                result = num1 * num2;
	                break;
	            case "/":
	                if (num2 != 0) {
	                    result = (double) num1 / num2;
	                } else {
	                    System.out.println("Division by zero is not allowed.");
	                    return;
	                }
	                break;
	        }

	        System.out.println("Random Math Operation:");
	        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	    }
}
