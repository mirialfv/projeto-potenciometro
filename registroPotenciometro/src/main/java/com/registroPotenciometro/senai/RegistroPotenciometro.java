package com.registroPotenciometro.senai;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "registros_potenciometro")
public class RegistroPotenciometro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer valorPotenciometro;
	
	private Integer ledsAcesos;
	
	private LocalDateTime dataHoraRegistro;
	
	public RegistroPotenciometro() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getValorPotenciometro() {
		return valorPotenciometro;
	}

	public void setValorPotenciometro(Integer valorPotenciometro) {
		this.valorPotenciometro = valorPotenciometro;
	}

	public Integer getLedsAcesos() {
		return ledsAcesos;
	}

	public void setLedsAcesos(Integer ledsAcesos) {
		this.ledsAcesos = ledsAcesos;
	}

	public LocalDateTime getDataHoraRegistro() {
		return dataHoraRegistro;
	}

	public void setDataHoraRegistro(LocalDateTime dataHoraRegistro) {
		this.dataHoraRegistro = dataHoraRegistro;
	}
	
	

}
