package br.com.algaworks.java8.exemplo;

import java.util.List;

import br.com.algaworks.java8.model.Fatura;
import br.com.algaworks.java8.repository.FaturaRepository;

public class ExemploReferenciaMetodo {

	public static void main(String[] args) {
		
		FaturaRepository faturaRepository = new FaturaRepository();
		
		List<Fatura> faturasVencidas = faturaRepository.buscarFaturasVencidas();
		
		faturasVencidas.forEach(Fatura::atualizarStatus);
		
		
	}
	
}
