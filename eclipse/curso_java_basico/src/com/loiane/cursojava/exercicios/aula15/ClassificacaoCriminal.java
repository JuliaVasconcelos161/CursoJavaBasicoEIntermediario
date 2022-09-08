package com.loiane.cursojava.exercicios.aula15;

import java.util.Scanner;

public class ClassificacaoCriminal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalSim = 0;
		String resposta;
		
		System.out.println("Telefonou para a vítima?");
		resposta = scan.next();
		switch (resposta)
		{
			case "sim":
				totalSim++;
		}
		System.out.println("Esteve no local do crime?");
		resposta = scan.next();
		switch (resposta)
		{
			case "sim":
				totalSim++;
		}
		System.out.println("Mora perto da vítima?");
		resposta = scan.next();
		switch (resposta)
		{
			case "sim":
				totalSim++;
		}
		System.out.println("Devia para a vítima?");
		resposta = scan.next();
		switch (resposta)
		{
			case "sim":
				totalSim++;
		}
		System.out.println("Já trabalhou com a vítima?");
		resposta = scan.next();
		switch (resposta)
		{
			case "sim":
				totalSim++;
		}
		switch(totalSim)
		{
			case 2:
				System.out.println("Suspeito");
				break;
			case 3: case 4:
				System.out.println("Cúmplice");
				break;
			case 5:
				System.out.println("Assassino");
				break;
			default:
				System.out.println("Inocente");
		}
	}

}
