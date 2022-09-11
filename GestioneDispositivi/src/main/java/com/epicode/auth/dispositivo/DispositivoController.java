package com.epicode.auth.dispositivo;

import org.springframework.beans.factory.annotation.Autowired;
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
	public class DispositivoController {
	
	
		@Autowired
		private DispositivoService repo;
		
		@GetMapping("/{id}")
		public void getPrenotazioneById(@PathVariable Long id){
			repo.read(id);
		}
		@PostMapping
		public void postUtente(@RequestBody Dispositivo dispositivo) {
			repo.create(dispositivo);
		}
		@PutMapping
		public void putUtente(@RequestBody Dispositivo  dispositivo ) {
			repo.update(dispositivo );
		}
		@DeleteMapping("/{id}")
		public void deleteUtente(@PathVariable Long id) {
			repo.delete(id);
		}
}
