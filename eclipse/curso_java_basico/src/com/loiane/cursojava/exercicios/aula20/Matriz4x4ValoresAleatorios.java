package com.loiane.cursojava.exercicios.aula20;

public class Matriz4x4ValoresAleatorios {

	public static void main(String[] args) {
		int[][] matrizAleatorios = new int [4][4];
		int maiorNum = Integer.MIN_VALUE;
		int iMaiorNum = 0;
		int jMaiorNum = 0;
		
		for (int i = 0; i < matrizAleatorios.length; i++)
		{
			for(int j = 0; j < matrizAleatorios[i].length;j++)
			{
				matrizAleatorios[i][j] = (int)(Math.random() * 9);
				System.out.println("Matriz [" + i + "] [" + j + "] = " + matrizAleatorios[i][j]);
				if(matrizAleatorios[i][j] > maiorNum)
				{
					maiorNum = matrizAleatorios[i][j];
					iMaiorNum = i;
					jMaiorNum = j;
				}
				
			}
		}
		
		System.out.println("O maior número é " + maiorNum);
		System.out.println("A posição do maior número é ["+ iMaiorNum + "] [" + jMaiorNum + "]");
	}

}
