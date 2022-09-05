package com.loiane.cursojava.exercicios.aula15;
import java.util.Scanner;

public class EscreveFemininoOuMasculino {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char sexo;
		
		System.out.println("Insira \"f\" ou \"F\" para feminino e \"m\" ou \"M\" para masculino");
		sexo = scan.next().charAt(0);
		
		switch(sexo)
		{
			case 'f': case 'F':
				System.out.println("Feminino");
				break;
			case 'm': case'M':
				System.out.println("Masculino");
				break;
			default:
				System.out.println("Sexo inválido");
		}
	}

}
