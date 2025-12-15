package com.bluescope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Find_Salary {
	public static void main(String[] args) {
		Map<Integer,Employee>  map = new HashMap<>();
		map.put(1, new Employee(101,"Valar","Female",50000));
		map.put(2, new Employee(102,"Abi","male",100000));
		map.put(3, new Employee(103,"Viki","male",20000));
		map.put(4, new Employee(104,"Dinesh","male",5000));
		
		ArrayList<Double> list =new ArrayList<>();

		for(Employee emp :map.values()) {
		list.add(emp.salary);
		}
		Collections.sort(list);
		System.out.println("Minimum_Salary  :" + list.get(0));
		System.out.println("Maximum_Salary  :" + (list.get(list.size()-1)));
		System.out.println("Average salary  :" + (list.get(list.size()/2)));
		
	}

}
