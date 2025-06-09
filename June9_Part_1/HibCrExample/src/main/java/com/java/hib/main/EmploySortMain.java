package com.java.hib.main;

import java.util.List;

import com.java.hib.dao.EmployDaoImpl;
import com.java.hib.model.Employ;

public class EmploySortMain {
	public static void main(String[] args) {
		List<Employ> employList = new EmployDaoImpl().showEmploySortedBasic();
		employList.forEach(x ->{
			System.out.println(x);
		});
	}
}
