package com.loiane.cursojava.exercicios.aula15;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numero;
		
		System.out.println("Insira um número: ");
		numero  = scan.nextDouble();
		
		if (numero % 2 == 0)
		{
			System.out.println("O número é par");
		}
		else
		{
			System.out.println("O número é ímpar");
		}
	}

}
