package com.epicode.auth.dispositivo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository

	public interface DispositivoRepository extends CrudRepository<Dispositivo, Long>{

	}

