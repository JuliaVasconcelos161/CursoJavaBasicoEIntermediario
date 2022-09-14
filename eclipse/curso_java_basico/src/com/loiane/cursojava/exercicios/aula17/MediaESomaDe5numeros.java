package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class MediaESomaDe5numeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num;
		double soma = 0;
		double media = 0;
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Digite um número:");
			num = scan.nextDouble();
			soma += num;
		}
		media = soma/5;
		System.out.println("A soma dos números é " + soma);
		System.out.println("A media dos números é " + media);
	}

}
