package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class CardapioLanchonete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean naoTerminar = true;
		int cod, qtd;
		double total = 0;
		String output = "";
		
		do
		{
			System.out.println("Digite o codigo e a quantidade. Digite 00 para sair. ");
			cod = sc.nextInt();
			qtd = sc.nextInt();
			
			if(cod == 0 && qtd == 0)
			{
				naoTerminar = false;
				output += "Total a pagar = " + total;
			}
			switch(cod)
			{
				case 100:
					output += "Cachorro quente -> 1,20 * " + qtd;
					output += " = " + (1.2 * qtd + "\n");
					total += 1.2 * qtd;
					break;
					
				case 101:
					output += "Bauru Simples -> 1,30 * " + qtd;
					output += " = " + (1.3 * qtd + "\n");
					total += 1.3 * qtd;
					break;
					
				case 102:
					output += "Bauru com ovo -> 1,50 * " + qtd;
					output += " = " + (1.5 * qtd + "\n");
					total += 1.5 * qtd;
					break;
					
				case 103:
					output += "Hamburguer -> 1,20 * " + qtd;
					output += " = " + (1.2 * qtd + "\n");
					total += 1.2 * qtd;
					break;
					
				case 104:
					output += "Cheeseburguer -> 1,30 * " + qtd;
					output += " = " + (1.3 * qtd + "\n");
					total += 1.3* qtd;
					break;
					
				case 105:
					output += "Refrigerante -> 1* " + qtd;
					output += " = " + (1 * qtd + "\n");
					total += 1 * qtd;
					break;
			}
		}while(naoTerminar);
		System.out.println(output);
	}

}
