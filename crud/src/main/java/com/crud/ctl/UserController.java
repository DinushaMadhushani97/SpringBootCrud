package com.crud.ctl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.UserEntity;
import com.crud.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository repository;
	
	@PostMapping("/addUser")
	public UserEntity addUser (@RequestBody UserEntity entity) {
		
	  return repository.save(entity);
	}

}
