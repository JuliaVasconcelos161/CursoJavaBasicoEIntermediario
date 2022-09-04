package com.loiane.cursojava.exercicios.aula13;
import java.util.Scanner;

public class FarenheitParaCelsius {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double farenheit;
		double celsius;
		
		System.out.println("Digite a temperatura em farenheit para ser transformada em celsius");
		farenheit = scan.nextDouble();
		
		celsius = 5*(farenheit-32)/9;
		System.out.println("Em celsius seria: " + celsius);

	}

}
