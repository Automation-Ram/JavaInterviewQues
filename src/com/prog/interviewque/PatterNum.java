package com.prog.interviewque;

public class PatterNum {

	public static void main(String[] args) {

		int num = 1;
		int limit=5;
		for (int row = 0; row < limit; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(num + " ");
				num = num + 1;
			}
			System.out.println(" ");
		}

	}

}
