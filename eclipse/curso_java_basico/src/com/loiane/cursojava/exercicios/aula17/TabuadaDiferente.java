package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class TabuadaDiferente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean invalido = true;
		int numInicio;
		int numFinal;
		System.out.println("Insira um numero: (Entre 0 e 10)");
		num = sc.nextInt();
		
		
		
		do {
			System.out.println("Entre com o início da tabuada");
			numInicio = sc.nextInt();
			
			System.out.println("Entre com o final da tabuada");
			numFinal = sc.nextInt();
			
			if(numFinal > numInicio)
			{
				invalido = false;
			}
		}while(invalido);
		
		System.out.println("Tabuada de: " + num);
		System.out.println("Começa por: " + numInicio);
		System.out.println("Termina por: " + numFinal);
		System.out.println();
		
		for(int i = numInicio; i <= numFinal; i++)
		{
			System.out.println(num + " x " + i + " = " + num*i);
		}


	}

}
