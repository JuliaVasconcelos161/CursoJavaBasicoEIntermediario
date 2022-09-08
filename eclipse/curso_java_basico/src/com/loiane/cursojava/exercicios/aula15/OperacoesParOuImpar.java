package com.loiane.cursojava.exercicios.aula15;

import java.util.Scanner;

public class OperacoesParOuImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numero1;
		double numero2;
		double resultado = 0;
		String operacao;
		boolean valida = true;
		
		System.out.println("Insira dois números : ");
		numero1 = scan.nextDouble();
		numero2 = scan.nextDouble();
		
		System.out.println("Escolha qual operação deseja realizar: (+ - / *)");
		operacao = scan.next();
		
		switch(operacao)
		{
			case "+":
				resultado = numero1 + numero2;
				break;
			case "-":
				resultado = numero1 - numero2;
				break;
			case "/":
				resultado = numero1 / numero2;
				resultado = Math.round(resultado);
				break;
			case "*":
				resultado = numero1 * numero2;
				break;	
			default:
				System.out.println("Operação invalida");
				valida = false;
		}
		if(valida)
		{
			System.out.println("O resultado é: " + resultado);
			if(resultado > 0)
			{
				System.out.println("Resultado positivo");
			}
			else if (resultado < 0)
			{
				System.out.println("Resultado negativo");
			}
			else
			{
				System.out.println("Resultado nulo");
			}
			
			if(resultado % 2 == 0)
			{
				System.out.println("O resultado é par");
			}
			else
			{
				System.out.println("O resultado é impar");
			}
		}
		
		

	}

}
