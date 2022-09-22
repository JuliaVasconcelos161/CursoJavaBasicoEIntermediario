package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class RelacaoDeParesVetorA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++)
		{
			System.out.println("Insira um número. Posição: " + (i+1) + " Vetor A ");
			vetorA[i] = scan.nextInt();
			
			System.out.println("Analisando o número " + vetorA[i]);
			for(int j = 1; j < vetorA[i]; j++)
			{
				if(j % 2 == 0)
				{
					System.out.println(j + " é par.");
				}
			}
		}
		

	}

}
