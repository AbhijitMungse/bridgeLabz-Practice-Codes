package com.bridgelabz0711;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to generate its multiplication table: ");
		int number=sc.nextInt();

		System.out.println("Multiplication table for " + number + ":");
		
		for(int i=1;i<=5;i++)
		{
			int result= number*i;
			System.out.println(number +" * "+ i +"= "+ result);
		}
	}
}
