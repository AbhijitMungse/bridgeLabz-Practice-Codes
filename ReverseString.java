package com.bridgelabz0711;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Akanksha";
		int leng = s.length();
		String rev = "";

		for (int i = leng - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
}
