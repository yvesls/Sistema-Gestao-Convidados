package com.springboot.gestaofesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.gestaofesta.model.Convidado;
import com.springboot.gestaofesta.repository.Convidados;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {

	@Autowired
	private Convidados convidados;
	
	@GetMapping
	public ModelAndView listar() { 
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		
		modelAndView.addObject("convidados", convidados.findAll());
		modelAndView.addObject("convidado", new Convidado());
		
		return modelAndView;
	}

	@PostMapping
	public String salvar(Convidado convidado) {
		this.convidados.save(convidado);
		
		return "redirect:/convidados";
	}	
}