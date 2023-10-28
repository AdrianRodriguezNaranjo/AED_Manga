package com.tarea.mangas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarea.mangas.entity.models.User;
import com.tarea.mangas.entity.services.IUserService;

@CrossOrigin(origins = "*")
@RestController
public class UserController {
	@Autowired
	private IUserService userService;

	@GetMapping("/users")
	public List<User> getAll() {
		return userService.getAll();
	}

	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable(value = "id") long id) {
		return userService.getUserById(id);
	}

	@PostMapping("/users")
	public void post(User user) {
		userService.post(user);
	}

	@PutMapping("/users/{id}")
	public void put(User user, @PathVariable(value = "id") long id) {
		userService.put(user, id);
	}
	
	@DeleteMapping("/users/{id}")
    public void delete(@PathVariable(value = "id") long id) {
		userService.delete(id);
    }
}
