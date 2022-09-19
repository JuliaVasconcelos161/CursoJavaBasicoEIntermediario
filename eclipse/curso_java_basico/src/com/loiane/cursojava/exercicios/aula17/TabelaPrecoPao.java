package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class TabelaPrecoPao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Preço do pão: R$ 0.18");
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		for(int i = 1; i <= 50; i++)
		{
			System.out.println(i + " - " + (i*0.18));
		}
		
		

	}

}
