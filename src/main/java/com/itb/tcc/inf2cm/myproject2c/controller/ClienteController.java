package com.itb.tcc.inf2cm.myproject2c.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.tcc.inf2cm.myproject2c.model.Cliente;

@Controller
@RequestMapping("/lojamoveis/cliente")
public class ClienteController {
	
	
	// Carregar o formulário de Cadastro
	
	@GetMapping("/novo-cliente")
	public String novoCliente(Cliente cliente, Model model) {
		
		model.addAttribute("cliente", cliente);
		
		return "dlal/cadastro";
	}
	
	// Inserir o cliente
	
	
	@PostMapping("/add-cliente")
	String inserirCliente(Cliente cliente, Model model) {
		
	return "";	
	}

}
