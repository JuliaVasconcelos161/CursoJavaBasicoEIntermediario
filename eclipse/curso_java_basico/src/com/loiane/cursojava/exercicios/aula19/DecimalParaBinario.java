package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class DecimalParaBinario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantBits;
		int numDecimal;
		
		System.out.println("Insira a quantidade de bits");
		quantBits = scan.nextInt();
		
		int[] num = new int[quantBits];
		
		System.out.println("Insira um número decimal");
		numDecimal = scan.nextInt();
		
		for(int i = 0; i < num.length; i++)
		{
			num[i] = numDecimal % 2;
			numDecimal /= 2;
		}
		
		for(int i = num.length - 1; i >= 0; i--)
		{
			System.out.print(num[i]);
		
		}

	}

}
