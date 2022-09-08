package com.loiane.cursojava.exercicios.aula15;

import java.util.Scanner;

public class CompraCarnes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o tipo de carne: ");
		System.out.println("1 - file duplo");
		System.out.println("2 - alcatra");
		System.out.println("3 - picanha");
		int tipo = sc.nextInt();
		
		System.out.println("Entre com a quatidade (kg) de carne: ");
		double qtdCarne = sc.nextDouble();
		
		double precoKg = 0;
		
		if(tipo == 1)
		{
			System.out.println(qtdCarne + "kg - file duplo");
			if(qtdCarne < 5)
			{
				precoKg = 4.9;
			}
			else
			{
				precoKg = 5.8;
			}
		}
		else if(tipo == 2)
		{
			System.out.println(qtdCarne + "kg - alcatra");
			if(qtdCarne < 5)
			{
				precoKg = 5.9;
			}
			else
			{
				precoKg = 6.8;
			}
		}
		else if(tipo == 3)
		{
			System.out.println(qtdCarne + "kg - picanha");
			if(qtdCarne < 5)
			{
				precoKg = 6.9;
			}
			else
			{
				precoKg = 7.8;
			}
		}
		double total = qtdCarne * precoKg;
		System.out.println(qtdCarne + "kg * " + precoKg + " = " + total);
		
		System.out.println("Compra no cartão? Digite 1 para sim:");
		int cartao = sc.nextInt();
		
		if(cartao == 1)
		{
			double desconto = 0.05 * total;
			total -= desconto;
			System.out.println("Desconto de: " + desconto);
			System.out.println("Valor a pagar: " + total);
		}
		else
		{
			System.out.println("Valor a pagar: " + total);
		}
	}

}
