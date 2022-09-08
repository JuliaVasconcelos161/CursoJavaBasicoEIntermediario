package com.loiane.cursojava.exercicios.aula15;
import java.util.Scanner;

public class ClassificacaoTriangulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean triangulo = true;
		double lado1;
		double lado2;
		double lado3;
		
		System.out.println("Insira os lados do triângulo: ");
		lado1 = scan.nextDouble();
		lado2= scan.nextDouble();
		lado3 = scan.nextDouble();
		
		if(((lado1 + lado2) < lado3) || ((lado2 + lado3) < lado1) || ((lado1 + lado3) < lado2))
		{
			triangulo = false;
			System.out.println("Não é um triangulo");
		}
	
		if(triangulo == true)
		{
			if((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3))
			{
				System.out.println("O triangulo é escaleno");
			}
			else if((lado1 == lado2) && (lado2 ==  lado3) && (lado1 == lado3))
			{
				System.out.println("O triangulo é equilátero");
			}
			else if((lado1 == lado2) || (lado2 ==  lado3) || (lado1 == lado3))
			{
				System.out.println("O triangulo é isósceles");
			}
		}
	}

}
