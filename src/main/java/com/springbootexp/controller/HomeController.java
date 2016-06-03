package com.springbootexp.controller;

//import javax.persistence.Column;
//import javax.persistence.Entity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbootexp.model.HomeBean;

@Controller
public class HomeController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	String index(ModelMap model) {
		model.addAttribute("msg", "Hello Spring MVC Framework!");
		model.addAttribute("homebean", new HomeBean());

		return "main";
	}
}

