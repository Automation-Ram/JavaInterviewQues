package com.prog.interviewque;

public class PatternEx {

	public static void main(String[] args) {

		int num = 5;
		for (int row = 0; row < num; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

}
