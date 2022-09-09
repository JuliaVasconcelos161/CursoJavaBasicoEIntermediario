package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class UmaNotaEntre0e10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota;
		
		do
		{
			System.out.println("Insira uma nota: (Entre 0 e 10)");
			nota = scan.nextDouble();
			if(nota < 0 || nota >= 10)
			{
				System.out.println("Valor invalido");
			}
			else
			{
				System.out.println("Você digitou: " + nota);
			}
	
		}while(nota < 0 || nota >= 10);

	}

}
