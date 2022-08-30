package com.example.grupo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	//ao digitar no browse http://localhost:8080/ a aplicação response com página menu
	@GetMapping("/")
	public ModelAndView menu() {
		return new ModelAndView("paginaMenu");
	}
	@GetMapping("/login")
	public ModelAndView autenticacao() {
		return new ModelAndView("paginaLogin");
	}
	@GetMapping("/alunos")
	public ModelAndView cadastrarAluno() {
		return new ModelAndView("cadastrarAluno");
	}
	@GetMapping("/livros")
	public ModelAndView cadastrarLivro() {
		return new ModelAndView("cadastrarLivro");
	}
}
