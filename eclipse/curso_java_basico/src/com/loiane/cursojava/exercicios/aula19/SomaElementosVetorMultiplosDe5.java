package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class SomaElementosVetorMultiplosDe5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int soma = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.println("Insira a posição:" + (i+1));
			a[i] = sc.nextInt();
			if(a[i] % 5 == 0)
			{
				soma += a[i];
			}
		}
		System.out.println("A soma seria: " + soma);


	}

}
