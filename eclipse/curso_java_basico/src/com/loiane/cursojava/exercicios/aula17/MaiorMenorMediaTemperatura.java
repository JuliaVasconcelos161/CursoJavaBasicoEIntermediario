package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class MaiorMenorMediaTemperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double menorTemp = Double.MAX_VALUE;
		double maiorTemp = Double.MIN_VALUE;
		double temp;
		double soma = 0;
		double media;
		System.out.println("Insira a quantidade de temperaturas: ");
		int quantTemp = sc.nextInt();
		
		for(int i = 0; i < quantTemp; i++)
		{
			System.out.println("Insira a temperatura " + (i+1));
			temp = sc.nextDouble();
			soma += temp;
			if(temp > maiorTemp)
			{
				maiorTemp = temp;
			}
			if(temp < menorTemp)
			{
				menorTemp = temp;
			}
		}
		media = soma/ quantTemp;
		System.out.println("A média é " + media);
		System.out.println("A menor temperatura é " + menorTemp);
		System.out.println("A maior temperatura  é " + maiorTemp);
		
		
	}

}
