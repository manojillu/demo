package com.project.springmvc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.springmvc.demo.model.CustomerDetails;
import com.project.springmvc.demo.service.PersonServiceImpl;

@Controller
public class Welcome {
	
	@Autowired
	private PersonServiceImpl personServiceImpl;

	
	@GetMapping("/")
	public String getWelcomeDetails(Model model) {
		List<CustomerDetails> detailsList=personServiceImpl.getDetails();
		model.addAttribute("detailsList", detailsList);
		return "welcome";
	}

}
