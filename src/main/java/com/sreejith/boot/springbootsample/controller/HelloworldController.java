package com.sreejith.boot.springbootsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("uname")
class HelloworldController {
	
	@RequestMapping("/helloworld")
	@ResponseBody
	public String logStandardMessage(){
		return "Hello World";
	}

	@RequestMapping("/helloworld2")
	public String logCustomMessage(@RequestParam String name, ModelMap model){
		model.put("uname", name);
		return "welcome";
	}
}
