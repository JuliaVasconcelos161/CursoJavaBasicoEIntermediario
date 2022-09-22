package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class VetorIdadeMaior35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] aIdades = new int[10];
		int quantMaior35 = 0;
		
		for(int i = 0; i < aIdades.length; i++)
		{
			System.out.println("Insira a idade:" + (i+1));
			aIdades[i] = sc.nextInt();
			if(aIdades[i] > 35)
			{
				quantMaior35++;
			}
		}
		System.out.println("A quantidade de idades maior que 35 seria: " + quantMaior35);

	}

}
