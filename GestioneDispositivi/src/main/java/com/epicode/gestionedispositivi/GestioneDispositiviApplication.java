package com.epicode.gestionedispositivi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.epicode.auth.dispositivo.Dispositivo;
import com.epicode.auth.dispositivo.DispositivoEnum;
import com.epicode.auth.dispositivo.StatoDispositivoEnum;
import com.epicode.auth.users.User;

@SpringBootApplication
public class GestioneDispositiviApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestioneDispositiviApplication.class, args);
		
	}

}
