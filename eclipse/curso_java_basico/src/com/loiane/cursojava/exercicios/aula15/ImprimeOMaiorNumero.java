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
			System.out.println("O primeiro número é maior que o segundo");
		}
		else if(numero2 == numero1)
		{
			System.out.println("O primeiro número é igual ao segundo");
		}
		else
		{
			System.out.println("O segundo número é maior que o primeiro");
		}
	}

}
