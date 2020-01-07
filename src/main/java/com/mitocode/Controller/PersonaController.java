package com.mitocode.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Persona;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@GetMapping 
	public Persona saludar() {
		Persona persona = new Persona();
		persona.setId(1);
		persona.setNombre("Marcos");
		return persona;
	}
}
