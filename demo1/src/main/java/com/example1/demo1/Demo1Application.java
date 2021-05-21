package com.example1.demo1;

import java.util.Scanner;

import com.example1.demo1.model.Role;
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
	public CommandLineRunner initApp( UserServiceImpl userService,RoleServiceImpl roleService ){
		return args -> {
			System.out.println("Hola mundo :v");
			Mando m = new Mando();
			m.setBotones(5);
			m.setColor("negro");
			System.out.println(m.oprimir());
			Scanner s = new Scanner(System.in);
			String usrColor =  s.nextLine();
			m.setColor(usrColor);
			System.out.println("CAMBIADO: "+m.oprimir());
			Role usuario = new Role();
			usuario.setDescription("Rol para usuarios");
			usuario.setName("Usuario");
			Role admin = new Role();
			admin.setDescription("Rol para administradores");
			admin.setName("Admin");
			usuario = roleService.save(usuario);
			admin = roleService.save(admin);
		};
	}
}
