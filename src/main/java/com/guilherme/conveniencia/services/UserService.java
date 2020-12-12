package com.guilherme.conveniencia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.conveniencia.models.User;
import com.guilherme.conveniencia.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository users;
	
	public List<User> findAll() {
		return users.findAll();
	}
	
	public User findById(Long id) {
		
		Optional<User> obj = users.findById(id);
		return obj.get();
	}

}
