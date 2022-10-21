package com.loiane.cursojava.exercicios.aula20;

import java.util.Scanner;

public class MatrizQuantidadeParesImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantPares = 0;
		int quantImpares = 0;
		int[][] matriz = new int[3][3];
		
		for(int i = 0; i < matriz.length; i++)
		{
			for(int j = 0; j < matriz[i].length; j++)
			{
				System.out.println("Insira o número correspondente a posição [" + i + "] [" + j + "]");
				matriz[i][j] = sc.nextInt();
				if(matriz[i][j] % 2 == 0)
				{
					quantPares++;
				}
				else
				{
					quantImpares++;
				}
			}
		}
		System.out.println("A quantidade de pares é " + quantPares);
		System.out.println("A quantidade de impares é " + quantImpares);
	}

}
