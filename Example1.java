package com.bridgelabz;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		int orderId;
		String itemName;
		int quantity;
		double totalCost;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Order Id: ");
		orderId=sc.nextInt();
		System.out.println("Enter Item Name: ");
		itemName=sc.next();
		System.out.println("Enter quantity: ");
		quantity=sc.nextInt();
		System.out.println("Enter Total Cost: ");
		totalCost=sc.nextInt();
		
		System.out.println("Order ["+orderId+"]: "+"["+quantity+"] "+ "of ["+itemName+"] "+" Total Cost Rs ["+totalCost+"]");
	}
}
