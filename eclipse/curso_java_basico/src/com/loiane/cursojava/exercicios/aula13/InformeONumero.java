package com.loiane.cursojava.exercicios.aula13;
import java.util.Scanner;

public class InformeONumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		System.out.println("O número informado foi: " + numero);

	}

}
