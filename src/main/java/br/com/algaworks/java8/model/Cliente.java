package br.com.algaworks.java8.model;

import java.time.LocalDate;

public class Cliente {

	private String nome;

	// Apenas data, sem hora,minuto,segundo.
	private LocalDate dataNascimento;

	public Cliente(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
