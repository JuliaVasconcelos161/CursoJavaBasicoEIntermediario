package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class ValorMedioCds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		double valorMedio;
		
		System.out.println("Informe a quantidade de cds: ");
		int quantCds = sc.nextInt();
		
		for(int i = 0; i < quantCds; i++)
		{
			System.out.println("Insira o valor do cd " + (i+1) + ":");
			double valorCd = sc.nextDouble();
			soma += valorCd;
		}
		valorMedio = soma/quantCds;
		System.out.println("O valor médio é " + valorMedio);
	}

}
