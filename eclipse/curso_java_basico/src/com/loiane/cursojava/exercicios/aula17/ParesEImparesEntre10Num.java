package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class ParesEImparesEntre10Num {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		double num;
		int qtdNumPares = 0;
		int qtdNumImpares = 0;
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Insira um numero");
			num = scan.nextDouble();
			if(num % 2 == 0)
			{
				qtdNumPares++;
			}
			else
			{
				qtdNumImpares++;
			}
		}
		System.out.println("A soma dos pares seria: " + qtdNumPares + " e a soma dos impares seria: " + qtdNumImpares);
	}

}
