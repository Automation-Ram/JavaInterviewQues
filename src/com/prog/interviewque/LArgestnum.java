package com.prog.interviewque;

import java.util.Arrays;

public class LArgestnum {

	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 4, 5, 0 };

		int lar = num[0];
		int sm = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > lar) {
				lar = num[i];
			} else if (num[i] < sm) {
				sm = num[i];

			}
		}

		System.out.println("Array to string " + Arrays.toString(num));
		System.out.println(lar);
		System.out.println(sm);

	}

}
