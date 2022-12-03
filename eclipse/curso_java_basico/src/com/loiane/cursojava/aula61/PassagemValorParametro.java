package com.loiane.cursojava.aula61;

public class PassagemValorParametro {

	public static void main(String[] args) {
		Contato contato = new Contato("Contato1","1234-5678", "contato1@email.com");
		int valor = 10;
		
		System.out.println("Valores originais\n");
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("\nExemplo 1");
		testePassagemValorReferencia(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("\nExemplo 2");
		testePassagemValorReferencia2(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);

	}
	
	public static void testePassagemValorReferencia(int valor, Contato contato)
	{
		int novoValor = valor+10;
		valor = novoValor;
		
		contato = new Contato("Contato2", "2345-6789", "contato2@email.com");
	}
	
	public static void testePassagemValorReferencia2(int valor, Contato contato)
	{
		int novoValor = valor+10;
		valor = novoValor;
		
		contato.setNome("Contato" + novoValor);;
	}
	
	//Tipos primitivos: passagem por valor
	//Tipos classe, enum, array:passagem por referencia

}
