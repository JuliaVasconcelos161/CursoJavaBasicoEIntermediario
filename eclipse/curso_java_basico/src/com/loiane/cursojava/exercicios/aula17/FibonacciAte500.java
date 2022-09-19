package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class FibonacciAte500 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		int soma = 2;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		while(proximo <= 500)
		{
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.println(proximo);
		}
	}

}
