package com.loiane.cursojava.exercicios.aula15;

import java.util.Scanner;

public class CompraDeFrutas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade (kg) de morangos: ");
		double qtdMorangos = scan.nextDouble();
		System.out.println("Entre com a quantidade (kg) de maca: ");
		double qtdMaca = scan.nextDouble();
		
		double precoKgMorango = 0;
		if(qtdMorangos <= 5)
		{
			precoKgMorango = 2.5;
		}
		else
		{
			precoKgMorango = 2.2;
		}
		
		double precoKgMaca = 0;
		if(qtdMaca <= 5)
		{
			precoKgMaca = 1.8;
		}
		else
		{
			precoKgMaca = 1.5;
		}
		
		double precoTotalMorango = qtdMorangos * precoKgMorango;
		double precoTotalMaca = qtdMaca * precoKgMaca;
		double precoParcial =  precoTotalMorango + precoTotalMaca;
		
		double precoTotal = precoParcial;
		if(((qtdMorangos + qtdMaca) > 8)||( precoParcial > 25))
		{
			double desconto = 0.1 * precoParcial;
			precoTotal = precoParcial - desconto;
		}
		System.out.println("Preco total: " + precoTotal);
	}

}
