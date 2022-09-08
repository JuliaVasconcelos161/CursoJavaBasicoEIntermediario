package com.loiane.cursojava.exercicios.aula15;
import java.util.Scanner;

public class ImprimeOMaiorNumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numero1;
		double numero2;
		
		System.out.println("Insira dois números: ");
		numero1 = scan.nextDouble();
		numero2 = scan.nextDouble();
		
		if (numero1 > numero2)
		{
			System.out.println("O número " + numero1 + " é maior ");
		}
		else if(numero2 == numero1)
		{
			System.out.println("O primeiro número é igual ao segundo");
		}
		else
		{
			System.out.println("O número " + numero2 + " é maior ");
		}
	}

}
