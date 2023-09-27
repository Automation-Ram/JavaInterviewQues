package com.prog.interviewque;

public class OccChar {

	public static void main(String[] args) {

		String name = "Raam";
		char toFind = 'a';
		int occ = 0;
		name = name.toLowerCase();

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == toFind) {
				occ++;
			}
		}
		System.out.println(toFind + " is presnt " + occ + " number of line");
	}

}
