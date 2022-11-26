package data_hora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataHora {

	public static void main(String[] args) {

		// Objeto LocalDate com a data atual
		LocalDate data = LocalDate.of(2019, 11, 25);

		// Objeto LocalDate com a data e hora atual
		LocalDateTime dataHora = LocalDateTime.now();

		// Objeto LocalDate com a hora atual
		LocalTime hora = LocalTime.parse("19:34:50");
		
		//Exibir os Objetos na tela
		System.out.println("\nData atual: " + data);
		System.out.println("\nData e Hora atual: " + dataHora);
		System.out.println("\nHora atual: " + hora);

	}

}
