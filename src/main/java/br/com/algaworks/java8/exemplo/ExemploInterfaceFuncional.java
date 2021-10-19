package br.com.algaworks.java8.exemplo;

import br.com.algaworks.java8.interfaces.Impressora;
import br.com.algaworks.java8.model.Fatura;

public class ExemploInterfaceFuncional {

	public static void main(String[] args) {
		
		Impressora i = (f) -> {
			System.out.println("Imprimindo..." + f.getEmailDevedor());
		};
		
		Fatura fatura = new Fatura("eduardo.reginatto@gmail.com", 11.5);
		
		i.imprimir(fatura);
		
	}
}
