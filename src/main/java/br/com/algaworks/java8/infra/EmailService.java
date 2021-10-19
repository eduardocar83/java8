package br.com.algaworks.java8.infra;

public class EmailService {

	public void enviar(String email, String texto) {
		System.out.println("Enviando email para: " + email + ". Com texto: " + texto);
	}
}
