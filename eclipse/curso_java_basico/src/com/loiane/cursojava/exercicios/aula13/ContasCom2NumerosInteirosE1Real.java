package com.loiane.cursojava.exercicios.aula13;
import java.util.Scanner;
import java.lang.Math;

public class ContasCom2NumerosInteirosE1Real {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeroInteiro1;
		int numeroInteiro2;
		double numeroReal;
		int resultado1;
		double resultado2;
		double resultado3;
		
		
		System.out.println("Digite dois numeros inteiros e um real: ");
		numeroInteiro1 = scan.nextInt();
		numeroInteiro2 = scan.nextInt();
		numeroReal = scan.nextDouble();
//		resultado1 = numeroInteiro1*2 * numeroInteiro2/2;
//		Seria o mesmo que
		resultado1 =  numeroInteiro1 * numeroInteiro2;
		resultado2 = 3*numeroInteiro1 + numeroReal; 
		resultado3 = Math.pow(numeroReal, 3); 
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + resultado1);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + resultado2);
		System.out.println("O terceiro elevado ao cubo: " + resultado3);
	}

}
