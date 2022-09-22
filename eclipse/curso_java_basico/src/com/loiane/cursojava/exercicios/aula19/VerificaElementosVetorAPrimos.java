package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class VerificaElementosVetorAPrimos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++)
		{
			System.out.println("Insira um número. Posição: " + (i+1) + " Vetor A ");
			vetorA[i] = scan.nextInt();
		}
		
		String msg = "";
		boolean primo;
		
		for(int i = 0; i < vetorA.length; i++)
		{
			primo = true;
			for(int j = 2; j < vetorA[i]; j++)
			{
				if(vetorA[i] % j == 0)
				{
					primo = false;
					break;
				}
			}
			if(primo)
			{
				msg = " primo";
			}
			else
			{
				msg = " não é primo";
			}
			System.out.println(vetorA[i] + msg);
		}

	}

}
