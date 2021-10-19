package br.com.algaworks.java8.exemplo;

import java.util.List;

import br.com.algaworks.java8.model.Fatura;
import br.com.algaworks.java8.repository.FaturaRepository;

public class ExemploStream {

	public static void main(String[] args) {
		
		List<Fatura> faturasVencidas = new FaturaRepository().buscarFaturasVencidas();
		
//		for (Fatura fatura : faturasVencidas) {
//			if (fatura.getValor() > 15) {
//				System.out.println("Alerta: Fatura vencida com valor superior a R$ 15.00 -> " + fatura.getValor() );
//			}
//		}
		
		faturasVencidas.stream()
			.filter(Fatura::estaEmRisco)
			.forEach(System.out::println);
		
	}
}
