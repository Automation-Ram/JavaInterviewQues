package com.prog.interviewque;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {

		Employee emp1 = new Employee(100, "Ram", 10000000);
		Employee emp2 = new Employee(101, "Rajiv", 10000);
		Employee emp3 = new Employee(102, "Rakesh", 10000000);

		HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
		hm.put(1, emp1);
		hm.put(2, emp2);
		hm.put(3, emp3);

		for (Map.Entry<Integer, Employee> entry : hm.entrySet()) {
			int key = entry.getKey();
			Employee e = entry.getValue();
			System.out.println(key + " Details");
			System.out.println(e.id + " " + e.name + " " + e.salary);
		}

	}

}
