package com.prog.interviewque;

public class VowelsCount {

	public static void main(String[] args) {

		String name = "Raam";
		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e') {

				count++;
			}

		}
		System.out.println("Vowels Count " + count);

	}

}
