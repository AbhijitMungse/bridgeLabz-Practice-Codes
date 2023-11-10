package com.bridgelabz0711;

public class DivisionBy3 {

	public static void main(String[] args) {
		int []array=new int[10];
		int index=0;
		
		for(int i=1;i<=30;i++)
		{
			if(i%3==0)
			{
				array[index]=i;
				index++;
			}
		}
		System.out.print("Numbers between 1 and 30 divisible by 3: [");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
			if(i<array.length-1)
			{
				System.out.print(", ");
			}
		}
		
		System.out.println("]");
	}
}
