package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class IdadeEClassificacaoDeNPessoas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		int soma = 0;
		double media;
		System.out.println("Insira o número de idades: ");
		int idades = sc.nextInt();
		
		for(int i = 0; i < idades; i++)
		{
			System.out.println("Insira a idade: ");
			idade = sc.nextInt();
			soma += idade;
		}
		media = soma/idades;
		if(media > 0 && media <= 25)
		{
			System.out.println("A turma é jovem");
		}
		else if(media > 25 && media <= 60)
		{
			System.out.println("A turma é adulta");
		}
		else if(media > 60)
		{
			System.out.println("A turma é idosa");
		}

	}

}
