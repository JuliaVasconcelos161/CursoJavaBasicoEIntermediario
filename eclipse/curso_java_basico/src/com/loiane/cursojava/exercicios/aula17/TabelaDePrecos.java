package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class TabelaDePrecos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Loja quase dois - Tabela de preços");
		for(int i = 1; i <= 50; i++)
		{
			System.out.println(i + " - " + (i*1.99));
		}
		
		

	}

}
