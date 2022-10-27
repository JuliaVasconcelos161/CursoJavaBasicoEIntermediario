package com.loiane.cursojava.exercicios.aula36;

public class Aluno{
	private String nome;
	private String matricula;
	private double[] notas;
	
	public Aluno()
	{
		notas = new double[4];
	}
	
	public Aluno(String nome, String matricula)
	{
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public String obterInfo()
	{
		String info = "Nome do aluno = " + nome + "\n";
		info += "Matricula = " + matricula + "\n";
		info += "Notas: ";
		
	
		for(double nota: notas)
		{
			info +=  nota + " ";
		}
	
		info += "\n" + "Média = " + obterMedia();
		
		if(obterMedia() >= 7)
		{
			info += "\nAprovado!!\n";
		}
		else
		{
			info += "\nReprovado!!\n";
		}
		return info;
	}
	
	public double obterMedia()
	{
		double soma = 0;
		for(double nota: notas)
		{
			soma += nota;
			
		}
		return soma/4;
	}
}
