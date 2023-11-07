package com.bridgelabz;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) 
	{

		double pounds;
		double kilograms;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weight in pounds: ");
		pounds=sc.nextFloat();

		kilograms=pounds/2.20;

		System.out.println("Weight in kg: "+kilograms+"gm");
	}
}
