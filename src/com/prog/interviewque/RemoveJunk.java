package com.prog.interviewque;

public class RemoveJunk {

	public static void main(String[] args) {

		String name ="@#$%^&* Selenium @#$%^&*";
		System.out.println(name.replaceAll("[a-zA-Z0-9]", " "));

	}

}
