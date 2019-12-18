package br.edu.ifal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifal.model.Lembrete;

@Controller
public class ControladorLembrete {
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("lembrete", new Lembrete());
		return mv;
	}
	
	@RequestMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView mv = new ModelAndView("cadastrar.html");
		mv.addObject("lembrete", new Lembrete());
		return mv;
	}
}
