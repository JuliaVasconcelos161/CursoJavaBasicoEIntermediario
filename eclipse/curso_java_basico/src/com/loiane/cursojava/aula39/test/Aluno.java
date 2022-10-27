package com.loiane.cursojava.aula39.test;

import com.loiane.cursojava.aula39.Pessoa;

public class Aluno extends Pessoa{
	
	private String curso;
	private double[] notas;
	
	public Aluno() {
		super();
		
	}

	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public void verificarAcesso()
	{
		this.nomeVerificado = "ahsdkfj";
		super.nomeVerificado = "Jasjdkj";
		
		super.setNomeVerificado("skjgfkk");
	}
	
	public double calcularMedia()
	{
		return 0;
	}
	
	public boolean verificarAprovacao()
	{
		return true;
	}
	
	public void metodoQualquer()
	{
		super.setCpf("345456");
		
		this.setCpf("56876867");
	}
}
