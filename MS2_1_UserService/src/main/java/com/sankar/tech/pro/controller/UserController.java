package com.sankar.tech.pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sankar.tech.pro.dto.UserWithDeptResponse;
import com.sankar.tech.pro.entity.User;
import com.sankar.tech.pro.repository.UserRepository;
import com.sankar.tech.pro.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user)
	{
		return userService.saveUser(user);
	}
	
	
	@GetMapping("/")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@GetMapping("/{userId}")
	public UserWithDeptResponse getUserWithDepartment(@PathVariable(name = "userId") Long userId)
	{
		return userService.getUserWithDepartment(userId);
	}

}
