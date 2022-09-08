package com.loiane.cursojava.exercicios.aula15;

import java.util.Scanner;

public class OrdemDecrescente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num1;
		double num2;
		double num3;
		
		System.out.println("Insira tres numeros: ");
		num1 = scan.nextDouble();
		num2= scan.nextDouble();
		num3 = scan.nextDouble();
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.print(num1 + " ");
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.print(num2 + " ");
		}
		else if(num3 > num1 && num3 > num2)
		{
			System.out.print(num3 + " ");
		}
		else
		{
			System.out.println("Os números são iguais");
		}
		
		if((num1 < num2 && num1 > num3) || (num1 > num2 && num1 < num3))
		{
			System.out.print(" " + num1 + " ");
		}
		else if((num2 < num1 && num2 > num3) || (num2 > num1 && num2 < num3))
		{
			System.out.print(" " + num2 + " ");
		}
		else if((num3 < num1 && num3 > num2) || (num3 > num1 && num3 < num2))
		{
			System.out.print(" " +  num3 + " ");
		}
		
		if(num1 < num2 && num1 < num3)
		{
			System.out.print(" " + num1);
		}
		else if(num2 < num1 && num2 < num3)
		{
			System.out.print(" " + num2);
		}
		else if(num3 < num1 && num3 < num2)
		{
			System.out.print(" " +  num3);
		}

	}

}
