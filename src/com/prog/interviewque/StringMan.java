package com.prog.interviewque;

public class StringMan {

	public static void main(String[] args) {

		String sen = "We won BMW car";
		System.out.println(sen.length());
		System.out.println(sen.charAt(13));
		System.out.println(sen.indexOf('r'));

		System.out.println(sen.substring(0, 7));

		String s = " Hello World ";
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));
		String date = "12/12/12";
		System.out.println(date.replace("/", "--"));

		String se = "Hello_world_into_selenium";
		String test[] = se.split("_");
//		for (int i=0;i<test.length;i++) {
//			System.out.println(test[i]);
//		}
		for (String testva : test) {
			System.out.println(testva);
		}
		
		String s2="car";
		System.out.println(s2.concat("s"));
		
		

	}

}
