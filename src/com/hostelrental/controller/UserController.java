package com.hostelrental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hostelrental.dao.IUserDao;
import com.hostelrental.pojos.Users;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

	@Autowired
	private IUserDao dao;
	
	public UserController() {
		System.out.println("In User Controller");
	}
	
	@GetMapping("/validate")
	public ResponseEntity<?> validateUser(@RequestParam String email, @RequestParam String pass){
		try {
			return new ResponseEntity<Users>(dao.validate(email, pass),HttpStatus.OK);
		}catch(RuntimeException exp) {
			return new ResponseEntity<String>("User Not Found" + exp.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
