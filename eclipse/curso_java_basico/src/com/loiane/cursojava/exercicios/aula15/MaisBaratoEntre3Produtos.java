package com.loiane.cursojava.exercicios.aula15;

import java.util.Scanner;

public class MaisBaratoEntre3Produtos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double produto1;
		double produto2;
		double produto3;
		
		System.out.println("Insira tres preços de produtos: ");
		produto1 = scan.nextDouble();
		produto2= scan.nextDouble();
		produto3 = scan.nextDouble();
	
		
		if(produto1 < produto2 && produto1 < produto3)
		{
			System.out.println("Compre o primeiro");
		}
		else if(produto2 < produto1 && produto2 < produto3)
		{
			System.out.println("Compre o segundo");
		}
		else if(produto3 < produto1 && produto3 < produto2)
		{
			System.out.println("Compre o terceiro");
		}
		else
		{
			System.out.println("Os preços são iguais");
		}


	}

}
