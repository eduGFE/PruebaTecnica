package com.calculadora.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.calculadora.maven")
@EnableAutoConfiguration
public class PruebaTecnicaCalculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaTecnicaCalculadoraApplication.class, args);
	}
}
