package com.example.ej6.personcontrollers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.ArrayList;

@SpringBootApplication
public class Application {

	@Bean
	ArrayList<Ciudad> creaListaCiudades(){
		return new ArrayList<>();
	}

	@Bean
	@Qualifier("bean1")
	Person creaPersona1(){
		return new Person("Rita","Paris",54);
	}

	@Bean
	@Qualifier("bean2")
	Person creaPersona2(){
		return new Person("Mario","Ciudad de Mexico",43);
	}

	@Bean
	@Qualifier("bean3")
	Person creaPersona3(){
		return new Person("Ricardo","Zamora",27);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
