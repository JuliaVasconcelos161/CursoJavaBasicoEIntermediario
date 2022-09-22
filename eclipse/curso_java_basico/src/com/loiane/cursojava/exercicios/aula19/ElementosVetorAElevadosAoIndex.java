package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class ElementosVetorAElevadosAoIndex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] vetorA = new double[11];
		
		for(int i = 0; i < vetorA.length; i++)
		{
			vetorA[i] = Math.pow(2, i);	
			System.out.println("O vetor A posição " + i + " = " + vetorA[i] + " ");
		}

	}

}
