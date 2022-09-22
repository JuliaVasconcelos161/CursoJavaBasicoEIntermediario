package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class NumerosParesEmUmVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		int pares = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.println("Insira a posição:" + (i+1));
			a[i] = sc.nextInt();
			
			if(a[i] % 2 == 0)
			{
				pares++;
				System.out.println("O número " + a[i] + " é par\n");
			}
			else
			{
				System.out.println("O número é " + a[i] + " impar\n");
			}
		}
		System.out.println("O total de pares é: " + pares);
		
	}

}
