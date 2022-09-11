package com.epicode.auth.dispositivo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class DispositivoService {
	@Autowired
	private DispositivoRepository repo;
	
	public void create(Dispositivo dispositivo) {
		repo.save(dispositivo);
		
	}

	public Dispositivo read(Long id) {
		return repo.findById(id).get();
	}
	public void update(Dispositivo dispositivo) {
		repo.save(dispositivo);
	}
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
