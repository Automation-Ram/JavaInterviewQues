package com.prog.interviewque;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProg {

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Ram", 100000);
		Employee emp2 = new Employee(102, "Rajiv", 10);
		Employee emp3 = new Employee(103, "Rakesh", 1000000);

		ArrayList<Employee> ar1 = new ArrayList<Employee>();
		ar1.add(emp1);
		ar1.add(emp2);
		ar1.add(emp3);

		Iterator it = ar1.iterator();

		while (it.hasNext()) {
			Employee ep = (Employee) it.next();
			System.out.println(ep.id + " " + ep.name + " " + ep.salary);
		}

	}

}
