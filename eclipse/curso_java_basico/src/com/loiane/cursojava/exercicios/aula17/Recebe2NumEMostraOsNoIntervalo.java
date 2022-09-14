package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Recebe2NumEMostraOsNoIntervalo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira dois numeros: ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double i = num1 + 1;
		
		do {
			System.out.println(i);
			i++;
		}while(i < num2);
		

	}

}
