package com.loiane.cursojava.aula35;

public class TesteCalculadora {

	public static void main(String[] args) {
		int fatorialNR = Calculadora.calcularFatorialNaoRecursivo(5);
		System.out.println(fatorialNR);
		
		int fatorialR = Calculadora.calcularFatorial(5);
		System.out.println(fatorialR);
	}

}
