package com.loiane.cursojava.aula35;

public class Calculadora {
	public static int calcularFatorialNaoRecursivo(int num)
	{
		int fatorial = 1;
		for(int i = num; i > 0; i--)
		{
			fatorial *= i;
		}
		return fatorial;
	}
	
	public static int calcularFatorial(int num)
	{
		if(num == 0)
		{
			return 1;
		}
		
		return num * calcularFatorial(num - 1);
	
	}
}
