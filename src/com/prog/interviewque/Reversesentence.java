package com.prog.interviewque;

public class Reversesentence {

	public static void main(String[] args) {

		String sen = "Google LLC is an American multinational technology company";

		String rev = "";

		String[] val = sen.split(" ");
		System.out.println(val.length);

		for (int i = val.length - 1; i >= 0; i--) {
			rev = rev + val[i]+ " ";
		}
		System.out.println(rev);

	}

}
