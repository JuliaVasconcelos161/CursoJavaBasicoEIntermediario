package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class CaixaRudimentar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sair = false;
		int quantProdutos;
		double precoProduto;
		double total;
		String output;
		String continuarCompra;
		double valorPago, troco;
		

		do {
			System.out.println("Deseja informar uma nova compra?(S/N)");
			continuarCompra = sc.next();
			
			if(continuarCompra.equalsIgnoreCase("s"))
			{
				total = 0;
				output = "Lojas Tabajara\n";
				System.out.println("Insira a quantidade de produtos da compra: ");
				quantProdutos = sc.nextInt();
				
				for(int i = 0; i < quantProdutos; i++)
				{
					System.out.println("Insira o preco do produto " + (i+1));
					precoProduto = sc.nextDouble();
					total += precoProduto;
					output += "Produto " + (i+1) + ": R$ " + precoProduto + "\n"; 
				}
				output += "Total: R$ " + total + "\n";
				System.out.println("Total: R$ " + total + "\n");
				
				System.out.println("Entre com o valor do pagamento: ");
				valorPago = sc.nextDouble();
				output += "Dinheiro: R$ " + valorPago + "\n"; 
				
				troco = valorPago - total;
				
				output += "Troco: R$ " + troco;
				System.out.println(output);
			}
			else
			{
				sair = true;
			}
			
		}while(!sair);
	}

}
