package data_hora;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DataHora {

	public static void main(String[] args) {

		// Objeto LocalDate com uma data específica
		LocalDate data = LocalDate.of(2019, 11, 25);

		// Objeto LocalDate com uma hora específica
		LocalTime hora = LocalTime.of(6, 30, 0);
		
		// Comparar uma data específica com a data de hoje
		System.out.println("\nDiferença em anos: " + Period.between(data, LocalDate.now()).getYears());
		
		// Comparar uma hora específica com a hora atual
		System.out.println("\nDiferença em segundos: " + Duration.between(hora, LocalTime.now()).getSeconds());

	}

}
