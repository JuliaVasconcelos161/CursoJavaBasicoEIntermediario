package com.loiane.cursojava.exercicios.aula15;
import java.util.Scanner;

public class MediaDuasNotas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota1;
		double nota2;
		double media;
		
		System.out.println("Insira duas notas: (De 0 a 10)");
		nota1 = scan.nextDouble();
		nota2 = scan.nextDouble();
		media = (nota1 + nota2)/2;
		
		if(media == 10)
		{
			System.out.println("Aprovado com distinção");
		}
		else if(media >= 7 && media < 10)
		{
			System.out.println("Aprovado");
			
		}
		else if(media > 0 && media < 7)
		{
			System.out.println("Reprovado");
		}
	}

}
