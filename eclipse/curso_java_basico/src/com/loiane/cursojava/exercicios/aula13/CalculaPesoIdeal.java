package com.loiane.cursojava.exercicios.aula13;
import java.util.Scanner;

public class CalculaPesoIdeal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double altura;
		double pesoIdeal;
		
		System.out.println("Digite sua altura em metros: ");
		altura = scan.nextDouble();
		pesoIdeal = 72.7*altura -58;
		System.out.println("Seu peso ideal é " + pesoIdeal + " kg");

	}

}
