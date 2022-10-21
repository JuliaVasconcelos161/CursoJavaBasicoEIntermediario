package com.loiane.cursojava.exercicios.aula27;

import java.util.Scanner;

public class AlunoTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Insira o nome do aluno: ");
		aluno.nome = sc.next();
		
		System.out.println("Insira a matrícula do aluno: ");
		aluno.numMatricula = sc.next();
		
		System.out.println("Insira o curso do aluno: ");
		aluno.curso = sc.next();
		
		for(int i = 0; i < aluno.disciplinas.length; i++)
		{
			System.out.println("Insira a disciplina " + (i+1) + " do aluno: ");
			aluno.disciplinas[i] = sc.next();
		}
		
		for(int i = 0; i < aluno.notasDisciplinas.length; i++)
		{
			System.out.println("Obtendo notas da disciplina " + aluno.disciplinas[i]);
			for(int j = 0; j < aluno.notasDisciplinas[i].length; j++)
			{
				System.out.println("Insira a nota" +  (j+1));
				aluno.notasDisciplinas[i][j] = sc.nextInt();
			}
		}
		
		aluno.mostrarInfo();
		
		for(int i = 0; i < aluno.disciplinas.length; i++)
		{
			if(aluno.verificarAprovacao(i))
			{
				System.out.println("Disciplina " + aluno.disciplinas[i] + " foi aprovado");
			}
			else
			{
				System.out.println("Disciplina " + aluno.disciplinas[i] + " foi reprovado");
			}
		}
		
	

	}

}
