package com.mng.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mng.user.db.UserRepository;
import com.mng.user.model.User;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(method = RequestMethod.POST, value = { "/users" })
	public String addUser(@RequestBody User user) {
		userRepository.save(user);
		return "Save";
	}

	@RequestMapping("/users")
	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(e -> users.add(e));

		return users;
	}
}
