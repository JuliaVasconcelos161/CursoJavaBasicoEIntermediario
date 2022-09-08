package com.loiane.cursojava.exercicios.aula15;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int diaDaSemana;
		
		System.out.println("Insira o dia da semana: (1- Domingo)(2- Segunda)...");
		diaDaSemana = scan.nextInt();
		
		switch(diaDaSemana)
		{
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Número Inválido");
		}

	}

}
