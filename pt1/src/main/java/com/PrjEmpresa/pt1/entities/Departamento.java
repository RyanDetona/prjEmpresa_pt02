package com.PrjEmpresa.pt1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Departamento")
public class Departamento {
	
	@ManyToOne
	private Departamento departamento;

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long depcodigo;
	
	private String depnome;

	public Long getDepcodigo() {
		return depcodigo;
	}

	public void setDepcodigo(Long depcodigo) {
		this.depcodigo = depcodigo;
	}

	public String getDepnome() {
		return depnome;
	}

	public void setDepnome(String depnome) {
		this.depnome = depnome;
	}

}