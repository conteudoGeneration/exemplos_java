package com.generation.optional01;

import java.util.Optional;

public class Optional01 {

	public static void main(String[] args) {

		String[] palavras = new String[10];

		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);

		if (checaNulo.isPresent()) {
			String palavra = palavras[5].toLowerCase();
			System.out.print(palavra);
		} else
			System.out.println("A palavra é nula!");
	}

}
