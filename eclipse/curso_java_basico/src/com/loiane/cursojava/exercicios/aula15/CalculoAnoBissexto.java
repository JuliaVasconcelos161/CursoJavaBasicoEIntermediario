package com.loiane.cursojava.exercicios.aula15;

import java.util.Scanner;

public class CalculoAnoBissexto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ano;
		
		System.out.println("Insira o ano: ");
		ano = scan.nextInt();
		
		if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0))
		{
			System.out.println("É bissexto");
		}
		else
		{
			System.out.println("Não bissexto");
		}
	}

}
