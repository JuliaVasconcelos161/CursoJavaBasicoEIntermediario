package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class CotacaoDolar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		double cotacao = 0;
		
		System.out.println("Entre com a cotacao do dolar:");
		cotacao = sc.nextDouble();
		
		for(int i = 0; i < vetorA.length; i++)
		{
			vetorA[i] = cotacao * (i + 1);
			System.out.println("O valor seria " + vetorA[i]);
		}

	}

}
