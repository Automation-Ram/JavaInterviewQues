package com.prog.interviewque;

public class Extratcadd {

	public static void main(String[] args) {

		String name="Ram12345";
		int total=0;
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(Character.isDigit(ch))
			{
				total=total+Character.getNumericValue(ch);
			}
			
		}
		System.out.println(total);
		

	}

}
