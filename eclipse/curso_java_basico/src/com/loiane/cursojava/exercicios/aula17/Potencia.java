package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double base;
		double expoente;
		double potencia = 1;
		
		System.out.println("Digite a base e o expoente");
		base = scan.nextDouble();
		expoente = scan.nextDouble();
		for(int i = 0; i < expoente; i++)
		{
			potencia = potencia * base;
		}
		System.out.println("A potencia será " + potencia);
	}

}
