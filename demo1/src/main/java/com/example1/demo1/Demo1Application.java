package com.example1.demo1;

import java.util.Scanner;

import com.example1.demo1.dao.UserDao;
import com.example1.demo1.dto.NotaDto;
import com.example1.demo1.dto.UserDto;
import com.example1.demo1.model.Nota;
import com.example1.demo1.model.Role;
import com.example1.demo1.model.User;
import com.example1.demo1.service.NotaService;
import com.example1.demo1.service.impl.NotaServiceImpl;
import com.example1.demo1.service.impl.RoleServiceImpl;
import com.example1.demo1.service.impl.UserServiceImpl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	@Bean
	public CommandLineRunner initApp( UserServiceImpl userService,RoleServiceImpl roleService, NotaServiceImpl notaService ){
		return args -> {
			//Creacion de roles
			Role usuario = new Role();
			usuario.setDescription("Rol para usuarios");
			usuario.setName("Usuario");
			Role admin = new Role();
			admin.setDescription("Rol para administradores");
			admin.setName("Admin");
			//Guardado por repositorio
			usuario = roleService.save(usuario);
			admin = roleService.save(admin);
			//Creacion de usuario
			UserDto test = new UserDto();
			test.setColor("negro");
			test.setName("Juan");
			test.setPassword("123");
			test.setUsername("MightyXyah");
			//guardado
			User saved = userService.save(test);
			//Creacion de nota
			NotaDto nota = new NotaDto();
			nota.setContenido("habia una vez un barco chiquito");
			nota.setTitulo("Historia 1");
			Nota toSave = nota.getNota();
			//asignacion de usuario propietario a la nota
			toSave.setUser(saved);
			Nota savedNota = notaService.saveNota(toSave);
		};
	}
}
