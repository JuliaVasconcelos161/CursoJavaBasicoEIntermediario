package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class FormaAlternativaVetorBRecebe1QuandoAForPar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++)
		{
			System.out.println("Insira um número. Posição: " + (i+1));
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++)
		{
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor B: ");
		
		for(int i = 0; i < vetorA.length; i++)
		{
			System.out.print(vetorB[i] + " ");
		}

	}

}
