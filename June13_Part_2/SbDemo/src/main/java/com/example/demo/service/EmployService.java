package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employ;

@Service
public class EmployService {

	static List<Employ> employList;
	static {
		employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Stuti", 94923));
		employList.add(new Employ(2, "Balaji", 88233));
		employList.add(new Employ(3, "Prasanna", 91144));
		employList.add(new Employ(4, "Nivetha", 90342));
		employList.add(new Employ(5, "Cherish", 88425));
	}
	
	public List<Employ> showEmploy() {
		return employList;
	}
	
	public Employ searchEmploy(int empno) {
		Employ employFound = null;
		for (Employ employ : employList) {
			if (employ.getEmpno()==empno) {
				employFound = employ;
				break;
			}
		}
		return employFound;
	}
}