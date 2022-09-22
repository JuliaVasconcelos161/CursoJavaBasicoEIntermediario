package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class VetorCSomaElementosAEB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.println("Insira a posição " + (i+1) + " de a:");
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < b.length; i++)
		{
			System.out.println("Insira a posição " + (i+1) + " de b:");
			b[i] = sc.nextInt();
		}
		
		for(int i = 0; i < c.length; i++)
		{
			c[i] = a[i] + b[i];
			System.out.println(" a = " + a[i] + " b = " + b[i] + " c = " + c[i]);
		}
	}

}
