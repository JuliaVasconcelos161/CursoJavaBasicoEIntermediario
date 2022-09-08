package com.loiane.cursojava.exercicios.aula15;
import java.util.Scanner;

public class CalculaConceitoEMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double media;
		double nota1;
		double nota2;
		char conceito = 'A';
		String aprovacao = "";
		
		System.out.println("Insira suas duas notas: ");
		nota1 = scan.nextDouble();
		nota2 = scan.nextDouble();
		media = (nota1 + nota2)/2;
		
		if (media >= 9 && media <= 10)
		{
			conceito = 'A';
			
		}
		else if(media >= 7.5 && media < 9)
		{
			conceito = 'B';
		}
		else if(media >= 6 && media < 7.5)
		{
			conceito = 'C';
		}
		else if(media >= 4 && media < 6)
		{
			conceito = 'D';
		}
		else if(media >= 0 && media < 4)
		{
			conceito = 'E';
		}
		else
		{
			System.out.println("Esse número é inválido");
		}
		
		switch(conceito)
		{
			case 'A': case 'B': case 'C':
				aprovacao = "APROVADO";
				break;
			case 'D': case'E':
				aprovacao = "REPROVADO";
				break;
		}
		
		if((nota1 >= 0 && nota1 <= 10) && (nota2 >= 0 && nota2 <= 10))
		{
			System.out.println("As notas são: " + nota1 + " " + nota2);
			System.out.println("A média é: " + media);
			System.out.println("O conceito é: " + conceito);
			System.out.println(aprovacao);
		}
		
		
	}

}
