package com.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapStudents {

	public static void main(String[] args) {
		Map<String, List> students =new HashMap<String, List>();
		List<String> stud1=new ArrayList<String>() {
			{ add("Ajay");
			  add("Vijay");
			}
		};
		
		List<String> stud2=new ArrayList<String>() {
			{ add("Naina");
			  add("Varun");
			}
		};
		
		students.put("EC", stud1);
		students.put("CS", stud2);
		
		Scanner sc=new Scanner(System.in);
		String subject=sc.nextLine();
		System.out.println(students.get(subject));
		
	}

}
