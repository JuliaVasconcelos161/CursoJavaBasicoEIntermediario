package com.loiane.cursojava.exercicios.aula13;
import java.util.Scanner;

public class CelsiusParaFarenheit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double farenheit;
		double celsius;
		
		System.out.println("Digite a temperatura em celsius");
		celsius = scan.nextDouble();
		farenheit = 9*celsius/5 + 32;
		System.out.println("A temperatura em farenheit é " + farenheit);
	}

}
