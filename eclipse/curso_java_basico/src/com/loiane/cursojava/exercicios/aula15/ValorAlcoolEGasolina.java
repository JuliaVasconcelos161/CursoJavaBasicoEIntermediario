package com.loiane.cursojava.exercicios.aula15;

import java.util.Scanner;

public class ValorAlcoolEGasolina {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String combustivel;
		double quantLitros;
		double valor = 0;
		double valorGas = 2.5;
		double valorAl = 1.9;
		double desconto = 0;
		boolean valido = true;
		
		System.out.println("Escolha seu combustivel: A-alcool, ou G-gasolina");
		combustivel = scan.next();
		
		System.out.println("Qual a quantidade de litros?");
		quantLitros = scan.nextDouble();
		switch(combustivel)
		{
			case "A": case "a":
				valor = quantLitros * valorAl;
				if(quantLitros < 20)
				{
					desconto = 0.03 * valor;
					valor -= desconto;
				}
				else if(quantLitros >= 20)
				{
					desconto = 0.05 * valor;
					valor -= desconto ;
				}
				break;
				
			case "G": case "g":
				valor = quantLitros * valorGas;
				if(quantLitros < 20)
				{
					desconto = 0.04 * valor;
					valor -= desconto;
				}
				else if(quantLitros >= 20)
				{
					desconto = 0.06 * valor;
					valor -= desconto;
				}
				break;
			default:
				valido = false;
				System.out.println("Valor invalido");
				
		}
		if(valido)
		{
			double valorBruto = desconto + valor;
			System.out.println("O valor bruto seria: " + valorBruto);
			System.out.println("O desconto seria: " + desconto);
			System.out.println("O valor a ser pago seria: " + valor);
		}

	}

}