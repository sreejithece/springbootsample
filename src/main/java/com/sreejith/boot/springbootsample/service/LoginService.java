package com.sreejith.boot.springbootsample.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean validateUser(String username, String password){
		return username.equalsIgnoreCase("sree") && password.equalsIgnoreCase("password");		
	}

}
