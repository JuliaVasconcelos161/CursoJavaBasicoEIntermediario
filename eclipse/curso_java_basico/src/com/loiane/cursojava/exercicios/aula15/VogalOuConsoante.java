package com.loiane.cursojava.exercicios.aula15;
import java.util.Scanner;

public class VogalOuConsoante {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char letra;
		
		System.out.println("Insira uma letra: ");
		letra = scan.next().charAt(0);
		
		switch(letra)
		{
			case 'a': case 'e': case'i': case'o': case 'u':
				System.out.println("Vogal");
				break;
			case '1': case '2': case'3': case'4': case '5': case'6': case'7': case'8': case'9': case'0':
				System.out.println("Não é letra");
				break;
			default:
				System.out.println("Consoante");
		}

	}

}
