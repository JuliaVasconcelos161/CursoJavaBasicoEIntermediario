package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class MaiorDe5Numeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero;
		double maiorNumero = 0;
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Insira um 5 números");
			numero = sc.nextDouble();
			if(numero > maiorNumero)
			{
				maiorNumero = numero;
			}
		}
		System.out.println("O maior número é " + maiorNumero);
	}

}
