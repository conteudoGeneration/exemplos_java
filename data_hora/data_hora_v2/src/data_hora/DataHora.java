package data_hora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataHora {

	public static void main(String[] args) {

		// Objeto LocalDate com a data atual
		LocalDate data = LocalDate.now();
		LocalDateTime dataHora = LocalDateTime.now();
		LocalTime hora = LocalTime.now();
		
		//Exibir na tela o Objeto da Classe LocalDate formatado
		System.out.println("Data no formato do Brasil: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("\nData com o mês por extenso: " + data.format(DateTimeFormatter.ofPattern("dd/MMMM/YYYY")));
		System.out.println("\nData com o dia da semana: " + data.format(DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy")));
		
		//Exibir na tela o Objeto da Classe LocalTime formatado
		System.out.println("\nHora no formato do Brasil: " + hora.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
		System.out.println("\nHora com milisegundos: " + hora.format(DateTimeFormatter.ofPattern("hh:mm:ss.n")));
		System.out.println("\nHora no formato AM/PM: " + hora.format(DateTimeFormatter.ofPattern("kk:mm:ss a")));

		//Exibir na tela o Objeto da Classe LocalDateTime formatado
		System.out.println("\nData e Hora no formato do Brasil: " + dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
				
	}

}
