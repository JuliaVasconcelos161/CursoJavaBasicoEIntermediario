package com.loiane.cursojava.aula14;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade;
		
//		System.out.println("Insira uma idade");
//		idade = scan.nextInt();
//		
//		if(idade >= 18)
//		{
//			System.out.println("Voce é maior de idade");
//		}
//		else
//		{
//			System.out.println("Voce é menor de idade");
//			
//		}
		
//		barato <= 10
//		10 < valor < 15 pedir desconto
//		15 <= valor < 17 procurar mais
//		valor>= 17 caro
		
		System.out.println("Insira o valor do item: ");
		double valor = scan.nextDouble();
		
		if (valor<= 10)
		{
			System.out.println("Barato, pode comprar");
		}
		else if (10 < valor && valor < 15)
		{
			System.out.println("Você pode pedir um desconto");
		}
		else if(15 <= valor && valor < 17)
		{
			System.out.println("Você pode pode pesquisar mais");
		}
		else// valor>=17
		{
			System.out.println("Valor está muito caro");
		}
	}

}
