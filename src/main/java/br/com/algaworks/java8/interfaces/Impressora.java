package br.com.algaworks.java8.interfaces;

import br.com.algaworks.java8.model.Fatura;

@FunctionalInterface
public interface Impressora {
	
	public void imprimir(Fatura f);

}
