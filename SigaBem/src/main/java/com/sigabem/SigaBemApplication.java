package com.sigabem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Classe principal da aplicação Siga Bem.
 */
@SpringBootApplication
@EnableFeignClients
public class SigaBemApplication {

	/**
	 * Ponto de entrada da aplicação.
	 *
	 * @param args Argumentos da linha de comando.
	 */
	public static void main(String[] args) {

		SpringApplication.run(SigaBemApplication.class, args);
	}

}
