package com.prog.interviewque;

public class ReplaceVol {

	public static void main(String[] args) {

		String name = "Ram Automation Engineer";

		char[] ch = name.toCharArray();

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				ch[i] = '*';

			}

		}
		for (int i = 0; i < name.length(); i++) {
			System.out.print(ch[i]);
		}

	}

}
