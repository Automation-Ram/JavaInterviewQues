package com.prog.interviewque;

public class ReverseInteger {

	public static void main(String[] args) {

		int n = 12345;
		int revnum = 0;

		while (n != 0) {
			revnum = revnum * 10 + n % 10;
			n = n / 10;
		}
		System.out.println(revnum);

	}

}
