package br.com.algaworks.java8.exemplo.data;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import br.com.algaworks.java8.model.Cliente;

public class CadastroCliente {
	
	public static void main(String[] args) {
		
		Cliente c = new Cliente("Eduardo Antonio", LocalDate.of(1983, Month.MAY, 16));
		
		int idade = Period
					.between(c.getDataNascimento(), LocalDate.now())
					.getYears();
		
		if (idade >= 18) {
			System.out.println("Pode ser cadastrado. Sua idade é: " + idade);
		} else {
			System.out.println("Não pode ser cadastrado. Idade menor de 18 anos");
		}
	}

}
