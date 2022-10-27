package com.loiane.cursojava.exercicios.aula36;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Curso curso = new Curso();
		
		System.out.println("Insira o nome do curso: ");
		curso.setNome(sc.nextLine());
		
		System.out.println("Insira o horário do curso " + curso.getNome() + ":");
		curso.setHorario(sc.nextLine());
		
		
		System.out.println("\nProfessor:");
		Professor professor = new Professor();
		System.out.println("Insira o nome do professor do curso " + curso.getNome() + ":");
		professor.setNome(sc.nextLine());
		
		System.out.println("Insira o departamento do " + professor.getNome() + ":");
		professor.setDepartamento(sc.nextLine());
		
		System.out.println("Insira o email do " + professor.getNome() + ":");
		professor.setEmail(sc.nextLine());
		
		
		curso.setProfessor(professor);
		
		System.out.println("\nAlunos:");
		Aluno[] alunos = new Aluno[5];
		for(int i = 0; i < alunos.length; i++)
		{
			Aluno aluno = new Aluno();
			System.out.println("Insira o nome do aluno " + (i+1) + ":");
			aluno.setNome(sc.next());
			
			System.out.println("Insira a matricula do aluno " + aluno.getNome() + ":");
			aluno.setMatricula(sc.next());
			
			double[] notas = new double[aluno.getNotas().length];
			for(int j = 0; j < aluno.getNotas().length; j++)
			{
				System.out.println("Insira a nota " + (j+1) + " do aluno " + aluno.getNome() + ":");
				notas[j] = sc.nextDouble();
			}
			
			aluno.setNotas(notas);
			alunos[i] = aluno;

		}
		
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInfo());
		
		
		
	}

}
