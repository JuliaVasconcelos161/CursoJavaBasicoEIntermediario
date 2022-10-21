package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o número de pessoas entrevistadas: ");
		int numEnt = sc.nextInt();
		
		String[][] nomesFilhos = new String[numEnt][];
		
		for(int i = 0; i < nomesFilhos.length; i++)
		{
			System.out.println("Entre com a qtd de filhos: ");
			int quantFilhos = sc.nextInt();
			
			nomesFilhos[i] = new String[quantFilhos];
			
			for (int j = 0; j < nomesFilhos[i].length; j++)
			{
				System.out.println("Digite o nome do filho " + (j+1));
				nomesFilhos[i][j] = sc.next();
			}
		
		}
		
		for(int i = 0; i < nomesFilhos.length; i++)
		{
			System.out.println("Pessoa  " + (i+1) + " tem " + nomesFilhos[i].length + " filhos");
			for (int j = 0; j < nomesFilhos[i].length; j++)
			{
				System.out.println(nomesFilhos[i][j]);
				
			}
		
		}

	}

}
