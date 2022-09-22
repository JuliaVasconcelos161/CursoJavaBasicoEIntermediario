package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class MediaElementosImparesVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int qtdImpares = 0;
		int somaImpares = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.println("Insira a posição:" + (i+1));
			a[i] = sc.nextInt();
			if(a[i] % 2 != 0)
			{
				somaImpares+= a[i];
				qtdImpares++;
			}
		}
		double media = somaImpares/qtdImpares;
		System.out.println("A media seria: " + media);

	}

}
