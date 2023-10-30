package com.itb.tcc.inf2cm.myproject2c.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.tcc.inf2cm.myproject2c.model.Funcionario;

@Controller
@RequestMapping("/motopecas/funcionario")
public class FuncionarioController {
	
	
	// Carregar o formulário de cadastro
	@GetMapping("/novo-funcionario")
	public String novoFuncionario(Funcionario funcionario, Model model) {
		
		model.addAttribute("funcionario", funcionario);
		
		return "motopecas/CadastroFuncionario";
	}
	
	// Cadastrar o funcinário
	
	@PostMapping("/add-funcionario")
	public String inserirFuncionario(Funcionario funcionario, Model model) {
		
		return "";
	}
	

	
	
}
