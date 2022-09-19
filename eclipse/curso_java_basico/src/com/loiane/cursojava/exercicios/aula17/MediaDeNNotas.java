package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class MediaDeNNotas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double media;
		double nota;
		double soma = 0;
		
		System.out.println("Insira um número de notas: ");
		int notas = scan.nextInt();
		
		for(int i = 0; i < notas; i++)
		{
			System.out.println("Insira a nota: " + (i+1));
			nota = scan.nextDouble();
			soma += nota;
			
		}
		media = soma/notas;
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}

}
