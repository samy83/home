package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerREST {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String index() {
		return "HELLO WORLD !";
	}
	
	@RequestMapping("/{id}")
	public String getUser(@PathVariable long id) {
		UserDTO user = userService.getUser(id);
		if(user==null)return "Uilisateur introuvable. Essayez un autre id.";
		return user.toString();
	}
	
	@RequestMapping("/count")
	public String count() {
		return Long.toString(userService.countUsers());
	}
	
	@RequestMapping(path="/create", method = RequestMethod.POST, consumes = "application/json")
	public void createUser (@RequestBody UserDTO user) {
		userService.createUser(user);
	}
	
}
