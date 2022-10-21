package com.loiane.cursojava.exercicios.aula34;

public class Calculadora {

	public static int somar(int num1, int num2)
	{
		return num1 + num2;
	}
	
	public static int subtrair(int num1, int num2)
	{
		return num1 - num2;
	}
	
	public static int multiplicar(int num1, int num2)
	{
		return num1 * num2;
	}
	
	public static double dividir(int num1, int num2)
	{
		return num1/num2;
	}
	
	public static int elevarAPotencia(int base, int expoente)
	{
		int potencia = 1;
		for(int i = 0; i < expoente; i++)
		{
			potencia *= base;
		}
		return potencia;
	}
	
	public static int calcularFatorial(int num)
	{
		int fatorial = 1;
		for(int i = num; i > 0; i--)
		{
			fatorial *= i;
		}
		return fatorial;
	}

}
