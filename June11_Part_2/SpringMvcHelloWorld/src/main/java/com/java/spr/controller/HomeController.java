package com.java.spr.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.spr.model.Employ;

@Controller
public class HomeController {

	@RequestMapping(value="/calc")
	public ModelAndView calc() {
		return new ModelAndView("calc");
	}
	
	@RequestMapping(value="/showEmploy")
	public ModelAndView showEmploy() {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Varsha", 88423));
		employList.add(new Employ(2, "Rishab", 90052));
		employList.add(new Employ(3, "Amal", 91155));
		employList.add(new Employ(4, "Sandhiya", 90066));
		employList.add(new Employ(5, "Rokhita", 87722));
		return new ModelAndView("employList","employList",employList);
	}
	
	@RequestMapping(value="/showNames")
	public ModelAndView show() {
		List<String> names = new ArrayList<String>();
		names.add("Bala");
		names.add("Rokhitha");
		names.add("Santana Sri");
		names.add("Tawfeek");
		names.add("Rishab");
		names.add("Varsha");
		return new ModelAndView("showNames","names",names);
	}
	
	@RequestMapping(value="/loginresult")
	public ModelAndView loginResult(HttpServletRequest request) {
		String user = request.getParameter("userName");
		String pwd = request.getParameter("passCode");
		if (user.equals("Hexa") && pwd.equals("Hexa")) {
			return new ModelAndView("Menu");
		}
		return new ModelAndView("login","error","Invalid Credentials...");
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/calcresult")
	public ModelAndView calcResult(HttpServletRequest request) {
		int firstNo = Integer.parseInt(request.getParameter("firstNo"));
		int secondNo = Integer.parseInt(request.getParameter("secondNo"));
		int result = firstNo + secondNo;
		return new ModelAndView("calcresult","result",result);
	}
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/surya")
	public ModelAndView surya() {
		return new ModelAndView("surya");
	}
	
	@RequestMapping(value="/bala")
	public ModelAndView bala() {
		return new ModelAndView("bala");
	}
}
