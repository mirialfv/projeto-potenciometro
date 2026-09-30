package com.registroPotenciometro.senai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.registroPotenciometro.senai.RegistroPotenciometro;
import com.registroPotenciometro.senai.repository.RegistroPotenciometroRepository;

@Service
public class RegistroPotenciometroService {
	private final RegistroPotenciometroRepository repository;
	
	public RegistroPotenciometroService(
			RegistroPotenciometroRepository repository) {
		this.repository = repository;
	}
	
	public RegistroPotenciometro salvar (RegistroPotenciometro registro) {
		return repository.save(registro);
	}
	
	public List<RegistroPotenciometro> listar() {
		return repository.findAll();
		}

}
