package com.loiane.cursojava.exercicios.aula34;

import java.util.Scanner;

public class TesteFatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		do
		{
			System.out.println("Insira um número positivo para calcular fatorial");
			num = sc.nextInt();
		}while(num < 0);
		
		System.out.println(Calculadora.calcularFatorial(num));
	

	}

}
