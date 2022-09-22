package com.loiane.cursojava.exercicios.aula19;

import java.util.Scanner;

public class Media2Provas10Alunos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] nota1 = new double[10];
		double[] nota2 = new double[nota1.length];
		double[] soma2Notas = new double[nota1.length];
		double[] result = new double[nota1.length];
		
		for(int i = 0; i < nota1.length; i++)
		{
			System.out.println("Insira a nota 1 do aluno " + (i+1) + ":");
			nota1[i] = sc.nextInt();
			
			System.out.println("Insira a nota 2 do aluno " + (i+1) + ":");
			nota2[i] = sc.nextInt();
			
			soma2Notas[i] = nota1[i] + nota2[i];
			result[i] = soma2Notas[i]/2;
			
			System.out.println("A média é " + result[i]);
			
			if(result[i] >=7)
			{
				System.out.println("Aprovado");
			}
			else
			{
				System.out.println("Reprovado");
			}
		}
		



	}

}
