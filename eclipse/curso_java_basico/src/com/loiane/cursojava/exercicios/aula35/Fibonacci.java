package com.loiane.cursojava.exercicios.aula35;

public class Fibonacci {
	
	public static int calcularFibonacci(int termo)
	{
		if(termo < 2)
		{
			return 1;
		}
		
		return calcularFibonacci(termo - 1) + calcularFibonacci(termo - 2);
	}
}
