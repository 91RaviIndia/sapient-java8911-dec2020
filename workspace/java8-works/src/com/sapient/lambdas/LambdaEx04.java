package com.sapient.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// to sort person with pid and name (asc / desc) 


public class LambdaEx04 {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(
			new Person(101, "Tarun"), 
			new Person(45, "Rohit"), 
			new Person(66, "Ankit"), 
			new Person(23, "Savitha"), 
			new Person(88, "Prina") 
		); 
		
		// old style code 
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getpName().compareTo(o2.getpName()); 
			}
		} );
		
		list.forEach(p -> System.out.println(p));
		
		// descending order (lambda) 
		System.out.println("--------------descending order name  (lambda)-----------------  ");
		
		list.sort((o1,o2) -> o2.getpName().compareTo(o1.getpName()));
		
		list.forEach(p -> System.out.println(p));
		
		// ascending order of pId 
		System.out.println("--------- ascending order of pId ---------------");
		Comparator<Person> onPID = (o1, o2) -> o1.getpId() - o2.getpId(); 
		list.sort(onPID); 
		list.forEach(System.out :: println);
		
		// descending order of PID 
		System.out.println("----------descending order of PID ------------");
		list.sort(onPID.reversed());
		list.forEach(System.out :: println);

	}
}













