package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class MaiorEMenorIdadeVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] aIdades = new int[10];
		int maiorIdade = Integer.MIN_VALUE;
		int menorIdade = Integer.MAX_VALUE;
		int posicaoMaiorIdade = 0;
		int posicaoMenorIdade = 0;
		
		for(int i = 0; i < aIdades.length; i++)
		{
			System.out.println("Insira a idade" + (i+1) + ":");
			aIdades[i] = sc.nextInt();
			if(aIdades[i] > maiorIdade)
			{
				maiorIdade = aIdades[i];
				posicaoMaiorIdade = (i+1);
				
			}
			if(aIdades[i] < menorIdade)
			{
				menorIdade = aIdades[i];
				posicaoMenorIdade = (i+1);
			}
		}
		System.out.println("A maior idade seria " + maiorIdade + " e sua posição é " + posicaoMaiorIdade);
		System.out.println("A menor idade seria " + menorIdade + " e sua posição é " + posicaoMenorIdade);


	}

}
