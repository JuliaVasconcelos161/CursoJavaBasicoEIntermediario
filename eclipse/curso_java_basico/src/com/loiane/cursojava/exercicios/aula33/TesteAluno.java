package com.loiane.cursojava.exercicios.aula33;

import java.util.Scanner;


public class TesteAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Insira o nome do aluno: ");
		String nome = sc.next();
		aluno.setNome(nome);
		
		System.out.println("Insira a matrícula do aluno: ");
		aluno.setNumMatricula(sc.next());
		
		System.out.println("Insira o curso do aluno: ");
		aluno.setCurso(sc.next());
		
		for(int i = 0; i < aluno.getDisciplinas().length; i++)
		{
			System.out.println("Insira a disciplina " + (i+1) + " do aluno: ");
			aluno.setDisciplinaPos(i, sc.next());
		}
		
		for(int i = 0; i < aluno.getNotasDisciplinas().length; i++)
		{
			System.out.println("Obtendo notas da disciplina " + aluno.getDisciplinas()[i]);
			for(int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++)
			{
				System.out.println("Insira a nota" +  (j+1));
				aluno.setNotasDisciplinaPos(i, j, sc.nextInt());
			}
		}
		
		aluno.mostrarInfo();
		
		for(int i = 0; i < aluno.getDisciplinas().length; i++)
		{
			if(aluno.verificarAprovacao(i))
			{
				System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " foi aprovado");
			}
			else
			{
				System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " foi reprovado");
			}
		}

	}

}
