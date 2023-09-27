package com.prog.interviewque;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementArray {

	public static void main(String[] args) {

		String name[] = { "Java", "Ram", "Java","Ram","Nik","Nik" };

//		for (int i = 0; i < name.length; i++) {
//			for (int j = i+1; j < name.length; j++) {
//				if (name[i].equals(name[j])) {
//					System.out.println("DE " + name[i]);
//				}
//			}
//		}
//		
		
	//	Using Hashset:
		
		Set<String> store=new HashSet<String>();
		for(String names: name)
		{
			if(store.add(names)==false)
			{
				System.out.println("DP"+names);
			}
		}

	}

}
