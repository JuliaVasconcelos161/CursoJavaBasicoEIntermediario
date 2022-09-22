package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class PercentualNumParesImparesVetor {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int qtdImpares = 0;
		int qtdPares = 0;
		double perImpares;
		double perPares;
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.println("Insira a posição:" + (i+1));
			a[i] = sc.nextInt();
			if(a[i] % 2 == 0)
			{
				qtdPares++;
			}
			else
			{
				qtdImpares++;
			}
		}
		perPares = (qtdPares*100)/a.length;
		perImpares = (qtdImpares*100)/a.length;
		System.out.println("O percentual de impares seria: " + perImpares + " %");
		System.out.println("O percentual de pares seria: " + perPares + " %");

	}
}
