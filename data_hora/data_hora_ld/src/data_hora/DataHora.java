package data_hora;

import java.time.LocalTime;

public class DataHora {

	public static void main(String[] args) {

		// Instanciar uma novo objeto LocalTime
		LocalTime hora = LocalTime.now();

		// Obter detalhes sobre a hora
		System.out.println("\nExibir apenas a hora: " + hora.getHour());
		System.out.println("\nExibir apenas os minutos: " + hora.getMinute());
		System.out.println("\nExibir apenas os segundos: " + hora.getSecond());
		System.out.println("\nExibir os Milisegundos: " + hora.getNano());

		/**
		 * Instanciar 3 Objetos da Classe LocalTime, que serão utilizados nos Métodos de
		 * comparação entre horas
		 */
		LocalTime horaMenor = LocalTime.of(8, 30, 25);
		LocalTime horaIgual = LocalTime.now();
		LocalTime horaMaior = LocalTime.of(10, 30, 25);

		// Comparação entre horas
		System.out.println("\nA hora: " + horaMenor + " é igual a hora: " + hora + "? " + hora.equals(horaMenor));
		System.out.println("\nA hora: " + horaIgual + " é igual a hora: " + hora + "? " + hora.equals(horaIgual));
		System.out.println("\nA hora: " + horaMaior + " é igual a hora: " + hora + "? " + hora.equals(horaMaior));

		System.out.println("\nA hora: " + hora + " é maior do que a hora: " + horaMenor + " (" + hora.compareTo(horaMenor) + ")");
		System.out.println("\nA hora: " + hora + " é menor do que a hora: " + horaMaior + " (" + hora.compareTo(horaMaior) + ")");

		System.out.println("\nA hora: " + hora + " é posterior a hora: " + horaMenor + "? " + hora.isAfter(horaMenor));
		System.out.println("\nA hora: " + hora + " é anterior a hora: " + horaMaior + "? " + hora.isBefore(horaMaior));

	}

}
