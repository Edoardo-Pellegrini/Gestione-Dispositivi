package com.epicode.auth.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.mapping.CrudMethodsSupportedHttpMethods;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import io.swagger.v3.oas.annotations.parameters.RequestBody;
	@RestController
	@RequestMapping("/utenti")
	public class UserController {
		@Autowired
		private UserService repo;
		
		@GetMapping("/{id}")
		public void getUserById(@PathVariable Long id){
			repo.read(id);
		}
		@PostMapping
		public void postUser(@RequestBody User utente) {
			repo.create(utente);
		}
		@PutMapping
		public void putUser(@RequestBody User utente) {
			repo.update(utente);
		}
		@DeleteMapping("/{id}")
		public void deleteUser(@PathVariable Long id) {
			repo.delete(id);
		}

}
