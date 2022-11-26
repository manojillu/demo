package com.project.springmvc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.springmvc.demo.bean.Persons;
import com.project.springmvc.demo.service.PersonServiceImpl;

@Controller
public class WelcomeController {
	
	@Autowired
	private PersonServiceImpl personServiceImpl;

	
	@GetMapping("/")
	public String getWelcomeDetails(Model model) {
		List<Persons> detailsList=personServiceImpl.getDetails();
		model.addAttribute("detailsList", detailsList);
		return "welcome";
	}

}
