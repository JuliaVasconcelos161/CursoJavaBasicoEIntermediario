package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class Tabuada1a10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("Insira um numero: (Entre 0 e 10)");
		num = scan.nextInt();
		for(int i = 0; i < 11; i++)
		{
			System.out.println(num + " x " + i + " = " + num*i);
		}

	}

}
