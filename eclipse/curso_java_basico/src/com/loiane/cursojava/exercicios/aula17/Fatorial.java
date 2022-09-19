package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fatorial = 1;
		System.out.println("Insira um número para ver seu fatorial: ");
		int num = scan.nextInt();
		
		System.out.print(num + "! = ");
		for(int i = num; i > 0; i--)
		{
			if(i == num)
			{
				System.out.print(i);
			}
			else
			{
				System.out.print("." + i);
			}	
			fatorial *= i;
			
		}
		System.out.print(" = " + fatorial);
	}

}
