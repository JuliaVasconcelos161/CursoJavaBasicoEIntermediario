package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class SequenciaNumerica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		System.out.println("Insira o número de termos da sequencia");
		int n = sc.nextInt();
		
		for(int i = 1, j = 1; i <= n; i++, j+=2)
		{
			System.out.print(i + "/" + j + " + ");
			soma += i/j;
		}
		System.out.print("\nA soma seria: " + soma);
	}

}
