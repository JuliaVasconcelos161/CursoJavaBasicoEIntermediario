package com.loiane.cursojava.exercicios.aula13;
import java.util.Scanner;

public class DescontosNoSalario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double dinheiroPorHora;
		int horasTrabalhadas;
		double salarioBruto;
		double descontoINSS;
		double descontoIR;
		double descontoSindicato;
		double salarioLiquido;
		
		System.out.println("Digite quanto voce ganha por hora e quantas horas foram trabalhadas:");
		dinheiroPorHora = scan.nextDouble();
		horasTrabalhadas = scan.nextInt();
		
		salarioBruto = dinheiroPorHora * horasTrabalhadas;
		descontoINSS = salarioBruto * 0.08;
		descontoSindicato = salarioBruto * 0.05;
		descontoIR = salarioBruto * 0.11;
		salarioLiquido = salarioBruto - (descontoINSS + descontoSindicato + descontoIR);
		System.out.println("O salario bruto é "+ salarioBruto +" reais");
		System.out.println("O desconto INSS é "+ descontoINSS +" reais");
		System.out.println("O desconto sindicato  é "+ descontoSindicato +" reais");
		System.out.println("O salario liquido é "+ salarioLiquido +" reais");
		

	}

}
