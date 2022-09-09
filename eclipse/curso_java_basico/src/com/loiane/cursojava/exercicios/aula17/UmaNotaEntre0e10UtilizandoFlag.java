package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class UmaNotaEntre0e10UtilizandoFlag {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean notaValida = false;
		
		do
		{
			System.out.println("Insira uma nota: (Entre 0 e 10)");
			double nota = scan.nextDouble();
			if(nota < 0 || nota >= 10)
			{
				System.out.println("Valor invalido");
			}
			else
			{
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			}
	
		}while(!notaValida);

	}

}
