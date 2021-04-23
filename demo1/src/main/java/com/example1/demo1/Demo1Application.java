package com.example1.demo1;

import java.util.Scanner;

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
	public CommandLineRunner initApp(){
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
		};
	}

}
