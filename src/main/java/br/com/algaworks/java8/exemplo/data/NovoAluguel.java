package br.com.algaworks.java8.exemplo.data;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;

import br.com.algaworks.java8.model.Aluguel;
import br.com.algaworks.java8.model.Carro;
import br.com.algaworks.java8.model.Cliente;

public class NovoAluguel {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Eduardo Reginatto", LocalDate.of(1983, Month.MAY, 16));
		
		Carro carro = new Carro("Corsa", 100.0, Year.of(2015));
		
		LocalDateTime dataPrevistaRetirada = LocalDateTime.of(LocalDate.now(), 
				LocalTime.of(LocalTime.now().getHour(), 0));
		
		LocalDateTime dataPrevistaDevolucao = LocalDateTime.now()
				.plusDays(3)
				.plusHours(2);
		
		Aluguel aluguel = new Aluguel(cliente, carro, dataPrevistaRetirada, dataPrevistaDevolucao);
		
		
		//FORMATADOR
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Data e hora prevista para retirada : " + aluguel.getDataPrevistaRetirada().format(formatter));
		System.out.println("Data e hora prevista para devolucao: " + aluguel.getDataPrevistaDevolucao().format(formatter));

		
		//Calculando intervalo de tempo
		LocalDateTime dataRealDevolucao = LocalDateTime.now().plusDays(5);
		aluguel.setDataRealDevolucao(dataRealDevolucao);
				
		
		//Trabalha com localdatetime
		Duration duracao = Duration.between(aluguel.getDataPrevistaDevolucao(), aluguel.getDataRealDevolucao());
		
		
		//trabalha com localdate
		Period periodo = Period.between(aluguel.getDataPrevistaDevolucao().toLocalDate(), aluguel.getDataRealDevolucao().toLocalDate());

		
		//Imprimindo resultados
		System.out.println("Duracao: " + duracao.toHours());
		System.out.println("Duracao: " + periodo.getDays());
	}
}
