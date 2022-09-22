package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class PercentualDeZerosEUnsEmUmVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		int quant0 = 0;
		int quant1 = 0;
		
		for(int i = 0; i < vetorA.length; i++)
		{
			vetorA[i] = (int)(Math.round(Math.random()*1));
			if(vetorA[i] == 0)
			{
				quant0++;
			}
			else if(vetorA[i] == 1)
			{
				quant1++;
			}
		}
		double porcentagem0 = (quant0*100)/ vetorA.length;
		double porcentagem1 = (quant1*100)/ vetorA.length;
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++)
		{
			System.out.print(vetorA[i]);
		}
		
		System.out.println("\nA porcentagem de 0s seria: " + porcentagem0);
		System.out.println("A porcentagem de 1s seria: " + porcentagem1);
	}

}
