package com.loiane.cursojava.exercicios.aula27;

public class Aluno {
	String nome;
	String numMatricula;
	String curso;
	String[] disciplinas = new String[3];
	int[][] notasDisciplinas = new int[3][4];
	
	void mostrarInfo()
	{
		System.out.println("Nome: " + nome);
		System.out.println("Número de matrícula: " + numMatricula);
		System.out.println("Curso: " + curso);
		
		for(int i = 0; i < notasDisciplinas.length; i++)
		{
			System.out.println("Notas da disciplina " + disciplinas[i]);
			for(int j = 0; j < notasDisciplinas[i].length; j++)
			{
				System.out.println("Nota " + (j+1) + " = " + notasDisciplinas[i][j]);
			}
			System.out.println();
		}
	}
	
	boolean verificarAprovacao(int indice)
	{
		double soma = 0;
		
		for(int i = 0; i < notasDisciplinas[indice].length; i++)
		{
			soma += notasDisciplinas[indice][i];
		}
		
		double media = soma/4;
		
		if(media >= 7)
		{
			return true;
		}

			return false;
	}

}
