package br.com.algaworks.java8.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.algaworks.java8.model.Fatura;

public class FaturaRepository {

	public List<Fatura> buscarFaturasVencidas() {
		
		List<Fatura> faturas = new ArrayList<>();
		
		faturas.add(new Fatura("eduardocar83@gmail.com", 20.0));
		faturas.add(new Fatura("eduardo.reginatto@gmail.com", 25.0));
		faturas.add(new Fatura("ada.reginatto@gmail.com", 30.5));
		faturas.add(new Fatura("eduardo.carvallo@gmail.com", 35.1));
		faturas.add(new Fatura("gisele.machado@gmail.com", 40.2));
		faturas.add(new Fatura("evandro.machado@gmail.com", 45.5));
		
		return faturas;
	}
	
}
