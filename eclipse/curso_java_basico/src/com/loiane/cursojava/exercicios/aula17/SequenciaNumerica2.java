package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class SequenciaNumerica2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		System.out.println("Insira o número de termos da sequencia");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			soma += 1/i;
		}
		System.out.print("A soma seria: " + soma);

	}

}
