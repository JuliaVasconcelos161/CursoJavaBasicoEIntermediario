package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;
public class NumPrimo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int num = scan.nextInt();
		boolean primo = true;
		for (int i = 2; i < num; i++)
		{
			if(num % i == 0)
			{
				System.out.println("Não é primo - divisível por " + i);
				primo = false;
//				break;
			}
			
		}
		if(primo)
		{
			System.out.println("É número primo");
		}	
	
	}

}
