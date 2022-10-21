package com.loiane.cursojava.exercicios.aula33;

public class Aluno {
	private String nome;
	private String numMatricula;
	private String curso;
	private String[] disciplinas;
	private double[][] notasDisciplinas;
	
	public Aluno()
	{
		disciplinas = new String[3];
		notasDisciplinas = new double[3][4];
	}
	
	public Aluno(String nome, String numMatricula, String curso)
	{
		this.nome = nome;
		this.numMatricula = numMatricula;
		this.curso = curso;	
		this.disciplinas = new String[3];
		this.notasDisciplinas = new double[3][4];
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNumMatricula()
	{
		return numMatricula;
	}
	
	public void setNumMatricula(String numMatricula)
	{
		this.numMatricula = numMatricula;
	}
	
	public String getCurso()
	{
		return curso;
	}
	
	public void setCurso(String curso)
	{
		this.curso = curso;
	}
	
	public String[] getDisciplinas()
	{
		return disciplinas;
	}
	
	public void setDisciplinas(String[] disciplinas)
	{
		this.disciplinas = disciplinas; 
	}
	
	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}

	public void mostrarInfo()
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
	
	public boolean verificarAprovacao(int indice)
	{
		if(obterMedia(indice) >= 7)
		{
			return true;
		}
		else
		{
			return false;
			
		}
	}
	
	private double obterMedia(int indice)
	{
		double soma = 0;
		
		for(int i = 0; i < notasDisciplinas[indice].length; i++)
		{
			soma += notasDisciplinas[indice][i];
		}
		
		double media = soma/4;
		
		return media;
	}
	
	public void setDisciplinaPos(int pos, String disciplina)
	{
		this.disciplinas[pos] = disciplina;
	}
	
	public void setNotasDisciplinaPos(int i,int j, double nota)
	{
		this.notasDisciplinas[i][j] = nota;
	}

}
