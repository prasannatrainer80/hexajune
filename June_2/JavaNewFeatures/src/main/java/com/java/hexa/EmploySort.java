package com.java.hexa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmploySort {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Stuti", "Java", "Programmer", 99234.33));
		employList.add(new Employ(2, "Venkatesh", "Dotnet", "Manager", 77999.33));
		employList.add(new Employ(3, "Malar", "Sql", "Expert", 88844.33));
		employList.add(new Employ(4, "Jahnavi", "Java", "Programmer", 99234.33));
		employList.add(new Employ(5, "Soumya", "Dotnet", "Tester", 98811.33));
		employList.add(new Employ(6, "Sabari", "React", "Expert", 87742.33));
		
		System.out.println("Sort By Name  ");
		Collections.sort(employList, (e1, e2) -> {
			return e1.getName().compareTo(e2.getName());
		});
		employList.forEach(x -> {
			System.out.println(x);
		});
		
		System.out.println("Sort By Basic-Wise  ");
		Collections.sort(employList, (e1, e2) -> {
			return (int) (e1.getBasic() - e2.getBasic());
		});
		employList.forEach(x -> {System.out.println(x);});
	}
}
