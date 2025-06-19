package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Menu;
import com.example.demo.service.MenuService;

@RestController
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	@GetMapping(value="/showMenu")
	public List<Menu> showMenu() {
		return menuService.showMenu();
	}
	
	@GetMapping(value="/searchMenu/{id}")
	public ResponseEntity<Menu> searchById(@PathVariable int id) {
		return menuService.searchByMenuId(id);
	}
}
