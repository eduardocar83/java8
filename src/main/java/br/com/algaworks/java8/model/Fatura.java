package br.com.algaworks.java8.model;

public class Fatura {

	private String emailDevedor;
	private double valor;

	public Fatura(String emailDevedor, double valor) {
		this.emailDevedor = emailDevedor;
		this.valor = valor;
	}

	public String getEmailDevedor() {
		return emailDevedor;
	}

	public void setEmailDevedor(String emailDevedor) {
		this.emailDevedor = emailDevedor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String resumo() {
		return "Valor devido: " + this.valor;
	}
	
	public void atualizarStatus() {
		System.out.println("Trocando status");
	}
	
	public boolean estaEmRisco() {
		return (this.valor >= 15) ? true : false;
	}
	
	@Override
	public String toString() {
		return "Email: " + this.emailDevedor;
	}
}
