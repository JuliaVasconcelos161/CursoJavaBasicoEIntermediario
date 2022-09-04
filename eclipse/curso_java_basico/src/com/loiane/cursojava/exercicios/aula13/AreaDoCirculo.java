package com.loiane.cursojava.exercicios.aula13;
import java.util.Scanner;
import java.lang.Math;

public class AreaDoCirculo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double raio;
		double area;
		
		System.out.println("Digite o raio para calcular a area da circunferencia");
		raio = scan.nextDouble();
		area = Math.PI* Math.pow(raio, 2);
		System.out.println("A area é " + area);
		

	}

}
