package com.registroPotenciometro.senai.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registroPotenciometro.senai.RegistroPotenciometro;
import com.registroPotenciometro.senai.service.RegistroPotenciometroService;

@RestController
@RequestMapping("/api/potenciometro")
@CrossOrigin(origins = "*")
public class RegistroPotenciometroController {
	
	private final RegistroPotenciometroService service;
	
	public  RegistroPotenciometroController(
			RegistroPotenciometroService service) {
		this.service = service;
	}
	
	@PostMapping
	public RegistroPotenciometro receberRegistro(
			@RequestBody RegistroPotenciometro registro) {
		if (registro.getDataHoraRegistro() == null) {
			registro.setDataHoraRegistro(LocalDateTime.now());
		}
		
		return service.salvar(registro);
	}
	
	@GetMapping
	public List<RegistroPotenciometro> listarRegistros() {
		return service.listar();
	}

}
