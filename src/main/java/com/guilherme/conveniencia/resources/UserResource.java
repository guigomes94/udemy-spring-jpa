package com.guilherme.conveniencia.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilherme.conveniencia.models.User;
import com.guilherme.conveniencia.services.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> listAll() {
		List<User> users = userService.findAll();
		return ResponseEntity.ok().body(users);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findOne(@PathVariable Long id) {
		User obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
