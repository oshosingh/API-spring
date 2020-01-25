package com.example.demo;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(value="/api")
	public ResponseEntity<ArrayList> hello() {
		
		ArrayList<UserData> al = GenerateUsers.getUsers();
		return (new ResponseEntity<ArrayList>(al, HttpStatus.OK));
	}
	
}
