package com.loiane.cursojava.exercicios.aula15;

import java.util.Scanner;

public class Cumprimentos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char parteDoDia;
		
		System.out.println("Insira a parte do dia M-matutino, V-vespertino, N-noturno");
		parteDoDia = scan.next().charAt(0);
		
		switch(parteDoDia)
		{
			case 'M': case 'm':
				System.out.println("Bom dia!");
				break;
			case 'V': case 'v':
				System.out.println("Boa tarde!");
				break;
			case 'n': case 'N':
				System.out.println("Boa noite!");
				break;
			default:
				System.out.println("Valor inválido");
				break;
		}
	}

}
