package com.itb.tcc.inf2cm.myproject2c.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.tcc.inf2cm.myproject2c.model.Pessoa;
import com.itb.tcc.inf2cm.myproject2c.model.PessoaFisica;
import com.itb.tcc.inf2cm.myproject2c.repository.PessoaFisicaRepository;
import com.itb.tcc.inf2cm.myproject2c.repository.PessoaRepository;

@Controller
@RequestMapping("/sistema")
public class PessoaController {
	
	
	@Autowired
	private PessoaFisicaRepository pessoaFisicaRepository;
	
	@GetMapping("/teste")
	String cadPessoa() {
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		
		pessoaFisica.setBairro("Jd Belval");
		pessoaFisica.setCep("06144-589");
		pessoaFisica.setCidade("Barueri");
		pessoaFisica.setCodStatusPessoa(true);
		pessoaFisica.setEmail("pessoaF@gmail.com");
		pessoaFisica.setLogradouro("Rua Grupo Bandeirantes");
		pessoaFisica.setSenha("123");
		pessoaFisica.setTelefone("5421-8954");
		pessoaFisica.setUf("Sp");
		pessoaFisica.setNome("João da Silva");
		pessoaFisica.setCpf("2653141254");
		
		pessoaFisicaRepository.save(pessoaFisica);
	
		return "index";
	}

}
