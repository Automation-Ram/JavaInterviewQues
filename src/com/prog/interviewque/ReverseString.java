package com.prog.interviewque;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Ram";

		int len = name.length();
		System.out.println(len);
		String rev = " ";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
			
		}
		System.out.println(rev);
	}
}
