package com.java.hib.main;

import java.util.List;

import com.java.hib.dao.EmployDaoImpl;

public class EmployShowProjectionsMain {
	public static void main(String[] args) {
		EmployDaoImpl impl = new EmployDaoImpl();
		List<Object[]> names = impl.showEmployMultiProjection();
		for (Object[] ob: names) {
			System.out.println(ob[0] + " "  +ob[1] + "  " +ob[2] + "  " + ob[3]);
		}
	}
}
