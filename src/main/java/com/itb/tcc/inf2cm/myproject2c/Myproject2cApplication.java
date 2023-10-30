package com.itb.tcc.inf2cm.myproject2c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itb.tcc.inf2cm.myproject2c.model.Pessoa;
import com.itb.tcc.inf2cm.myproject2c.model.PessoaFisica;

@SpringBootApplication
public class Myproject2cApplication {

	public static void main(String[] args) {
		SpringApplication.run(Myproject2cApplication.class, args);
		
		
		Pessoa p = new PessoaFisica();
	
		
		
		
	}

}
