package com.prog.interviewque;

public class StringChar {

	public static void main(String[] args) {

		String name = "Ram Automation Engineer";

		char[] ch = name.toCharArray();
		int len = 0;

		for (char car : ch) {
			
			len++;
		}
		System.out.println(len);

	}

}
