package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class ElementosSuperioresInferioresIguais15Vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int qtdImpares = 0;
		int quantDe15 = 0;
		int somaInferioresA15 = 0;
		double somaMaior15 = 0;
		double qtdMaior15 = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.println("Insira a posição:" + (i+1));
			a[i] = sc.nextInt();
			
			if(a[i] < 15)
			{
				somaInferioresA15+= a[i];	
			}
			else if(a[i] == 15)
			{
				quantDe15++;
			}
			else
			{
				somaMaior15 += a[i];
				qtdMaior15++;
			}
		}
		
		double mediaMaiores15 = somaMaior15/qtdMaior15;
		System.out.println("A soma dos inferiores a 15 seria: " + somaInferioresA15);
		System.out.println("A quantidade de 15s no array seria: " + quantDe15);
		System.out.println("A media dos superiores a 15 seria: " + mediaMaiores15);

	}

}
