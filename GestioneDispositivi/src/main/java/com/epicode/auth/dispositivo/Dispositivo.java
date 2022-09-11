package com.epicode.auth.dispositivo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.epicode.auth.roles.Role;
import com.epicode.auth.users.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dispositivo {
	
	private DispositivoEnum tipo;
	private StatoDispositivoEnum status;
}
