package com.mitocode.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	private IPersonaService service;
	
	@GetMapping 
	public void saludar() {
		
		service.crear();
		
		/*
		Persona persona = new Persona();
		persona.setId(1);
		persona.setNombre("Marcos");
		return persona;
		*/
	}
}
