package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class VetorCRecebeVetorAeB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[2*vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++)
		{
			System.out.println("Insira um número. Posição: " + (i+1) + " Vetor A ");
			vetorA[i] = scan.nextInt();
			
			System.out.println("Insira um número. Posição: " + (i+1) + " Vetor B ");
			vetorB[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++)
		{
			vetorC[i] = vetorA[i];
			
		}
		
		for(int i = 0; i < vetorA.length; i++)
		{
			vetorC[vetorC.length - vetorA.length + i] = vetorB[i];
			
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
		
		System.out.println();
		System.out.print("Vetor C: ");
		
		for(int i = 0; i < vetorC.length; i++)
		{
			System.out.print(vetorC[i] + " ");
		}

	}

}
