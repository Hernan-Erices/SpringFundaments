package com.alejandro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CadenasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadenasApplication.class, args);
	}
	
	// "/" ES EL HOME DE NUESTRA PAGINA
    @RequestMapping("/")
    public String hello() { // 3
            return "Hola cliente, ¿Como estas?";
    }
    //AL LLAMAR MEDIANTE URL localhost/random nos mostrara esta pagina
    @RequestMapping("/random")
    public String message() { // 3
            return "Spring Boot es increible!";
    }
}
