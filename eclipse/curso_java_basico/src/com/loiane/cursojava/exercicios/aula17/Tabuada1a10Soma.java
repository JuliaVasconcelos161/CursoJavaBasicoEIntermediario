package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Tabuada1a10Soma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int soma = 0;
		
		System.out.println("Insira um numero: (Entre 0 e 10)");
		num = scan.nextInt();
		for(int i = 0; i < 11; i++)
		{
			int resultado = num*i;
			System.out.println(num + " x " + i + " = " + resultado);
			soma += resultado;
		}
		System.out.println("A soma dos números é " + soma);

	}

}
