package com.loiane.cursojava.exercicios.aula13;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		double dinheiroPorHora;
		int horas;
		double salario;
		
		System.out.println("Digite o quanto voce ganha por hora e quantas horas voce trabalhou");
		dinheiroPorHora = scan.nextDouble();
		horas = scan.nextInt();
		
		salario = dinheiroPorHora * horas;
		
		System.out.println("O seu salario é " + salario);

	}

}
