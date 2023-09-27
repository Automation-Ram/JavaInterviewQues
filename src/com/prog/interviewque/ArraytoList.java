package com.prog.interviewque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoList {

	public static void main(String[] args) {
		
		String[] arr= {"Mango","Apple"};
		System.out.println(Arrays.toString(arr));
		
		List<String> l=new ArrayList<String>();
		for(String st:l)
		{
			l.add(st);
		}
		System.out.println("def"+l);
	}

}
