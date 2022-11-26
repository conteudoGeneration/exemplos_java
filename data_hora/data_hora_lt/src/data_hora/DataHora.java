package data_hora;

import java.time.LocalDate;

public class DataHora {

	public static void main(String[] args) {

		// Instanciar uma novo objeto LocalDate
		LocalDate data = LocalDate.now();

		// Obter detalhes sobre a data
		System.out.println("\nExibir apenas o Dia da data: " + data.getDayOfMonth());
		System.out.println("\nExibir apenas o numero do dia do ano da data: " + data.getDayOfYear());
		System.out.println("\nExibir apenas o mês da data: " + data.getMonthValue());
		System.out.println("\n" + data.getYear() + " é um ano Bissexto? " + data.isLeapYear());
		System.out.println("\nQuantos dias tem o mês " + data.getMonthValue() + "? " + data.lengthOfMonth());
		System.out.println("\nQuantos dias tem o ano " + data.getYear() + "? " + data.lengthOfYear());

		/**
		 * Instanciar 3 Objetos da Classe LocalDate, que serão utilizados nos Métodos de
		 * comparação entre datas
		 */
		LocalDate dataMenor = LocalDate.of(2019, 11, 25);
		LocalDate dataIgual = LocalDate.now();
		LocalDate dataMaior = LocalDate.of(2025, 11, 25);

		// Comparação entre datas
		System.out.println("\nA data: " + dataMenor + " é igual a data: " + data + "? " + data.equals(dataMenor));
		System.out.println("\nA data: " + dataIgual + " é igual a data: " + data + "? " + data.equals(dataIgual));
		System.out.println("\nA data: " + dataMaior + " é igual a data: " + data + "? " + data.equals(dataMaior));

		System.out.println("\nA data: " + data + " é maior do que a data: " + dataMenor + ", aproximadamente " + data.compareTo(dataMenor) + " anos");
		System.out.println("\nA data: " + data + " é menor do que a data: " + dataMaior + ", aproximadamente " + data.compareTo(dataMaior) + " anos");

		System.out.println("\nA data: " + data + " é posterior a data: " + dataMenor + "? " + data.isAfter(dataMenor));
		System.out.println("\nA data: " + data + " é igual a data: " + dataIgual + "? " + data.isEqual(dataIgual));
		System.out.println("\nA data: " + data + " é anterior a data: " + dataMaior + "? " + data.isBefore(dataMaior));

	}

}
