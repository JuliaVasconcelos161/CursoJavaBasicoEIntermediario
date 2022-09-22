package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class VetorBRaizQuadradaDeA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[15];
		double[] b = new double[a.length];
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.println("Insira a posição:" + (i+1));
			a[i] = sc.nextInt();
			b[i] = Math.sqrt(a[i]);
			System.out.println(" a = " + a[i] + " b = " + b[i]);
		}
		

	}

}
