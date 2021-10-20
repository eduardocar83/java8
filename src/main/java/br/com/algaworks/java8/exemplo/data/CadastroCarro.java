package br.com.algaworks.java8.exemplo.data;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

import br.com.algaworks.java8.model.Carro;

public class CadastroCarro {

	
	public static void main(String[] args) {
		
		Carro gol = new Carro("Gol", 55.5, Year.of(2010));
		
		Carro cruze = new Carro("Cruze", 90.0, Year.parse("2011"));
		
		Carro prisma = new Carro("Prisma", 88.0, Year.of(2012));
		
		List<Carro> carros = Arrays.asList(gol, cruze, prisma);
		
		carros.stream()
			.filter(c -> c.getAno().isAfter(Year.of(2011)))
			.forEach(c -> System.out.println(c.getModelo()));
		
	}
}
