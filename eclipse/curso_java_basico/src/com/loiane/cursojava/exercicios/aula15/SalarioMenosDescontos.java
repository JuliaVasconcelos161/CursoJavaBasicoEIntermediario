package com.loiane.cursojava.exercicios.aula15;

import java.util.Scanner;

public class SalarioMenosDescontos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double salario;
		double novoSalario;
		double iR;
		double descontoSindicato;
		double iNSS;
		double fGTS;
		double valorHora;
		double somaDescontos;
		int hora;
		
		System.out.println("Insira o valor de suas horas e quantas horas foram trabalhadas: ");
		valorHora = scan.nextDouble();
		hora = scan.nextInt();
		salario = valorHora * hora;
		
		if(salario <= 900)
		{
			iNSS = 0.1 * salario;
			descontoSindicato = 0.03 * salario;
			fGTS = 0.11 * salario;
			somaDescontos = iNSS + descontoSindicato;
			novoSalario = salario - somaDescontos;
			System.out.println("Salario Bruto: " + salario +  "\nINSS: " + iNSS + "\nFGTS: " + fGTS + "\nDesconto Sindicato: " + descontoSindicato  + "\nTotal descontos: " + somaDescontos + "\nSalario Liquido: " + novoSalario);
		}
		else if(salario <= 1500)
		{
			iNSS = 0.1 * salario;
			iR = 0.05 * salario;
			fGTS = 0.11 * salario;
			descontoSindicato = 0.03 * salario;
			somaDescontos = iNSS + descontoSindicato + iR;
			novoSalario = salario - somaDescontos;
			System.out.println("Salario Bruto: " + salario + "\nIR: " + iR + "\nINSS: " + iNSS + "\nFGTS: " + fGTS + "\nDesconto Sindicato: " + descontoSindicato  + "\nTotal descontos: " + somaDescontos + "\nSalario Liquido: " + novoSalario);
	
		}
		else if(salario <= 2500)
		{
			iNSS = 0.1 * salario;
			iR = 0.1 * salario;
			fGTS = 0.11 * salario;
			descontoSindicato = 0.03 * salario;
			somaDescontos = iNSS + descontoSindicato + iR;
			novoSalario = salario - somaDescontos;
			System.out.println("Salario Bruto: " + salario + "\nIR: " + iR + "\nINSS: " + iNSS + "\nFGTS: " + fGTS + "\nDesconto Sindicato: " + descontoSindicato  + "\nTotal descontos: " + somaDescontos + "\nSalario Liquido: " + novoSalario);
	
		}
		else if(salario > 2500)
		{
			iNSS = 0.1 * salario;
			iR = 0.2 * salario;
			fGTS = 0.11 * salario;
			descontoSindicato = 0.03 * salario;
			somaDescontos = iNSS + descontoSindicato + iR;
			novoSalario = salario - somaDescontos;
			System.out.println("Salario Bruto: " + salario + "\nIR: " + iR + "\nINSS: " + iNSS + "\nFGTS: " + fGTS + "\nDesconto Sindicato: " + descontoSindicato  + "\nTotal descontos: " + somaDescontos + "\nSalario Liquido: " + novoSalario);
	
		}

	}

}
