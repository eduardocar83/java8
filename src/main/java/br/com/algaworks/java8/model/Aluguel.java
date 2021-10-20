package br.com.algaworks.java8.model;

import java.time.LocalDateTime;

public class Aluguel {

	private Cliente cliente;
	private Carro carro;
	private LocalDateTime dataPrevistaRetirada;
	private LocalDateTime dataPrevistaDevolucao;
	private LocalDateTime dataRealDevolucao;

	public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataPrevistaRetirada,
			LocalDateTime dataPrevistaDevolucao) {
		this.cliente = cliente;
		this.carro = carro;
		this.dataPrevistaRetirada = dataPrevistaRetirada;
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public LocalDateTime getDataPrevistaRetirada() {
		return dataPrevistaRetirada;
	}

	public void setDataPrevistaRetirada(LocalDateTime dataPrevistaRetirada) {
		this.dataPrevistaRetirada = dataPrevistaRetirada;
	}

	public LocalDateTime getDataPrevistaDevolucao() {
		return dataPrevistaDevolucao;
	}

	public void setDataPrevistaDevolucao(LocalDateTime dataPrevistaDevolucao) {
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}

	public LocalDateTime getDataRealDevolucao() {
		return dataRealDevolucao;
	}

	public void setDataRealDevolucao(LocalDateTime dataRealDevolucao) {
		this.dataRealDevolucao = dataRealDevolucao;
	}

}
