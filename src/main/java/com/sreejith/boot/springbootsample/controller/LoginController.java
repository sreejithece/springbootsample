package com.sreejith.boot.springbootsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sreejith.boot.springbootsample.service.LoginService;

@Controller
@SessionAttributes("uname")

class LoginController {
	
	@Autowired
	LoginService service;
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginpage(ModelMap model){
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String showWelcomepage(ModelMap model, @RequestParam String username, @RequestParam String password){
		//boolean isvalid = service.validateUser(username,password);
		String username1 = (String) model.get("uname");	
		
		boolean isvalid = service.validateUser(username1,password);

		if(!isvalid){
			model.put("errormessage", "invalid credential");
			return "login";
		}
		model.put("uname", username);
		return "welcome";
	}

}
