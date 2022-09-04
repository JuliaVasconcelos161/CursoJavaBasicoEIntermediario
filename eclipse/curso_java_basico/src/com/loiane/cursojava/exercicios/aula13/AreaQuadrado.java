package com.loiane.cursojava.exercicios.aula13;
import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valorLadoQuadrado;
		double dobroArea;
		
		System.out.println("Insira o lado do quadrado: ");
		valorLadoQuadrado = scan.nextDouble();
		dobroArea = Math.pow(valorLadoQuadrado, 2) * 2;
		System.out.println("O dobro da area do quadrado é " + dobroArea);
	}

}
