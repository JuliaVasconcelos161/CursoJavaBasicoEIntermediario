package com.loiane.cursojava.exercicios.aula34;

public class Contador {
	
	private static int contador; //valor inicial variavel inteira é zero;
	
	public Contador()
	{
		contador++;
	}
	
	public static void zerarContador()
	{
		contador = 0;
	}
	
	public static void incrementar()
	{
		contador++;
	}
	
	public static int obterValor()
	{
		return contador;
	}
}
