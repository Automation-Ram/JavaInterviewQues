package com.prog.interviewque;

public class VowelsPresent {

	public static void main(String[] args) {

		String sentence = "Hello";

		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i'
					|| sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
				System.out.println("VOWELS Present"+ sentence.charAt(i));
			} else {
				System.out.println("Vowels NP");
			}
		}

	}

}
