package com.prog.interviewque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {

		List<String> ll = new ArrayList<String>();
		ll.add("Mango");
		ll.add("Lemo");
		String[] arr = ll.toArray(new String[ll.size()]);
		System.out.println(Arrays.toString(arr));
		System.out.println(ll);

	}

}
