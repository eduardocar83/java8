package br.com.algaworks.java8.exemplo;

import java.util.List;

import br.com.algaworks.java8.infra.EmailService;
import br.com.algaworks.java8.model.Fatura;
import br.com.algaworks.java8.repository.FaturaRepository;

public class ExemploLambda {

	public static void main(String[] args) {
		
		EmailService emailService = new EmailService();
		
		FaturaRepository faturaRepository = new FaturaRepository();
		
		List<Fatura> faturasVencidas = faturaRepository.buscarFaturasVencidas();
		
//		for (Fatura fatura : faturasVencidas) {
//			emailService.enviar(fatura.getEmailDevedor(), fatura.resumo());
//		}
		
		faturasVencidas.forEach(f -> emailService.enviar(f.getEmailDevedor(), f.resumo()));
		
		
		
		
		
		
	}
}
