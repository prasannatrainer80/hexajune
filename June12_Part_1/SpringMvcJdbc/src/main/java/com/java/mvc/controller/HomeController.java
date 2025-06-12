package com.java.mvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.mvc.dao.EmployDao;
import com.java.mvc.model.Employ;

@Controller
public class HomeController {

	@Autowired
	private EmployDao employDao;
	
	@RequestMapping(value="/saveemploy")
	public ModelAndView saveEmploy(HttpServletRequest request) {
		Employ employNew = new Employ();
		employNew.setEmpno(Integer.parseInt(request.getParameter("empno")));
		employNew.setName(request.getParameter("name"));
		employNew.setGender(request.getParameter("gender"));
		employNew.setDept(request.getParameter("dept"));
		employNew.setDesig(request.getParameter("desig"));
		employNew.setBasic(Double.parseDouble(request.getParameter("basic")));
		employDao.addEmployDao(employNew);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/addemploy")
	public ModelAndView addEmploy() {
		return new ModelAndView("addemploy");
	}
	
	@RequestMapping(value="/deleteemploy")
	public ModelAndView deleteEmployDao(HttpServletRequest request) {
		int empno = Integer.parseInt(request.getParameter("empno"));
		employDao.deleteEmployDao(empno);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/updateemploy")
	public ModelAndView updateEmploy(HttpServletRequest request) {
		Employ employUpdated = new Employ();
		employUpdated.setEmpno(Integer.parseInt(request.getParameter("empno")));
		employUpdated.setName(request.getParameter("name"));
		employUpdated.setGender(request.getParameter("gender"));
		employUpdated.setDept(request.getParameter("dept"));
		employUpdated.setDesig(request.getParameter("desig"));
		employUpdated.setBasic(Double.parseDouble(request.getParameter("basic")));
		employDao.updateEmployDao(employUpdated);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/employsearch")
	public ModelAndView search(HttpServletRequest request) {
		int empno = Integer.parseInt(request.getParameter("empno"));
		Employ employ = employDao.searchEmployDao(empno);
		return new ModelAndView("updateemploy","result",employ);
	}
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		List<Employ> employList = employDao.showEmployDao();
		return new ModelAndView("home","result",employList);
	}
}
