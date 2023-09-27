package com.prog.interviewque;

public class Array {
	
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5};
		int num=44;
		boolean found= false;
		
		for(int array:ar)
		{
			if(array==num)
			{
			 found=true;
				break;
			}
		}
		
		if(found)
		{
			System.out.println("Present");
		}else
		{
			System.out.println("NF");
		}
		
		
	}
	
	
}
