package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class Tabuada5ElementosVetorA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		
		for(int i = 0; i < vetorA.length; i++)
		{
			System.out.println("Insira um número. Posição: " + (i+1) + " Vetor A ");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++)
		{
			System.out.println("\nTabuada de " + vetorA[i]);
			
			for(int j = 0; j <= 10; j++)
			{
				System.out.println(j + " x " + vetorA[i] + " = " + (vetorA[i] * j));
			}
		}

	}

}
