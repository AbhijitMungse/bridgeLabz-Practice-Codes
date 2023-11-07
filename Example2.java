package com.bridgelabz;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name: ");
		String studentName=sc.next();
		
		System.out.println("Enter physics marks: ");
		int physics=sc.nextInt();
		
		System.out.println("Enter chemistry marks: ");
		int chemistry=sc.nextInt();
		
		System.out.println("Enter mathematics marks: ");
		int mathematics=sc.nextInt();
		
		int totalMarks=physics+chemistry+mathematics;
		
		System.out.println("Total marks: "+ totalMarks);
		
		float physicsPercentage=(physics*100)/100;
		
		System.out.println("Percentage in physics: "+physicsPercentage+"%");
		
		float chemistryPercentage=(chemistry*100)/100;
		
		System.out.println("Percentage in chemistry: "+chemistryPercentage+"%");
		
		float mathematicsPercentage=(mathematics*100)/100;
		
		System.out.println("Percentage is mathematics: "+mathematicsPercentage+"%");
		
		float percentage=(totalMarks*100)/300;
		
		System.out.println("Total Percentage: "+percentage+"%");
		
		
		
	}
}
