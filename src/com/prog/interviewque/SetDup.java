package com.prog.interviewque;

import java.util.HashSet;
import java.util.Set;

public class SetDup {

	public static void main(String[] args) {
		
		String name[]= {"Java","Ram","Java"};
		
		Set<String> lang=new HashSet<String>();
		for(String names:name)
		{
			if(lang.add(names)==false)
			{
				System.out.println("DE "+names);
			}
		}
		

	}

}
