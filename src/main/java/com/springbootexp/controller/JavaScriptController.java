package com.springbootexp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JavaScriptController {


	@RequestMapping(value="/firstJavaScript",method=RequestMethod.GET)
	String startJavaScriptPage(){
		return "firstJavaScript";
	}
	
	@RequestMapping(value="/firstJavaScript",method=RequestMethod.POST)
	String backtoMainPage(@RequestParam String action){
		
		if (action.equals("login")) {
			return "redirect:/login";
		}
		
		return "redirect:/main";
	}
	
//	@RequestMapping(value="/firstJavaScript",method=RequestMethod.POST)
//	String gotoLogin(){
//		return "redirect:/login";
//	}
}
