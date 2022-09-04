package com.loiane.cursojava.exercicios.aula13;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero1;
		int numero2;
		int soma;
		
		System.out.println("Insira dois numeros: ");
		numero1 = scan.nextInt();
		numero2 = scan.nextInt();
		soma = numero1 + numero2;
		System.out.println("O resultado da soma é " + soma);
	}

}
