package br.com.algaworks.java8.model;

import java.time.Year;

public class Carro {

	private String modelo;
	private double diaria;
	private Year ano;

	public Carro(String modelo, double diaria, Year ano) {
		super();
		this.modelo = modelo;
		this.diaria = diaria;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getDiaria() {
		return diaria;
	}

	public void setDiaria(double diaria) {
		this.diaria = diaria;
	}

	public Year getAno() {
		return ano;
	}

	public void setAno(Year ano) {
		this.ano = ano;
	}

}
