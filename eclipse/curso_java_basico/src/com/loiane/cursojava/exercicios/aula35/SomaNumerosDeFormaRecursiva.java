package com.loiane.cursojava.exercicios.aula35;

public class SomaNumerosDeFormaRecursiva {
	public static int calcularSoma1AN(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		
		return n + calcularSoma1AN(n - 1);
	}
}
