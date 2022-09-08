package com.loiane.cursojava.exercicios.aula15;
import java.util.Scanner;

public class RaizesFuncao2Grau {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a;
		double b;
		double c;
		double delta = 0;
		
		System.out.println("Insira o valor de a para montar a equação de segundo grau: (ax²+ bx + c = 0)");
		a = scan.nextDouble();
		
		if(a == 0)
		{
			System.out.println("Não é uma equação de 2 grau");
		}
		else
		{
			System.out.println("Insira os valores de b e c para montar a equação de segundo grau: (ax²+ bx + c = 0)");
			b = scan.nextDouble();
			c = scan.nextDouble();
			delta = Math.pow(b, 2) - 4*a*c;
			if (delta < 0)
			{
				System.out.println("Não existe raiz real");
			}
			else
			{
				double x1 = ((-b) + Math.sqrt(delta))/ (2*a);
				double x2 = ((-b) - Math.sqrt(delta))/ (2*a);
				if(delta == 0)
				{
					System.out.println("Existe apenas uma raiz, x = " + x1);
				}
				else
				{
					System.out.println("As raizes são x1 = " + x1 + " e x2 = " + x2);
				}
			}
		}
		
	}

}
