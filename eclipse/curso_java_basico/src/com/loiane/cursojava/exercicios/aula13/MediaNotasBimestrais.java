package com.loiane.cursojava.exercicios.aula13;
import java.util.Scanner;

public class MediaNotasBimestrais {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		
		System.out.println("Digite as 4 notas para ser feita a média: ");
		nota1 = scan.nextDouble();
		nota2 = scan.nextDouble();
		nota3 = scan.nextDouble();
		nota4 = scan.nextDouble();
		media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("A media é: " + media);
		
		
	}

}
