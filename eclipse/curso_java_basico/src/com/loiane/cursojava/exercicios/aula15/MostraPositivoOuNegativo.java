package com.loiane.cursojava.exercicios.aula15;
import java.util.Scanner;

public class MostraPositivoOuNegativo {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double numero;
		
		System.out.println("Insira um número: ");
		numero = scan.nextDouble();
		
		if(numero > 0)
		{
			System.out.println("Número positivo");
		}
		else if (numero < 0)
		{
			System.out.println("Número negativo");
		}
		else
		{
			System.out.println("Número nulo");
		}
	}
}
