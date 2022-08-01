package com.bl.springbootrequestbody.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bl.springbootrequestbody.model.User;

@RestController
public class UserController {
	
	
	@PostMapping("/users")
	public String printUser(@RequestBody User user) {
		System.out.println("printing user object "+user);
		return "Sucess..";
	}

}
	