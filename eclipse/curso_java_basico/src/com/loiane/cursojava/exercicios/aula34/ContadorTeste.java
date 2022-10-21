package com.loiane.cursojava.exercicios.aula34;

public class ContadorTeste {
	
	static void imprimirValor()
	{
		System.out.println(Contador.obterValor());
	}

	public static void main(String[] args) {
		
		imprimirValor();
		Contador.incrementar();
		imprimirValor();
		Contador.zerarContador();
		imprimirValor();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		imprimirValor();
		
		Contador cont1 = new Contador();
		Contador cont2 = new Contador();
		Contador cont3 = new Contador();
		
		imprimirValor();

	}

}
