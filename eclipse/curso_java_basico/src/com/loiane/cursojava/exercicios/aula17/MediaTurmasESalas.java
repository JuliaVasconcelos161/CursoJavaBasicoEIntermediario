package com.loiane.cursojava.exercicios.aula17;

import java.util.Scanner;

public class MediaTurmasESalas {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int numAlunos = 0;
		int mediaAlunosPorTurma;
		System.out.println("Insira o número de turmas: ");
		int numTurmas = sc.nextInt();
		
		for(int i = 0; i< numTurmas; i++)
		{
			System.out.println("Insira o número de alunos por turma, turma " + (i+1) + ":");
			int numAlunosPorTurma = sc.nextInt();
			if(numAlunosPorTurma > 40)
			{
				System.out.println("Número inválido");
				i--;
			}
			else
			{
				numAlunos += numAlunosPorTurma;
			}
		}
		mediaAlunosPorTurma = numAlunos/numTurmas;
		System.out.println("A media de alunos por turma é " + mediaAlunosPorTurma);
	}

}
