package com.loiane.cursojava.exercicios.aula20;

public class MatrizMaiorMenorLinha5Coluna10 {

	public static void main(String[] args) {
		int[][] matrizAleatorios = new int [10][10];
		int menorNumLinha5 = Integer.MAX_VALUE;
		int maiorNumLinha5 = Integer.MIN_VALUE;
		int menorNumColuna7 = Integer.MAX_VALUE;
		int maiorNumColuna7 = Integer.MIN_VALUE;
		int iMaiorNum = 0;
		int jMaiorNum = 0;
		
		for (int i = 0; i < matrizAleatorios.length; i++)
		{
			for(int j = 0; j < matrizAleatorios[i].length;j++)
			{
				matrizAleatorios[i][j] = (int)(Math.random() * 9);
				System.out.println("Matriz [" + i + "] [" + j + "] = " + matrizAleatorios[i][j]);
				
				if((i == 5) && (matrizAleatorios[i][j] < menorNumLinha5))
				{
					menorNumLinha5 = matrizAleatorios[i][j];
				}
				if((i == 5) && (matrizAleatorios[i][j] > maiorNumLinha5))
				{
					maiorNumLinha5 = matrizAleatorios[i][j];
				}
				
				if((j == 7) && (matrizAleatorios[i][j] > maiorNumColuna7))
				{
					maiorNumColuna7 = matrizAleatorios[i][j];
				}
				if((j == 7) && (matrizAleatorios[i][j] < menorNumColuna7))
				{
					menorNumColuna7 = matrizAleatorios[i][j];
				}
				
			}
		}
		
		System.out.println("O menor número da linha 5 é " + menorNumLinha5);
		System.out.println("O maior número da linha 5 é " + maiorNumLinha5);
		System.out.println("O menor número da linha 7 é " + menorNumColuna7);
		System.out.println("O maior número da linha 7 é " + maiorNumColuna7);
		
	}

	

}
